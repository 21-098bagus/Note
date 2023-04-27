package com.bagus1.note.ui.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bagus.note.data.MyRepository
import com.bagus.note.data.NoteEntity

class HomeViewModel(app: Application) : ViewModel() {
    private val mNoteRepository = MyRepository(app)
    fun getAllNotes(): LiveData<List<NoteEntity>> = mNoteRepository.getAllNotes()
}