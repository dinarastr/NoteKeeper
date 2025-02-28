package ru.yandexpraktikum.add_note.domain.interactors

import ru.yandexpraktikum.core.domain.model.Note

interface AddNoteUsecase {
    suspend operator fun invoke(note: Note)
}