package com.example.basic

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.basic.R
import com.example.basic.logic.QuizControl
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : ComponentActivity() , OnClickListener {

    lateinit var questionTitle : TextView
    lateinit var questionImage : CircleImageView
    lateinit var yesBtn        : Button
    lateinit var noBtn         : Button
    lateinit var nxtBtn        : Button

    //new instance of QuizControl Class
    val quizControl = QuizControl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTitle = findViewById(R.id.question_title)
        questionImage = findViewById(R.id.question_image)
        yesBtn         = findViewById(R.id.yes_btn)
        noBtn          = findViewById(R.id.no_btn)
        nxtBtn         = findViewById(R.id.nxt_btn)

        yesBtn.setOnClickListener(this)
        noBtn.setOnClickListener(this)
        nxtBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        when(view?.id){

            R.id.yes_btn -> {
                Toast.makeText(this, "yes Btn Clicked", Toast.LENGTH_SHORT).show()
            }

            R.id.no_btn -> {
                Toast.makeText(this, "no Btn Clicked", Toast.LENGTH_SHORT).show()
            }

            R.id.nxt_btn -> {
                //Toast.makeText(this, "next Btn Clicked", Toast.LENGTH_SHORT).show()
                //quizControl.setQuestion(questionTitle ,questionImage)
                quizControl.next(questionTitle ,questionImage)
            }

        }
    }
}
