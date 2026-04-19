package com.example.myapplication.user.data.api

import com.example.myapplication.user.data.dto.request.SignupRequest
import com.example.myapplication.user.data.dto.response.SignupResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApiService {
    @POST("api/v1/users/signup")
    suspend fun signUp(@Body request: SignupRequest): SignupResponse
}