package com.example.ati.laborapp.interactor.cocktails;

import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.interactor.cocktails.event.GetCocktailsEvent;
import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.network.CocktailApi;

import javax.inject.Inject;

import retrofit2.Call;

public class CocktailsInteractor {

    @Inject
    CocktailApi cocktailApi;

    public CocktailsInteractor(){
       CocktailsApplication.injector.inject(this);
    }

    public void getCocktails(String searchString) {

        Call<Cocktail> cocktailCall = cocktailApi.getCocktails(searchString);
        GetCocktailsEvent event = new GetCocktailsEvent();
        try{
            //TODO
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}