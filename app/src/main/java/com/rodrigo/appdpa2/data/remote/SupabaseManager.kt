package com.rodrigo.appdpa2.data.remote

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.storage.Storage

object SupabaseManager {

    private const val SUPABASE_URL = "https://cyepyouievkeafzclwsk.supabase.co"
    private const val SUPABASE_ANON_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImN5ZXB5b3VpZXZrZWFmemNsd3NrIiwicm9sZSI6ImFub24iLCJpYXQiOjE3OTIyODU1NzQsImV4cCI6MjEwNzg2MTU3NH0.OBs-FOreDVz3HGYG0BEGXhByL6ztZe6EYUebvNpsG_4"

    val client = createSupabaseClient(
        supabaseUrl = SUPABASE_URL,
        supabaseKey = SUPABASE_ANON_KEY
    ) {
        install(Storage)
    }
}