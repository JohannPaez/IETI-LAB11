package com.iet.myfirstapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TextActivity:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_send)
        onLoad();
    }

    fun onLoad() {
        var extraText = intent.getStringExtra("text");
        var elementTextId: TextView =  findViewById(R.id.idTextView);
        elementTextId.text = extraText;
    }


}