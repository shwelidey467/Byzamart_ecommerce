package com.example.byzamart.domain.useCase

import com.example.byzamart.common.ResultState
import com.example.byzamart.domain.models.CartDataModels
import com.example.byzamart.domain.models.ProductDataModels
import com.example.byzamart.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddToFavouriteUseCase @Inject constructor(private val repo: Repo) {
    fun addToFavourite(productDataModels: ProductDataModels): Flow<ResultState<String>> {
        return repo.addToFavourite(productDataModels)
    }
}