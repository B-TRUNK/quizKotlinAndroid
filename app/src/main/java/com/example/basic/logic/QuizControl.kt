package com.example.basic.logic

import android.widget.ImageView
import android.widget.TextView
import com.example.basic.R
import com.example.basic.data.Constant

class QuizControl {

    private val toggleQuestions = Constant.listOfQuestions
    private var questionIndex = 0

    fun getQuestion() = toggleQuestions[questionIndex]

    private fun setQuestion(tv:TextView ,iv:ImageView){

        //tv.text = "this is a question text!"
        tv.text = getQuestion().questionTitle
        //iv.setImageResource(R.drawable.ic_launcher_background)
        iv.setImageResource(getQuestion().questionImage)

    }

    fun next(tvv :TextView ,ivv :ImageView){

        if (questionIndex < toggleQuestions.lastIndex){
            questionIndex++

            setQuestion(tvv ,ivv)
        }

    }

}