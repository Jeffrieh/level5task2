package com.example.myapplication.database


import android.content.Context
import androidx.lifecycle.LiveData
import com.example.myapplication.database.Game

class GameRepo(context: Context) {

    private val gameDao: GameDao

    init {
        val database = GameDatabase.getDatabase(context)
        gameDao = database!!.noteDao()
    }

    fun getGames(): LiveData<Game?> {
        return gameDao.getGames()
    }

    suspend fun updateNotepad(game: Game) {
        gameDao.updateNote(game)
    }

}
