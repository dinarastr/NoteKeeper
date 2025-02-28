package ru.yandexpraktikum.all_notes.domain.interactors

import kotlinx.coroutines.flow.Flow
import ru.yandexpraktikum.core.domain.model.Note
import ru.yandexpraktikum.core.domain.repository.NotesRepository
import javax.inject.Inject

class FetchAllNotesUsecaseImpl @Inject constructor(
    private val repository: NotesRepository
): FetchAllNotesUsecase {
    override fun invoke(): Flow<List<Note>> {
        return repository.getAllNotes()
    }
}