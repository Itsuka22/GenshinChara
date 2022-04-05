package com.handoyo.genshinchara.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.handoyo.genshinchara.DetailActivity
import com.handoyo.genshinchara.databinding.ItemRowHeroBinding
import com.handoyo.genshinchara.model.Hero


class HeroAdapter: RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    private val listOfHero = ArrayList<Hero>()

    fun setAllData(list: List<Hero>) {
        listOfHero.apply {
            clear()
            addAll(list)
        }
        notifyDataSetChanged()
    }

    inner class HeroViewHolder(private val view: ItemRowHeroBinding): RecyclerView.ViewHolder(view.root) {
        fun bind(hero: Hero) {
            Glide.with(itemView.context)
                .load(hero.image)
                .into(view.ivHero)

            view.apply {
                tvName.text = hero.name
                tvElementName.text = hero.element
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_ID,hero.id)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = ItemRowHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(listOfHero[position])
    }

    override fun getItemCount(): Int {
        return listOfHero.size
    }
}