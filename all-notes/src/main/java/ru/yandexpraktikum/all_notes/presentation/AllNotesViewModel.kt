package ru.yandexpraktikum.all_notes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteUsecase
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesUsecase
import ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper
import ru.yandexpraktikum.core.presentation.model.NoteUi

class AllNotesViewModel(
    private val fetchAllNotesUsecase: FetchAllNotesUsecase,
    private val deleteNoteUsecase: DeleteNoteUsecase,
    private val noteMapper: PresentationNoteMapper
) : ViewModel() {

    val allNotes = fetchAllNotesUsecase().map { list ->
        list.map { noteMapper.mapToUi(it) }
    }

    fun deleteNote(note: NoteUi) {
        viewModelScope.launch {
            deleteNoteUsecase(
                noteMapper.mapToDomain(note)
            )
        }
    }
}