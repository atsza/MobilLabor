package com.example.ati.laborapp.network;

import com.example.ati.laborapp.model.Cocktail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CocktailApi {
    @GET("Cocktails")
    Call<Cocktail> getCocktails(@Query("name") String name);
}
