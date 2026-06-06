package com.example.byzamart.domain.useCase

import com.example.byzamart.common.ResultState
import com.example.byzamart.domain.models.CategoryDataModels
import com.example.byzamart.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllCategoryUseCase @Inject constructor(private val repo: Repo) {
    fun getAllCategoryUseCase(): Flow<ResultState<List<CategoryDataModels>>> {
        return repo.getAllCategory()
    }
}