package com.example.ati.laborapp.repository;

import android.content.Context;

import com.example.ati.laborapp.model.Cocktail;

import java.util.List;

public interface Repository {

    void open(Context context);

    void close();

    List<Cocktail> getCocktails();

    void saveCocktail(Cocktail todo);

    void updateCocktail(List<Cocktail> todos);

    void removeCocktail(Cocktail todo);

    boolean isInDB(Cocktail todo);
}