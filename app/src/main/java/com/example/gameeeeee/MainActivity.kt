package com.example.gameeeeee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.coroutines.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

/*lateinit var Courutine_Dice : CoroutineScope*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.dice).setOnClickListener {
          /*  if(Courutine_Dice.isActive)*/
           /* Courutine_Dice =*/ MainScope().launch {


                var rotateDirection = arrayListOf(-1,1).random()
                var random_Buffer = Random.nextBoolean()
                var rotation_Time:Long = 1
                if (random_Buffer) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + rotateDirection
                        delay(rotation_Time)
                    }
                } else {
                    for (i in 0..89) {
                        it.rotationY = it.rotationY + rotateDirection
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

                if (random_Buffer) {
                    for (i in 90..179) {
                        it.rotationX = it.rotationX + rotateDirection
                        delay(rotation_Time)
                    }
                } else {
                    for (i in 90..179) {
                        it.rotationY = it.rotationY + rotateDirection
                        delay(rotation_Time)
                    }
                }

            }
        }
    }
}