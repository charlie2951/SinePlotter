package com.github.charlie2951.viewgraph
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: Button = findViewById(R.id.button)
        button1.setOnClickListener {
            //your implementation goes here
            //val textView: TextView = findViewById(R.id.textView)
            //textView.text = "Button clicked!"
            val intent= Intent(this,GraphActivity::class.java)
            startActivity(intent)

        }


    }

}
