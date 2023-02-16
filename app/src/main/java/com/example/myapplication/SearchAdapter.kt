package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
    }

    override fun getItemCount(): Int {
        return searchList.size
    }

    fun addSearchButton(search : Search){
        searchList.add(search)
        notifyDataSetChanged()
    }

}