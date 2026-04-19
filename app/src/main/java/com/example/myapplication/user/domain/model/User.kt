package com.example.myapplication.user.domain.model

data class User(
    val userId: Long,
    val email: String,
    val accessToken: String
)
