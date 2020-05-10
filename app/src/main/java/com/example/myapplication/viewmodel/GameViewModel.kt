package com.example.myapplication.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.database.GameRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class GameViewModel(application: Application) : AndroidViewModel(application) {

    private val gameRepository = GameRepo(application.applicationContext)
    private val mainScope = CoroutineScope(Dispatchers.Main)

    val game = gameRepository.getGames()
    val error = MutableLiveData<String?>()
    val success = MutableLiveData<Boolean>()

//    fun updateNote() {
//        if (isNoteValid()) {
//            mainScope.launch {
//                withContext(Dispatchers.IO) {
//                    gameRepository.updateGame(game.value!!)
//                }
//                success.value = true
//            }
//        }
//    }

//    private fun isNoteValid(): Boolean {
//        return when {
//            note.value == null -> {
//                error.value = "Note must not be null"
//                false
//            }
//            note.value!!.title.isBlank() -> {
//                error.value = "Title must not be empty"
//                false
//            }
//            else -> true
//        }
//    }

}
