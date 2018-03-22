package com.example.shifali.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Pizza", "McDonalds", "KFC", "Burger")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener(){
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFood.setOnClickListener {
            val newFood = addFoodText.text.toString().trim()
            if (newFood.isNotEmpty()){
                foodList.add(newFood)
            }
            else{
                Toast.makeText(this, "Add food item!", Toast.LENGTH_SHORT).show()
            }
            addFoodText.text.clear()
            println("Food list = $foodList")
        }
    }

}
