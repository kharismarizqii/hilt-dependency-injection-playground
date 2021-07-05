package com.kharismarizqii.diplayground

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideEngine(
        @ApplicationContext context: Context,
        @Named("owner") owner : String
    ) : Engine{
        return Engine(context, owner)
    }

    @Singleton
    @Provides
    @Named("owner")
    fun provideOwner() = "Kharisma"

    @Singleton
    @Provides
    @Named("string1")
    fun provideString() = "Ini adalah string yang akan diinject"

    @Singleton
    @Provides
    @Named("string2")
    fun provideString2() = "Ini adalah string kedua yang akan diinject"

}