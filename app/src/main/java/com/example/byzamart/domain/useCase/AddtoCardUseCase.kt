package com.example.byzamart.domain.useCase

import com.example.byzamart.common.ResultState
import com.example.byzamart.domain.models.CartDataModels
import com.example.byzamart.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddtoCardUseCase @Inject constructor(private val repo: Repo) {
    fun addtoCard(cartDataModels: CartDataModels): Flow<ResultState<String>> {
        return repo.addToCart(cartDataModels)
    }
}