package com.example.ati.laborapp.repository;

import android.content.Context;


import com.example.ati.laborapp.model.Cocktail;

import java.util.List;

import dagger.Provides;


public interface Repository {

    void open(Context context);

    void close();

    List<Cocktail> getCocktails();

    void saveCocktail(Cocktail cocktail);

    void saveAllCocktails(List<Cocktail> cocktails);

    void updateCocktail(List<Cocktail> cocktails);

    void removeCocktail(Cocktail cocktail);

    void removeAll();

    boolean isInDB(Cocktail cocktail);
}