package ru.yandexpraktikum.all_notes.di

import dagger.Binds
import dagger.hilt.InstallIn
import dagger.Module
import dagger.hilt.android.components.ViewModelComponent
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteUsecaseImpl
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteUsecase
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesUsecaseImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesUsecase

@Module
@InstallIn(ViewModelComponent::class)
interface AllNotesModule {
    @Binds
    fun bindAllNotesUsecase(impl: FetchAllNotesUsecaseImpl): FetchAllNotesUsecase

    @Binds
    fun bindDeleteNoteUsecase(impl: DeleteNoteUsecaseImpl): DeleteNoteUsecase
}