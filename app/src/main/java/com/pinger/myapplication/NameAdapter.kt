package com.pinger.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class NameAdapter(names: List<Name>): RecyclerView.Adapter<NameAdapter.NameViewHolder>() {
    private var names: List<Name>? = names

    override fun onCreateViewHolder(viewgroup: ViewGroup, i: Int): NameViewHolder {
        val view = LayoutInflater.from(viewgroup.getContext())
            .inflate(R.layout.name, viewgroup, false)
        return NameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return names!!.size
    }

    override fun onBindViewHolder(nameViewHolder: NameViewHolder, position: Int) {
        nameViewHolder.name!!.text = names!![position].name
        nameViewHolder.number!!.text = names!![position].number
    }

    class NameViewHolder: RecyclerView.ViewHolder {
        var name: TextView? = null
        var number: TextView? = null

        constructor(view: View):super(view) {
            this.name = itemView.findViewById(R.id.name_field)
            this.number = itemView.findViewById(R.id.number_field)
        }
    }
}
