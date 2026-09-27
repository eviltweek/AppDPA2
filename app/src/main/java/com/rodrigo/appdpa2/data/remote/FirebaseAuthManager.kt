package com.rodrigo.appdpa2.data.remote

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

object FirebaseAuthManager {

    private val auth= FirebaseAuth.getInstance()
    private val firestore= FirebaseFirestore.getInstance()

    suspend fun registerUser(name: String, email: String, password: String, birthDate: String, phone: String): Result<Unit>{
        return try{
            val result=auth.createUserWithEmailAndPassword(email,password).await()
            val uid=auth.currentUser?.uid?:throw Exception("User id is null")

            val user= hashMapOf(
                "name" to name,
                "email" to email,
                "birthDate" to birthDate,
                "phone" to phone,
                "role" to "user"
            )
            firestore.collection("users").document(uid).set(user).await()

            Result.success(Unit)


        }catch (e: Exception){
            Result.failure(e)
        }
    }

    suspend fun loginUser(email: String, password: String): Result<Unit>{
        return try{
            auth.signInWithEmailAndPassword(email,password).await()
            Result.success(Unit)
        }catch (e: Exception){
            Result.failure(e)
        }
    }
}