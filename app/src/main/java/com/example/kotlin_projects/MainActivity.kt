package com.example.kotlin_projects
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val background = object : Thread(){
            override fun run() {
                try {
                    Thread.sleep(3000)
                    var intent=Intent(baseContext,MainDrawer::class.java)
                    startActivity(intent)
                }catch (e: Exception){
                    e.printStackTrace()
                }

            }
        }
        background.start()
    }
}
