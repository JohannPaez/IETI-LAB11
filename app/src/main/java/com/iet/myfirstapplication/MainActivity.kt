package com.iet.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //this.supportActionBar ?.hide()
        setContentView(R.layout.activity_main)
    }

    fun handleSubmitButton(view: View) {
        var elementTextId: EditText =  findViewById(R.id.idTextEYM);
        var messageText = elementTextId.text.toString();
        var changeView = Intent(this, TextActivity:: class.java);
        changeView.putExtra("text", messageText);
        startActivity(changeView);
    }
}