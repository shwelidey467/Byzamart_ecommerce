package com.example.byzamart.domain.models

data class CategoryDataModels(
    var id: String = "",
    var name: String = "",
    var createBy: String,
    var categoryImage: String,
    var date: Long = System.currentTimeMillis()

)