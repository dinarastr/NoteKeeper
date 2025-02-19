package ru.yandexpraktikum.all_notes.di

import dagger.Binds
import dagger.hilt.InstallIn
import dagger.Module
import dagger.hilt.android.components.ViewModelComponent
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractorImpl
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractorImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor

@Module
@InstallIn(ViewModelComponent::class)
interface AllNotesModule {
    @Binds
    fun bindAllNotesInteractor(impl: FetchAllNotesInteractorImpl): FetchAllNotesInteractor

    @Binds
    fun bindDeleteNoteInteractor(impl: DeleteNoteInteractorImpl): DeleteNoteInteractor
}