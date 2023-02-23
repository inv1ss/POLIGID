package com.example.myapplication


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.RecycleviewItemBinding
import com.google.android.material.internal.ContextUtils.getActivity

class SearchAdapter: RecyclerView.Adapter<SearchAdapter.SearchHolder>() {
    private val searchList= ArrayList<Search>()
    private var txt=-1

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

    @SuppressLint("RestrictedApi")
    override fun onBindViewHolder(holder: SearchHolder, position: Int) {
        holder.bind(searchList[position])
        val context = holder.itemView.context

        holder.binding.button.setOnClickListener {
            when(position){
                0 -> txt="-1".toInt()
                1 -> txt="2".toInt()
                2 -> txt="3".toInt()
                3 -> txt="-4".toInt()
                4 -> txt="5".toInt()
                5 -> txt="6".toInt()
                6 -> txt="7".toInt()
                7 -> txt="-8".toInt()
                8 -> txt="119".toInt()
                9 -> txt="307".toInt()
                10 -> txt="102".toInt()
                11 -> txt="123".toInt()
                12 -> txt="210".toInt()
                13 -> txt="106".toInt()
                14 -> txt="216".toInt()
                15 -> txt="-2".toInt()
                16 -> txt="-3".toInt()
                17 -> txt="1".toInt()
            }

            (getActivity(context) as SearchActivity).finishAct(txt)
        }
    }

    override fun getItemCount(): Int {
        return searchList.size
    }


    @SuppressLint("NotifyDataSetChanged")
    fun createList(list : List<Search>)
    {
        searchList.clear()
        searchList.addAll(list)
        notifyDataSetChanged()
    }


}