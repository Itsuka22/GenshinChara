package com.handoyo.genshinchara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

import com.handoyo.genshinchara.databinding.ActivityDetailBinding
import com.handoyo.genshinchara.util.CharaheroData

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID = "ID"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra(EXTRA_ID, 0)
        val selectedPlant = CharaheroData.getHeroDetail(id)

        binding.apply {
            Glide.with(this@DetailActivity)
                .load(selectedPlant?.image)
                .into(imageHero)
            nameHero.text = selectedPlant?.name
            detailHero.text = selectedPlant?.detail


        }
    }



}