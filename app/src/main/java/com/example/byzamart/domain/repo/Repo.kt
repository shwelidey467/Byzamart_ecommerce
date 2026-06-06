package com.example.byzamart.domain.repo

import android.net.Uri
import com.example.byzamart.common.ResultState
import com.example.byzamart.domain.models.BannerDataModels
import com.example.byzamart.domain.models.CartDataModels
import com.example.byzamart.domain.models.CategoryDataModels
import com.example.byzamart.domain.models.ProductDataModels
import com.example.byzamart.domain.models.UserData
import com.example.byzamart.domain.models.UserDataParent
import com.google.firebase.firestore.auth.User
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun registerUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun loginUserWithEmailAndPassword(userData:UserData): Flow<ResultState<String>>
    fun getuserById(userId: String): Flow<ResultState<String>>
    fun updateUserProfile(userDataParent: UserDataParent): Flow<ResultState<String>>
    fun userProfileImage(uri: Uri): Flow<ResultState<String>>
    fun getCategoriesInLimited(): Flow<ResultState<CategoryDataModels>>
    fun getProductsInLimited(): Flow<ResultState<ProductDataModels>>
    fun getAllProducts(): Flow<ResultState<List<ProductDataModels>>>
    fun getProductById(productId: String): Flow<ResultState<ProductDataModels>>
    fun addToCart(cartDataModels: CartDataModels): Flow<ResultState<String>>
    fun addToFavorite(productDataModels: ProductDataModels): Flow<ResultState<String>>
    fun getallFavorite(): Flow<ResultState<List<ProductDataModels>>>
    fun getCart(): Flow<ResultState<List<CartDataModels>>>
    fun getAllCategories(): Flow<ResultState<List<CategoryDataModels>>>
    fun getCheckout(productId: String): Flow<ResultState<ProductDataModels>>
    fun getBanner(): Flow<ResultState<List<BannerDataModels>>>
    fun getSpecificCategory(categoryName: String): Flow<ResultState<List<ProductDataModels>>>
    fun getAllSuggestedProducts(): Flow<ResultState<List<ProductDataModels>>>
    fun logoutUser(): Flow<ResultState<String>>
    fun addToFavourite(productDataModels: ProductDataModels): Flow<ResultState<String>>
    fun getAllCategory(): Flow<ResultState<List<CategoryDataModels>>>

}