package com.example.categorytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.categorytest.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            getData()

        //etStringData()


    }

//    private fun getStringData() {
//        val retrofitservice = apiController.retrofit.create(apiService::class.java)
//        val retrofitData = retrofitservice.getCategories()
//        retrofitData.enqueue(object : Callback<List<String>>{
//
//            override fun onResponse(
//                call: Call<List<String>>,
//                response: retrofit2.Response<List<String>>
//            ) {
//                //  list = response.body()!!
//                Log.d("jhoom", "${response.code()}")
//                // val Category = list[0]
//                binding.tv.text = response.body().toString()
//            }
//
//            override fun onFailure(call: Call<List<String>>, t: Throwable) {
//                Log.d("jhoom", "Failed ${t.message}")
//            }
//        })
//    }

    private fun getData() {
       // val token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjozLCJhY2NvdW50X3R5cGUiOiJmYXJtZXIiLCJpYXQiOjE2OTQ1NjIzNDcsImV4cCI6MTY5NDgyMTU0N30.e6FZ3UAz1sGS5WrW1BP0NhQfvc5_0oDKk81nfKE3ccc"
       // var list : ArrayList<Category> = ArrayList()
        val retrofitservice = apiController.retrofit.create(apiService::class.java)
        val retrofitData = retrofitservice.getCategories()
         retrofitData.enqueue(object : Callback<ArrayList<Any>>{

             override fun onResponse(
                 call: Call<ArrayList<Any>>,
                 response: retrofit2.Response<ArrayList<Any>>
             ) {
               //  list = response.body()!!
                 Log.d("jhoom", "${response.code()}")
                // val Category = list[0]
                 binding.tv.text = response.body().toString()
             }

             override fun onFailure(call: Call<ArrayList<Any>>, t: Throwable) {
                 Log.d("jhoom", "Failed ${t.message}")
             }
         })

    }
}