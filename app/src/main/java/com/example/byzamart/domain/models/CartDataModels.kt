package com.example.byzamart.domain.models

data class CartDataModels(
    var id: String = "",
    var name: String = "",
    var image: String = "",
    var price: Double = 0.0,
    var quantity: Int = 0,
    var cartId: String = "",
    var size: String = "",
    var description: String = "",
    var category: String = ""
)
