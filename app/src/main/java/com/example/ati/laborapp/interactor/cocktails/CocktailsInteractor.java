package com.example.ati.laborapp.interactor.cocktails;

import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.model.Cocktails;
import com.example.ati.laborapp.network.CocktailApi;
import com.example.ati.laborapp.network.CocktaillistApi;

import java.io.IOException;

import javax.inject.Inject;

import retrofit2.Call;

public class CocktailsInteractor {

    @Inject
    CocktaillistApi cocktaillistApi;


    @Inject
    CocktailApi cocktailApi;

    public CocktailsInteractor(){
       CocktailsApplication.injector.inject(this);
    }


    public Cocktails getCocktailById(String id) throws IOException {
        return this.cocktailApi.getCocktailById(id).execute().body();
    }

    public Cocktails getCocktails(String search) throws IOException {
        return this.cocktaillistApi.getCocktails(search).execute().body();
    }

}