package ru.yandexpraktikum.notekeeper.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.yandexpraktikum.core.di.CoreDependencies
import ru.yandexpraktikum.core.di.DaggerCoreComponent
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideCoreDependencies(context: Context): CoreDependencies {
        return DaggerCoreComponent.builder()
            .context(context)
            .build()
    }

    @Provides
    fun provideComponentProvider(coreDependencies: CoreDependencies): ComponentProvider {
        return ComponentProvider(coreDependencies)
    }
}