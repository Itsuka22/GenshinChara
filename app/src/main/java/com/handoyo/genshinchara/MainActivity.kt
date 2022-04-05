package com.handoyo.genshinchara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.recyclerview.widget.GridLayoutManager
import com.handoyo.genshinchara.about.AboutActivity
import com.handoyo.genshinchara.adapter.HeroAdapter
import com.handoyo.genshinchara.databinding.ActivityMainBinding
import com.handoyo.genshinchara.util.CharaheroData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var heroAdapter: HeroAdapter
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        val splashScreen = installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        heroAdapter = HeroAdapter()
        heroAdapter.setAllData(CharaheroData.getAllHeros())


        binding.rvHero.apply {
            adapter = heroAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 2)
        }
//        splashScreen.setKeepOnScreenCondition { true }
//        MainActivity()
//        finish()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_about-> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}