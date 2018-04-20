package com.example.ati.laborapp.network;

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
  
  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param i Cocktail id
   * @param data Model instance data
   * @return Call<Cocktails>
   */
  
  @POST("add.php")
  Call<Cocktails> cocktailCreate(
    @Query("i") BigDecimal i, @Body Cocktails data
  );

  
  /**
   * Find an instance by id from the data source.
   * 
   * @param i Cocktail id
   * @return Call<Cocktails>
   */
  
  @GET("lookup.php")
  Call<Cocktails> getCocktailById(
    @Query("i") BigDecimal i
  );

  
  /**
   * Update attributes for an instance and persist it into the data source.
   * 
   * @param i Cocktail id
   * @param data Model instance data
   * @return Call<Cocktails>
   */
  
  @PUT("lookup.php")
  Call<Cocktails> updateCocktailById(
    @Query("i") BigDecimal i, @Body Cocktails data
  );

  
  /**
   * Delete an instance by id from the data source.
   * 
   * @param i Cocktail id
   * @return Call<InlineResponse200>
   */
  
  @DELETE("lookup.php")
  Call<InlineResponse200> deleteCocktailById(
    @Query("i") BigDecimal i
  );

  
}
