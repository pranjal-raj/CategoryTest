package com.example.categorytest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import java.util.Objects

interface apiService {
    @GET("/api/products/details")
    fun getCategories (/*@Header ("Authorization") token : String*/) : Call<ArrayList<Any>>
}