package com.example.myapplication.user.data.repository

import com.example.myapplication.user.data.api.UserApiService
import com.example.myapplication.user.data.dto.request.SignupRequest
import com.example.myapplication.user.domain.repository.UserRepository
import jakarta.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userApiService: UserApiService
) : UserRepository {

    override suspend fun signUp(email: String, password: String): Result<Long> {
        return runCatching {
            val response = userApiService.signUp(SignupRequest(email, password))
            response.userId
        }
    }
}