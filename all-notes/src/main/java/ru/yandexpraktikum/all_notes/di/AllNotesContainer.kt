package ru.yandexpraktikum.all_notes.di

import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteUsecaseImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesUsecaseImpl
import ru.yandexpraktikum.all_notes.presentation.AllNotesViewModelFactory
import ru.yandexpraktikum.core.domain.repository.NotesRepository
import ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper


class AllNotesContainer(
    private val repository: NotesRepository,
    private val presentationMapper: PresentationNoteMapper
) {

    private val fetchAllNotesUsecase by lazy {
        FetchAllNotesUsecaseImpl(repository)
    }

    private val deleteNoteUsecase by lazy {
        DeleteNoteUsecaseImpl(repository)
    }

    fun getAllNotesViewModelFactory() = AllNotesViewModelFactory(
        fetchAllNotesUsecase,
        deleteNoteUsecase,
        presentationMapper
    )
}