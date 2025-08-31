package ru.yandexpraktikum.add_note.di

import dagger.Binds
import dagger.Module
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteUsecase
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteUsecaseImpl

@Module
abstract class AddNoteModule {

    @Binds
    abstract fun bindAddNoteUsecase(impl: AddNoteUsecaseImpl): AddNoteUsecase
}