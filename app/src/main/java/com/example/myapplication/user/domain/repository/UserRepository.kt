package com.example.myapplication.user.domain.repository

interface UserRepository {
    suspend fun signUp(email: String, password: String): Result<Long>
}