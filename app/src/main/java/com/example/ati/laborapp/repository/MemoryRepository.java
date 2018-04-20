package com.example.ati.laborapp.repository;

import android.content.Context;

import com.example.ati.laborapp.model.Cocktail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class MemoryRepository implements Repository {

    private static final long MINUTE = 60 * 1000;

    public static List<Cocktail> cocktails;

    @Override
    public void open(Context context) {
        Cocktail cocktail1 = new Cocktail();
        Cocktail cocktail2 = new Cocktail();

        cocktails = new ArrayList<>();
        cocktails.add(cocktail1);
        cocktails.add(cocktail2);
    }

    @Override
    public void close() {

    }

    @Override
    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    @Override
    public void saveCocktail(Cocktail cocktail) {
        cocktails.add(cocktail);
    }

    @Override
    public void updateCocktail(List<Cocktail> cocktails) {
        for (int i = 0; i < this.cocktails.size(); i++) {
            Cocktail myCocktail = this.cocktails.get(i);
            for (Cocktail cocktail : cocktails) {
                if (cocktail.getIdDrink().equals(myCocktail.getIdDrink())) {
                    this.cocktails.set(i, cocktail);
                }
            }
        }
    }

    @Override
    public void removeCocktail(Cocktail cocktail) {
        cocktails.remove(cocktail);
    }

    @Override
    public boolean isInDB(Cocktail cocktail) {
        return false;
    }
}