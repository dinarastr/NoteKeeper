package ru.yandexpraktikum.add_note.domain.interactors

import ru.yandexpraktikum.core.domain.model.Note
import ru.yandexpraktikum.core.domain.repository.NotesRepository
import javax.inject.Inject

class AddNoteUsecaseImpl @Inject constructor(
    private val repository: NotesRepository
): AddNoteUsecase {
    override suspend fun invoke(note: Note) {
        repository.insertNote(note)
    }
}