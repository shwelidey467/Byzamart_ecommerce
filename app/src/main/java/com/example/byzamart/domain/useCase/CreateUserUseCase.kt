package com.example.byzamart.domain.useCase

import com.example.byzamart.common.ResultState
import com.example.byzamart.domain.models.UserData
import com.example.byzamart.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreateUserUseCase  @Inject constructor(private val repo: Repo){
    fun createUser( userData: UserData): Flow<ResultState<String>> {
        return repo.registerUserWithEmailAndPassword(userData)
    }
}