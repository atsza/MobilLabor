package com.example.ati.laborapp;

import android.app.Application;

import com.example.ati.laborapp.ui.UIModule;

public class CocktailsApplication extends Application{
    public static CocktailsApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerCocktailsApplicationComponent.builder().uIModule(new UIModule(this)).build();
    }
}
