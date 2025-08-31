package ru.yandexpraktikum.all_notes.domain.interactors

import ru.yandexpraktikum.core.domain.model.Note
import ru.yandexpraktikum.core.domain.repository.NotesRepository
import javax.inject.Inject

class DeleteNoteUsecaseImpl @Inject constructor(
    private val repository: NotesRepository
): DeleteNoteUsecase {
    override suspend fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}