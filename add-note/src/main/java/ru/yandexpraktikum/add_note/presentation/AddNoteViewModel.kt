package ru.yandexpraktikum.add_note.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteUsecase
import ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper
import ru.yandexpraktikum.core.presentation.model.NoteUi

class AddNoteViewModel(
    private val addNoteUsecase: AddNoteUsecase,
    private val noteMapper: PresentationNoteMapper
): ViewModel() {

    fun insertNote(note: NoteUi) {
        viewModelScope.launch {
            addNoteUsecase((noteMapper.mapToDomain(note)))
        }
    }
}