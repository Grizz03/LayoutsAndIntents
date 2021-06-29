package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

/** Extend AppCompatActivity which tells system that this is an activity.
 * You can pass your layout as a parameter of AppCompatActivity
 */

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // You can check log messages in the logcat.
        Log.d(TAG, "onCreate() called")

//        You can pass your layout in setContentView in onCreate
//        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        btn.setOnClickListener {
            Log.d(TAG, "button clicked")
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
    }

    companion object {
        private val TAG = MainActivity::class.java.name
    }
}