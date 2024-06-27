package com.nadi.signinsignup.data.remote

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface AuthApi {



    @FormUrlEncoded
    @GET("auth/login")
    suspend fun register(
        @Field("email") email: String,
        @Field("password") password: String
    )

}