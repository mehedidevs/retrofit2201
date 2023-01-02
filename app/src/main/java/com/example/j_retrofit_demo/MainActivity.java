package com.example.j_retrofit_demo;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PostDTO dto = RetrofitClient.getRetrofit().create(PostDTO.class);
        Call<List<ResponsePostItem>> response = dto.getAllPost();


        response.enqueue(new Callback<List<ResponsePostItem>>() {
            @Override
            public void onResponse(Call<List<ResponsePostItem>> call, Response<List<ResponsePostItem>> response) {
                if (response.isSuccessful()) {
                    Log.i("TAG", "code: " + response.code());

                    List<ResponsePostItem> postItems = response.body();

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        postItems.forEach(p -> {

                            Log.i("TAG", "item : " + p);

                        });
                    }


                }



            }

            @Override
            public void onFailure(Call<List<ResponsePostItem>> call, Throwable t) {

            }
        });





    }
}