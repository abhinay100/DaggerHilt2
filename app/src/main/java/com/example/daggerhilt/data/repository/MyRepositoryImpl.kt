package com.example.daggerhilt.data.repository

import android.app.Application
import android.content.Context
import com.example.daggerhilt.R
import com.example.daggerhilt.data.remote.MyApi
import com.example.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository! The app name is $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}