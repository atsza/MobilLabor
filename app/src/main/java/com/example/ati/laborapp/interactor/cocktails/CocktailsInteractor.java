package com.example.ati.laborapp.interactor.cocktails;

import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.interactor.cocktails.event.GetCocktailsEvent;
import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.model.Cocktails;
import com.example.ati.laborapp.network.CocktailApi;
import com.example.ati.laborapp.network.CocktaillistApi;
import com.example.ati.laborapp.repository.Repository;

import java.io.IOException;

import javax.inject.Inject;

import retrofit2.Call;

public class CocktailsInteractor {

    @Inject
    CocktaillistApi cocktaillistApi;


    public CocktailsInteractor(){
       CocktailsApplication.injector.inject(this);
    }

    public Cocktails getCocktails(String searchString) throws IOException {

        return this.cocktaillistApi.getCocktails(searchString).execute().body();
    }

}