package com.example.myapplication.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface GameDao {
    @Insert
    suspend fun insertNote(game: Game)

    @Query("SELECT * FROM Game")
    fun getGames(): LiveData<Game?>

    @Update
    suspend fun updateNote(game: Game)

    @Query("DELETE FROM GAME")
    fun remove()
}
