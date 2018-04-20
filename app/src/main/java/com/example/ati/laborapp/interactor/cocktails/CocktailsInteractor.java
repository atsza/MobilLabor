package com.example.ati.laborapp.interactor.cocktails;

import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.interactor.cocktails.event.GetCocktailsEvent;
import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.model.Cocktails;
import com.example.ati.laborapp.network.CocktailApi;
import com.example.ati.laborapp.network.CocktaillistApi;

import javax.inject.Inject;

import retrofit2.Call;

public class CocktailsInteractor {

    @Inject
    CocktaillistApi cocktaillistApi;

    public CocktailsInteractor(){
       CocktailsApplication.injector.inject(this);
    }

    public void getCocktails(String searchString) {

        Call<Cocktails> cocktailCall = cocktaillistApi.getCocktails(searchString);
        GetCocktailsEvent event = new GetCocktailsEvent();
        try{
            //TODO
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}