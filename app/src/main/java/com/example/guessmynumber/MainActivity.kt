package com.example.guessmynumber

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var number: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printQuestion()

    }

    fun clickDownArrow() {

        when (number) {
            5 -> {
                guessNumber(3)
            }
            3 -> {
                guessNumber(2)
            }
            2 -> {
                guessNumber(1)
            }
            8 -> {
                guessNumber(7)
            }
            7 -> {
                guessNumber(6)
            }
        }

    }

    fun clickUpArrow() {

        when(number){
            3 -> {
                guessNumber(4)
            }
            5 -> {
                guessNumber(5)
            }
            8 -> {
                guessNumber(9)
            }
            9 -> {
                guessNumber(10)
            }
        }

    }

    fun clickSuccess() {

        tv_result.text = String.format(getString(R.string.str_success_message), number)
        tv_question.visibility = View.INVISIBLE
        tv_result.visibility = View.VISIBLE

    }

    fun resetButton() {

        number = 5
        tv_question.visibility = View.VISIBLE
        tv_result.visibility = View.INVISIBLE
        printQuestion()

    }

    private fun printQuestion(){
        tv_question.text = String.format(getString(R.string.str_question), number)
    }

    fun guessNumber(myNumber : Int){
        number = myNumber
        printQuestion()
    }

}