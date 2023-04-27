package com.bagus.note.ui.update

import android.app.Application
import androidx.lifecycle.ViewModel
import com.bagus.note.data.MyRepository
import com.bagus.note.data.NoteEntity

class UpdateViewModel(app: Application) : ViewModel() {

    private val mNoteRepository = MyRepository(app)

    fun insertNote(note: NoteEntity) {
        mNoteRepository.insertNote(note)
    }

    fun updateNote(note: NoteEntity) {
        mNoteRepository.updateNote(note)
    }

    fun deleteNote(note: NoteEntity) {
        mNoteRepository.deleteNote(note)
    }

}