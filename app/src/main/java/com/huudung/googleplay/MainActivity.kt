package com.huudung.googleplay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recommend = ArrayList<item>()

        recommend.add(item(androidx.constraintlayout.widget.R.drawable.abc_btn_check_to_on_mtrl_000, "ABC", "4"))

        val itemss = ArrayList<ArrayItem>()
        itemss.add(ArrayItem("recommend", recommend))

        val rvi = findViewById<RecyclerView>(R.id.main_rv)
        rvi.adapter = MyAdapter(itemss)
        rvi.layoutManager = LinearLayoutManager(this)

    }
}