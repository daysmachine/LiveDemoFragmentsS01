package com.example.livedemo_fragmentss01

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val funFragment = this.supportFragmentManager.findFragmentById(R.id.primary_fragment_frame)
        if ( funFragment == null ) {
            val fragment = MyFunFragment()

            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.primary_fragment_frame, fragment)
                .commit()
        }

        if ( this.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE ) {

            val infoFragment = this.supportFragmentManager.findFragmentById(R.id.secondary_fragment_frame)
            if ( infoFragment == null ) {
                val fragment = MyInfoFragment()

                this.supportFragmentManager
                    .beginTransaction()
                    .add(R.id.secondary_fragment_frame, fragment)
                    .commit()
            }

        }
    }
}