package com.example.gameeeeee

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private var soundId1: Int = 0
    private var soundId2: Int = 0
    private var soundId3: Int = 0
    private var soundId4: Int = 0
    private var soundId5: Int = 0
    private var soundId6: Int = 0
    private var soundId7: Int = 0
    private var soundId8: Int = 0
    private var soundId9: Int = 0
    private var soundId10: Int = 0
    private var soundId11: Int = 0
    private var soundId12: Int = 0
    private var soundId13: Int = 0
    private var soundId14: Int = 0
    var play_sound_buffer = 0
    var summ_dice_one = 0
    var summ_dice_two = 0


/*lateinit var Courutine_Dice : CoroutineScope*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Найти элемент верстки (Картинка) по id. поставить на него слушатель кликов
        findViewById<ImageView>(R.id.dice_one).setOnClickListener {
            Roll()
        }
        findViewById<ImageView>(R.id.dice_two).setOnClickListener {
            Roll()
        }


        soundPool = SoundPool(1, AudioManager.STREAM_MUSIC, 0)
        soundId1 = soundPool!!.load(baseContext, R.raw.one, 1)
        soundId2 = soundPool!!.load(baseContext, R.raw.two, 1)
        soundId3 = soundPool!!.load(baseContext, R.raw.three, 1)
        soundId4 = soundPool!!.load(baseContext, R.raw.four, 1)
        soundId5 = soundPool!!.load(baseContext, R.raw.five, 1)
        soundId6 = soundPool!!.load(baseContext, R.raw.six, 1)
        soundId7 = soundPool!!.load(baseContext, R.raw.seven, 1)
        soundId8 = soundPool!!.load(baseContext, R.raw.eight, 1)
        soundId9 = soundPool!!.load(baseContext, R.raw.nine, 1)
        soundId10 = soundPool!!.load(baseContext, R.raw.ten, 1)
        soundId11 = soundPool!!.load(baseContext, R.raw.eleven, 1)
        soundId12 = soundPool!!.load(baseContext, R.raw.twelve, 1)
        soundId13 = soundPool!!.load(baseContext, R.raw.avto, 1)
        soundId14 = soundPool!!.load(baseContext, R.raw.fixsik, 1)

    }

    fun Roll(){
        var one = findViewById<ImageView>(R.id.dice_one);
        var two = findViewById<ImageView>(R.id.dice_two);

        RollOne(one)
        RollTwo(two)
    }
    fun RollOne(it: View) {
        MainScope().launch {
            var RandomNumber = Random.nextInt(1..6)
            var rotateDirection = arrayListOf(-1, 1).random()//
            var random_Buffer_XY = Random.nextBoolean()
            var rotation_Time: Long = 1
            var Dice_scale: Float = 0.005F

            for (i in 0..3) {

                RandomNumber = Random.nextInt(1..6)
                rotateDirection = arrayListOf(-1, 1).random()//
                random_Buffer_XY = Random.nextBoolean()


                if (random_Buffer_XY) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + rotateDirection
                        it.scaleX = it.scaleX + Dice_scale
                        it.scaleY = it.scaleY + Dice_scale
                        delay(rotation_Time)

                    }
                } else {
                    for (i in 0..89) {
                        it.rotationY = it.rotationY + rotateDirection
                        it.scaleX = it.scaleX + Dice_scale
                        it.scaleY = it.scaleY + Dice_scale
                        delay(rotation_Time)
                    }
                }


                findViewById<ImageView>(R.id.dice_one).setImageResource(
                    when (RandomNumber) {
                        1 -> R.drawable.one
                        2 -> R.drawable.two
                        3 -> R.drawable.three
                        4 -> R.drawable.four
                        5 -> R.drawable.five
                        6 -> R.drawable.six
                        else -> R.drawable.ic_launcher_foreground
                    }
                )

                if (random_Buffer_XY) {
                    for (i in 90..179) {
                        it.rotationX = it.rotationX + rotateDirection
                        it.scaleX = it.scaleX - Dice_scale
                        it.scaleY = it.scaleY - Dice_scale
                        delay(rotation_Time)
                    }

                } else {
                    for (i in 90..179) {
                        it.rotationY = it.rotationY + rotateDirection
                        it.scaleX = it.scaleX - Dice_scale
                        it.scaleY = it.scaleY - Dice_scale
                        delay(rotation_Time)
                    }

                }
            }
            summ_dice_one = RandomNumber
            play_sound_buffer = RandomNumber

        }
    }

    fun RollTwo(it: View) {
        MainScope().launch {

            var RandomNumber = Random.nextInt(1..6)
            var rotateDirection = arrayListOf(-1, 1).random()//
            var random_Buffer_XY = Random.nextBoolean()
            var rotation_Time: Long = 1
            var Dice_scale: Float = 0.005F

            for (i in 0..3) {

                RandomNumber = Random.nextInt(1..6)
                rotateDirection = arrayListOf(-1, 1).random()//
                random_Buffer_XY = Random.nextBoolean()

                if (random_Buffer_XY) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + rotateDirection
                        it.scaleX = it.scaleX + Dice_scale
                        it.scaleY = it.scaleY + Dice_scale
                        delay(rotation_Time)
                    }
                } else {
                    for (i in 0..89) {
                        it.rotationY = it.rotationY + rotateDirection
                        it.scaleX = it.scaleX + Dice_scale
                        it.scaleY = it.scaleY + Dice_scale
                        delay(rotation_Time)
                    }
                }


                findViewById<ImageView>(R.id.dice_two).setImageResource(
                    when (RandomNumber) {
                        1 -> R.drawable.one
                        2 -> R.drawable.two
                        3 -> R.drawable.three
                        4 -> R.drawable.four
                        5 -> R.drawable.five
                        6 -> R.drawable.six
                        else -> R.drawable.ic_launcher_foreground
                    }
                )

                if (random_Buffer_XY) {
                    for (i in 90..179) {
                        it.rotationX = it.rotationX + rotateDirection
                        it.scaleX = it.scaleX - Dice_scale
                        it.scaleY = it.scaleY - Dice_scale
                        delay(rotation_Time)
                    }

                } else {
                    for (i in 90..179) {
                        it.rotationY = it.rotationY + rotateDirection
                        it.scaleX = it.scaleX - Dice_scale
                        it.scaleY = it.scaleY - Dice_scale
                        delay(rotation_Time)
                    }

                }
            }
            summ_dice_two = RandomNumber
            play_sound_buffer = RandomNumber
            SummSound()

        }


    }

    fun SummSound()
    {
        var summ = summ_dice_one+summ_dice_two
        playSound(summ)
        if(summ_dice_one == summ_dice_two){
            playSound(14)
            Thread.sleep(6 * 1000)
            playSound(13)
        }

    }

    fun playSound(sound: Int) {
        var soundId = 0
        when (sound) {
            1 -> soundId = soundId1
            2 -> soundId = soundId2
            3 -> soundId = soundId3
            4 -> soundId = soundId4
            5 -> soundId = soundId5
            6 -> soundId = soundId6
            7 -> soundId = soundId7
            8 -> soundId = soundId8
            9 -> soundId = soundId9
            10 -> soundId = soundId10
            11 -> soundId = soundId11
            12 -> soundId = soundId12
            13 -> soundId = soundId13
            14 -> soundId = soundId14
            else -> print("Error!")
        }
        soundPool?.play(soundId, 1F, 1F, 0, 0, 1F)


    }


}