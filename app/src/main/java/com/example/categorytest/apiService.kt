package com.example.categorytest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface apiService {
    @GET("/api/products/details")
    fun getCategories (/*@Header ("Authorization") token : String*/) : Call<ArrayList<CategoryListItem>>
}