package com.kjy.kotlingrammer

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory


// 공개 겍체 선언후 Retrofit 서비스 초기화
object MarsApi {

    // Retrofit 객체 생성
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(Const.BASE_URL)
        .build()

    // retrofitService 변수 초기화
    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}