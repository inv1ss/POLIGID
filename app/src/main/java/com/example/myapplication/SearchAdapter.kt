package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.RecycleviewItemBinding

class SearchAdapter: RecyclerView.Adapter<SearchAdapter.SearchHolder>() {
    val searchList= ArrayList<Search>()

    class SearchHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = RecycleviewItemBinding.bind(item)
        fun bind(search:Search)=with(binding){
            button.text=search.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item, parent, false)
        return SearchHolder(view)
    }

    override fun onBindViewHolder(holder: SearchHolder, position: Int) {
        holder.bind(searchList[position])
        var txt="-1"

        holder.binding.button.setOnClickListener(){
            when(position){
                0 -> txt="1"
                1 -> txt="2"
                2 -> txt="3"
                3 -> txt="4"
                4 -> txt="5"
                5 -> txt="6"
                6 -> txt="7"
                7 -> txt="8"
                8 -> txt="9"
                9 -> txt="10"
            }
        }
    }

    override fun getItemCount(): Int {
        return searchList.size
    }


    fun createList(list : List<Search>)
    {
        searchList.clear()
        searchList.addAll(list)
        notifyDataSetChanged()
    }

}