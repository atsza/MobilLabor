package com.example.ati.laborapp.network;




import com.example.ati.laborapp.model.Cocktails;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CocktaillistApi {
  
  /**
   * Gets the cocktailslist
   * 
   * @param s Search string
   * @return Call<Cocktails>
   */
  
  @GET("search.php")
  Call<Cocktails> getCocktails(
    @Query("s") String s
  );

  
}
