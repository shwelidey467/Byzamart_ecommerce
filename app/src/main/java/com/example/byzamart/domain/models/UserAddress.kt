package com.example.byzamart.domain.models

data class UserAddress(
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val addressLine1: String = "",
    val addressLine2: String = "",
    val city: String = "",
    val state: String = "",
    val pinCode: String = "",
    val country: String = "",
)
