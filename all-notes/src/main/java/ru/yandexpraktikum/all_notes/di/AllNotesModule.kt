package ru.yandexpraktikum.all_notes.di

import dagger.Binds
import dagger.Module
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteUsecase
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteUsecaseImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesUsecase
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesUsecaseImpl

@Module
abstract class AllNotesModule {

    @Binds
    abstract fun bindFetchAllNotesUsecase(impl: FetchAllNotesUsecaseImpl): FetchAllNotesUsecase

    @Binds
    abstract fun bindDeleteNoteUsecase(impl: DeleteNoteUsecaseImpl): DeleteNoteUsecase
}