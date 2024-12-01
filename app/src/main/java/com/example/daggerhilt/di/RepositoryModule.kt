package com.example.daggerhilt.di

import com.example.daggerhilt.data.repository.MyRepositoryImpl
import com.example.daggerhilt.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository

}