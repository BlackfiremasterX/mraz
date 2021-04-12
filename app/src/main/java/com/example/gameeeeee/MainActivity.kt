package com.example.gameeeeee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.lang.Math.random
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

/*lateinit var Courutine_Dice : CoroutineScope*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<ImageView>(R.id.dice).setOnClickListener {
            /*  if(Courutine_Dice.isActive)*/
            /* Courutine_Dice =*/ MainScope().launch {


            var rotateDirection = arrayListOf(-1, 1).random()//
            var random_Buffer_XY = Random.nextBoolean()
            var rotation_Time: Long = 1
            var NumberOfRotations_begin = Random.nextInt(1..2)
            var NumberOfRotations_end = Random.nextInt(5..7)
            var Dice_scale:Float = 0.005F
//            begin.text = NumberOfRotations_begin.toString()
//            end.text = NumberOfRotations_end.toString()



            for (i in NumberOfRotations_begin..NumberOfRotations_end) {

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




                findViewById<ImageView>(R.id.dice).setImageResource(
                    when ((1..6).random()) {
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

        }
        }
    }
}