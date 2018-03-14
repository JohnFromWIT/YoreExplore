package com.johnfromwit.yoreexplore.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.johnfromwit.yoreexplore.R
import com.johnfromwit.yoreexplore.models.SiteModel
import kotlinx.android.synthetic.main.activity_site.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class Site : AppCompatActivity(), AnkoLogger {

    var site = SiteModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_site)

        info("Site Activity started..")

        btnAdd.setOnClickListener() {
            site.townland = townland.text.toString()
            if (site.townland.isNotEmpty()) {
                info("add Button Pressed: ${site.townland}")
            }
            else {
                toast ("Please Enter a title")
            }
        }
    }
}
