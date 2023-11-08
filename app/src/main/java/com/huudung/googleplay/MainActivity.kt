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

        recommend.add(item(R.drawable.deepstash, "Deepstash", "4,8⭐"))
        recommend.add(item(R.drawable.github, "GitHub", "4,6⭐"))
        recommend.add(item(R.drawable.japanese, "Japanese", "4,8⭐"))
        recommend.add(item(R.drawable.microsoftedge, "Microsoft Edge", "4,7⭐"))
        recommend.add(item(R.drawable.renshuu, "renshuu", "4,9⭐"))
        recommend.add(item(R.drawable.questionai, "Question.AI", "4,1⭐"))
        recommend.add(item(R.drawable.samnote, "Samsung Notes", "4,2⭐"))

        val education = ArrayList<item>()
        education.add(item(R.drawable.blinkist, "Blinkist", "4,8⭐"))
        education.add(item(R.drawable.duolingo, "Duolingo", "4,7⭐"))
        education.add(item(R.drawable.elsa, "Elsa Speak", "4,7⭐"))
        education.add(item(R.drawable.falou, "Falou", "4,7⭐"))
        education.add(item(R.drawable.neuronation, "NeuroNation", "4,9⭐"))
        education.add(item(R.drawable.ted, "Ted", "4,1⭐"))
        education.add(item(R.drawable.wikipedia, "Wikipedia", "4,6⭐"))

        val popular = ArrayList<item>()
        popular.add(item(R.drawable.facebook, "Facebook", "3,3⭐"))
        popular.add(item(R.drawable.locketwidget, "Locket Widget", "3,4⭐"))
        popular.add(item(R.drawable.photoroom, "PhotoRoom", "4,7⭐"))
        popular.add(item(R.drawable.tiktok, "TikTok", "4,1⭐"))
        popular.add(item(R.drawable.capcut, "CapCut", "4,2⭐"))
        popular.add(item(R.drawable.puretuber, "Pure Tuber", "4,4⭐"))
        popular.add(item(R.drawable.telegram, "Telegram", "3,5⭐"))

        val social = ArrayList<item>()
        social.add(item(R.drawable.facebook, "Facebook", "3,3⭐"))
        social.add(item(R.drawable.telegram, "Telegram", "3,5⭐"))
        social.add(item(R.drawable.x, "X", "3,5⭐"))
        social.add(item(R.drawable.tiktok, "TikTok", "4,1⭐"))
        social.add(item(R.drawable.ins, "Instagram", "3,4⭐"))
        social.add(item(R.drawable.linkedin, "LinkedIn", "4,2⭐"))

        val apps = ArrayList<ArrayItem>()
        apps.add(ArrayItem("Đề xuất cho bạn", recommend))
        apps.add(ArrayItem("Ứng dụng giáo dục", education))
        apps.add(ArrayItem("Ứng dụng phổ biến", popular))
        apps.add(ArrayItem("Mạng xã hội", social))
        val rvi = findViewById<RecyclerView>(R.id.main_rv)
        rvi.adapter = MyAdapter(apps)
        rvi.layoutManager = LinearLayoutManager(this)

    }
}