package com.handoyo.genshinchara.util

import com.handoyo.genshinchara.model.Hero

object CharaheroData {


    fun getAllHeros(): List<Hero> = arrayListOf<Hero>(
        Hero(
            1,
            "Diluc",
            "Pyro",
            "As the wealthiest gentleman in Mondstadt, the ever-dapper Diluc always presents " +
                    "himself as the epitome of perfection.\n" +
                    "\n" +
                    "But behind the courteous visage burns a zealous soul that has sworn to protect Mondstadt at all costs, " +
                    "allowing him to mercilessly vanquish all who threaten his city.",

            "https://paimon.moe/images/characters/diluc.png"


        ),

        Hero(
            2,
            "Yae Miko",
            "Electro",
            "The head shrine maiden in charge of Grand Narukami Shrine and a descendant of Kitsune lineage, Eternity's servant and f" +
                    "riend, and the intimidating editor-in-chief of Yae Publishing House, a publisher of light novels..." +
                    "The enigmatic Guuji, with many identities, may never be fully understood by mortals for what she " +
                    "truly is in her heart of hearts.",

            "https://paimon.moe/images/characters/yae_miko.png"
        ),

        Hero(
            3,
            "Yoimiya",
            "Pyro",
            "A talented pyrotechnician. The current owner of" +
                    " Naganohara Fireworks known as the \"Queen of the Summer Festival.\"\n" +
                    "A girl filled with fiery passion. The uncompromising childish innocence and " +
                    "the obsession with craftsmanship intertwine in her to create a spectacular blaze.",

            "https://paimon.moe/images/characters/yoimiya.png"
        ),

        Hero(
            4,
            "Raiden Shogun",
            "Electro",
            "The Raiden Shogun is the awesome and terrible power of thunder incarnate, the exalted ruler of the Inazuma Shogunate.",

            "https://paimon.moe/images/characters/raiden_shogun.png"
        ),

        Hero(
            5,
            "Hu Tao",
            "Pyro",
            "Hu Tao is the 77th Director of the Wangsheng Funeral Parlor, a person vital to managing Liyue's funerary affairs.\n" +
                    "She does her utmost to flawlessly carry out a person's last rites and preserve the world's balance of yin and yang.\n" +
                    "Aside from this, she is also a talented poet whose many \"masterpieces\" have passed around Liyue's populace by word of mouth.",

            "https://paimon.moe/images/characters/hu_tao.png"
        ),

        Hero(
            6,
            "Qiqi",
            "Cyro",
            "An apprentice and herb gatherer at Bubu Pharmacy.\n" +
                    "\"Blessed\" by the adepti with a body that cannot die, this petite zombie cannot do anything without first giving herself orders to do it.\n" +
                    "Qiqi‘s memory is like a sieve. Out of necessity, she always carries around a notebook in which she writes " +
                    "anything important that she is sure to forget later.\n" +
                    "But on her worst days, she even forgets to look at her notebook...",

            "https://paimon.moe/images/characters/qiqi.png"
        ),

        Hero(
            7,
            "Eula",
            "Cyro",
            "A Rebellious descendant of the old aristocracy who is always out on the battlefield.\n" +
                    "As one born into the old aristocracy, carrying the bloodline of sinners, Eula has needed a unique approach to the world to navigate the " +
                    "towering walls of prejudice peacefully. Of course, this did not prevent her from severing " +
                    "ties with her clan. As the outstanding Spindrift Knight, she hunts down Mondstadt's enemies in the wild to exact her unique \"vengeance\".",

            "https://paimon.moe/images/characters/eula.png"
        ),

        Hero(
            8,
            "Venti",
            "Anemo",
            "A bard that seems to have arrived on some unknown wind — sometimes sing songs as old as the hills, and other times sing poems fresh and new.\n" +
                    "Likes apples and lively places, but is not a fan of cheese or anything sticky.\n" +
                    "When using his Anemo power to control the wind, it often appears as feathers, as he's fond of that which appears light and breezy.",

            "https://paimon.moe/images/characters/venti.png"
        ),

        Hero(
            9,
            "Keqing",
            "Electro",
            "The Yuheng of the Liyue Qixing. Keqing has much to say about Rex Lapis' unilateral approach to policymaking in Liyue \u2060— " +
                    "but in truth, gods admire skeptics such as her quite a lot.\n" +
                    "She firmly believes that humanity's future should be determined by humans themselves, and that they " +
                    "can even do better than the archons and adepti have done for them. In order to prove this, she works harder than anyone else.",

            "https://paimon.moe/images/characters/keqing.png"
        ),

        Hero(
            10,
            "Klee",
            "Pyro",
            "Knights of Favonius Spark Knight! Forever with a bang and a flash!\n" +
                    "—And then disappearing from the stern gaze of Acting Grand Master Jean.\n" +
                    "Sure, time in solitary confinement gives lots of time to think about new gunpowder formulas...\n" +
                    "But it'd still be better to not be in solitary in the first place.\n" +
                    "\n",

            "https://paimon.moe/images/characters/klee.png"
        )
    )

    fun getHeroDetail(id: Int): Hero? {
        getAllHeros().forEach { Hero ->
            if (Hero.id == id) {
                return Hero
            }
        }
        return null
    }
}
