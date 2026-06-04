package com.example.byzamart.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class ProductDataModels(
    var id: String = "",
    var name: String = "",
    var image: String = "",
    var price: Double = 0.0,
    var description: String = "",
    var category: String = "",
    var size: List<String> = emptyList(),
    var date: Long = System.currentTimeMillis(),
    val createBy: String = "",
    val finalPrice: Double = 0.0,
    val availableUnits: Int = 0,
    val discount: Double = 0.0,
    val rating: Double = 0.0,
    val reviewCount: Int = 0,
    val productId: String = ""
)
