package com.example.daggerhilt.domain.repository


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
interface MyRepository {
    suspend fun doNetworkCall()
}