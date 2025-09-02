package ru.yandexpraktikum.notekeeper.di

import ru.yandexpraktikum.add_note.di.AddNoteComponent
import ru.yandexpraktikum.add_note.di.DaggerAddNoteComponent
import ru.yandexpraktikum.all_notes.di.AllNotesComponent
import ru.yandexpraktikum.all_notes.di.DaggerAllNotesComponent
import ru.yandexpraktikum.core.di.CoreDependencies
import javax.inject.Inject

class ComponentProvider @Inject constructor(
    private val coreDependencies: CoreDependencies
) {

    private var allNotesComponent: AllNotesComponent? = null
    private var addNoteComponent: AddNoteComponent? = null

    fun initAllNotesComponent(): AllNotesComponent {
        if (allNotesComponent == null) {
            allNotesComponent = DaggerAllNotesComponent.builder()
                .dependencies(coreDependencies)
                .build()
        }
        return allNotesComponent ?: throw IllegalStateException("AllNotesComponent failed to initialize")
    }

    fun initAddNoteComponent(): AddNoteComponent {
        if (addNoteComponent == null) {
            addNoteComponent = DaggerAddNoteComponent.builder()
                .dependencies(coreDependencies)
                .build()
        }
        return addNoteComponent ?: throw IllegalStateException("AddNoteComponent failed to initialize")
    }

    fun clearAllNotesComponent() {
        allNotesComponent = null
    }

    fun clearAddNoteComponent() {
        addNoteComponent = null
    }
}