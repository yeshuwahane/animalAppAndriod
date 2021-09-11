package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity(),ListListner {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val intent = intent.extras

        var data = intent?.getString("data")
        if (data != null) {
            Log.d("data",data)
        }

        var animalList : MutableList<String> = arrayListOf()

        if (data == "dog"){
            animalList.add("brownie")
            animalList.add("german shepard")
            animalList.add("husky")

        }
        else{
            animalList.add("tuna")
            animalList.add("gold fish")
            animalList.add("shark")
        }

        
        recyclerViewAdapter = RecyclerViewAdapter(animalList)
//        val layoutManager = LinearLayoutManager(this)

        animal_recyclerview.adapter = recyclerViewAdapter
//        animal_recyclerview.layoutManager = layoutManager




        



    }

    override fun dataset(name: String) {
        TODO("Not yet implemented")
    }


}