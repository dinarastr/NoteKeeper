package ru.yandexpraktikum.all_notes.domain.interactors

import ru.yandexpraktikum.core.domain.model.Note

interface DeleteNoteUsecase {
    suspend operator fun invoke(note: Note)
}