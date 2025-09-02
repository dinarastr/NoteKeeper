package ru.yandexpraktikum.add_note.di

import dagger.Binds
import dagger.Module
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteUsecase
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteUsecaseImpl

@Module
interface AddNoteModule {

    @Binds
    fun bindAddNoteUsecase(impl: AddNoteUsecaseImpl): AddNoteUsecase
}