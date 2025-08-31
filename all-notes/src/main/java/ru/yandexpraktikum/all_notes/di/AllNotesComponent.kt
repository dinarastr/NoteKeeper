package ru.yandexpraktikum.all_notes.di

import dagger.Component
import ru.yandexpraktikum.all_notes.presentation.AllNotesViewModelFactory
import ru.yandexpraktikum.core.di.CoreDependencies

@AllNotesScope
@Component(
    modules = [AllNotesModule::class],
    dependencies = [CoreDependencies::class]
)
interface AllNotesComponent {

    fun allNotesViewModelFactory(): AllNotesViewModelFactory

    @Component.Builder
    interface Builder {
        fun dependencies(dependencies: CoreDependencies): Builder
        fun build(): AllNotesComponent
    }
}