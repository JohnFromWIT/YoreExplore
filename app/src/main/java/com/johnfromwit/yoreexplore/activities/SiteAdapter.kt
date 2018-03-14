package com.johnfromwit.yoreexplore.activities

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.collections.List

import kotlinx.android.synthetic.main.card_layout.view.*
import com.johnfromwit.yoreexplore.R
//import com.johnfromwit.yoreexplore.helpers.readImageFromPath
import com.johnfromwit.yoreexplore.models.SiteModel


/**
 * Created by chris on 06/02/2018.
 */
interface SiteListener {
    fun onSiteClick(site: SiteModel)
}

class SiteAdapter constructor(private var sites: List<SiteModel>,
                                  private val listener: SiteListener) : RecyclerView.Adapter<SiteAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent?.context).inflate(R.layout.card_layout, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val site = sites[holder.adapterPosition]
        holder.bind(site, listener)
    }

    override fun getItemCount(): Int = sites.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(site: SiteModel, listener: SiteListener) {
            itemView.townland.text = site.townland
            itemView.county.text = site.county
//            itemView.imageIcon.setImageBitmap(readImageFromPath(itemView.context, site.picture))
            itemView.setOnClickListener { listener.onSiteClick(site) }
        }
    }
}