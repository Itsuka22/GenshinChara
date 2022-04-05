package com.handoyo.genshinchara.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commitNow
import com.handoyo.genshinchara.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportFragmentManager.commitNow(allowStateLoss = true) {
            add(R.id.about_activ, AboutFragment(), AboutFragment::class.java.simpleName)
        }
    }
}