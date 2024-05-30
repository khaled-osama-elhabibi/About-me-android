package com.kha.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.kha.aboutme.databinding.ActivityMainBinding
import com.kha.aboutme.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding
//    private var myName = MyName("KHALED ELHABIBI")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second)
        setLisnter()
//        binding.doneButton.setOnClickListener {
//            addNickName(it)
//        }
//        binding.myName = myName
    }
    private fun setLisnter (){
        binding.apply {
            val clickableViews: List<View> = listOf(
                boxOneText,
                boxTwoText,
                boxThreeText,
                boxFourText,
                boxFiveText,
                greenButton,
                redButton,
                yellowButton
            )
            for (view in clickableViews) {
                view.setOnClickListener{
                    makeColored(it)
                }
            }

        }
    }
    private fun makeColored (item:View)
    {
        when(item.id){
            R.id.red_button -> binding.boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> binding.boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> binding.boxFiveText.setBackgroundResource(R.color.my_green)
        }


    }//    private fun addNickName(view: View) {
//        binding.apply {
//            invalidateAll()
//            myName?.nickname = nicknameEdit.text.toString()
//            nicknameText.visibility = View.VISIBLE
//            nicknameEdit.visibility = View.GONE
//            doneButton.visibility = View.GONE
//        }
//    }
}