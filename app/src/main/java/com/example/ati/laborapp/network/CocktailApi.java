package com.example.ati.laborapp.network;

import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.model.Cocktails;
import com.example.ati.laborapp.model.InlineResponse200;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.math.BigDecimal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CocktailApi {

  @GET("lookup.php")
  Call<Cocktails> getCocktailById(
    @Query("i") String i
  );

  
  /**
   * Update attributes for an instance and persist it into the data source.
   * 
   * @param i Cocktail id
   * @param data Model instance data
   * @return Call<Cocktails>
   */
  
}
