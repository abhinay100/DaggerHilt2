package com.example.daggerhilt

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhilt.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
@AndroidEntryPoint
class MyService : Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()

        //repository.doNetworkCall()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}