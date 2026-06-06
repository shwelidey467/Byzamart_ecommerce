package com.example.byzamart.domain.models

import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf

data class UserData(
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val password: String = "",
    val phoneNumber: String = "",
    val profilePicture: String = "",
){
    fun toMap():Map<String,Any>{
        val map = mutableStateMapOf<String,Any>()
        map["firstName"] = firstName
        map["lastName"] = lastName
        map["email"] = email
        map["password"] = password
        map["phoneNumber"] = phoneNumber
        map["profilePicture"] = profilePicture
        return map
    }
}
data class UserDataParent(
    val nodeId: String = "",
    val userData: UserData = UserData()
)
