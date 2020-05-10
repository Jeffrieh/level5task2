package com.example.myapplication.adapters

import com.example.myapplication.database.Game

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.item.view.*

class gamesAdapter(private val games: List<Game>) :
    RecyclerView.Adapter<gamesAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return games.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(games[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(games: Game) {
            itemView.txtView_title.text = "tiiitleeeeee"
//            itemView.quiz_title.text = question.question
//            itemView.setOnClickListener { onClick(question)  }
        }

//        fun onClick(question: Question){
//            val snack = Snackbar.make(itemView, "This Question is : ${question.answer}", 2000)
//            snack.show()
//        }
    }

}