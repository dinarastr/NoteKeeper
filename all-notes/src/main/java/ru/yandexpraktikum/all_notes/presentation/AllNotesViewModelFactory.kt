package ru.yandexpraktikum.all_notes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteUsecase
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesUsecase
import ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper

class AllNotesViewModelFactory(
    private val fetchAllNotesUsecase: FetchAllNotesUsecase,
    private val deleteNoteUsecase: DeleteNoteUsecase,
    private val noteMapper: PresentationNoteMapper
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AllNotesViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AllNotesViewModel(fetchAllNotesUsecase, deleteNoteUsecase, noteMapper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}