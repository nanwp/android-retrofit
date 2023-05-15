package com.example.apiapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DataService {
    @GET("destination")
    Call<List<Data>> getData ();
}
