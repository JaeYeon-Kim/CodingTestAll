package com.kjy.kotlingrammer

import retrofit2.http.GET

// 통신에 필요한 interface
interface MarsApiService {
    // 웹 서비스에서 응답 문자열을 가져옴
    @GET("photos")
    suspend fun getPhotos(): String
}