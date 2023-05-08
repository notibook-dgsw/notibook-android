package com.example.book.repository.module

import com.example.book.repository.BookRepository
import com.example.book.repository.SignRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideBookRepository() : BookRepository {
        return BookRepository()
    }

    @Provides
    @Singleton
    fun provideSignRepository() : SignRepository {
        return SignRepository()
    }
}