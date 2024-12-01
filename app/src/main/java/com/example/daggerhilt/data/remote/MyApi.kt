package com.example.daggerhilt.data.remote

import retrofit2.http.GET


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
interface MyApi {

    @GET("test")
    suspend fun doNetworkCall()
}