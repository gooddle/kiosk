package com.example.myapplication.user.domain.usecase

import com.example.myapplication.user.domain.repository.UserRepository
import jakarta.inject.Inject

class SignUpUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(email: String, password: String): Result<Long> {
        return userRepository.signUp(email, password)
    }
}