package ru.yandexpraktikum.add_note.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteUsecase
import ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper
import javax.inject.Inject

class AddNoteViewModelFactory @Inject constructor(
    private val addNoteUsecase: AddNoteUsecase,
    private val noteMapper: PresentationNoteMapper
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddNoteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AddNoteViewModel(addNoteUsecase, noteMapper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}