package com.johnfromwit.yoreexplore.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import com.johnfromwit.yoreexplore.R
import com.johnfromwit.yoreexplore.main.MainApp
import com.johnfromwit.yoreexplore.models.SiteModel
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.card_layout.view.*
import org.jetbrains.anko.startActivityForResult

class SiteList : AppCompatActivity() {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        app = application as MainApp

//        toolbarMain.title = title
//        setSupportActionBar(toolbarMain)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = SiteAdapter(app.sites)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_add -> startActivityForResult<Site>(AppCompatActivity.RESULT_OK)
        }
        return super.onOptionsItemSelected(item)
    }

    class SiteAdapter constructor(private var sites: List<SiteModel>) : RecyclerView.Adapter<SiteAdapter.MainHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainHolder {
            return MainHolder(LayoutInflater.from(parent?.context).inflate(R.layout.card_layout, parent, false))
        }

        override fun onBindViewHolder(holder: MainHolder, position: Int) {
            val site = sites[holder.adapterPosition]
            holder.bind(site)
        }

        override fun getItemCount(): Int = sites.size

        class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

            fun bind(site: SiteModel) {
                itemView.townland.text = site.townland
                itemView.county.text = site.county
            }
        }
    }
}
