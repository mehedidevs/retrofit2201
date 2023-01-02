package com.example.j_retrofit_demo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

interface PostDTO {

    @GET("/posts")
    Call<List<ResponsePostItem>> getAllPost();



}
