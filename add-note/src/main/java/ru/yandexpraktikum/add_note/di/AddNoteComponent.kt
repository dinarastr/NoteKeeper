package ru.yandexpraktikum.add_note.di

import dagger.Component
import ru.yandexpraktikum.add_note.presentation.AddNoteViewModelFactory
import ru.yandexpraktikum.core.di.CoreDependencies

@AddNoteScope
@Component(
    modules = [AddNoteModule::class],
    dependencies = [CoreDependencies::class]
)
interface AddNoteComponent {

    fun addNoteViewModelFactory(): AddNoteViewModelFactory

    @Component.Builder
    interface Builder {
        fun dependencies(dependencies: CoreDependencies): Builder
        fun build(): AddNoteComponent
    }
}