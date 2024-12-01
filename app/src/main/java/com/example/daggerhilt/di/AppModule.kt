package com.example.daggerhilt.di

import android.app.Application
import com.example.daggerhilt.data.remote.MyApi
import com.example.daggerhilt.data.repository.MyRepositoryImpl
import com.example.daggerhilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Named
import javax.inject.Singleton


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    /*@Provides
    @Singleton
    fun provideMyRepository(api: MyApi,
                            app: Application,
                            @Named("hello1") hello1: String): MyRepository {
        return MyRepositoryImpl(api, app)
    }*/

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"

}