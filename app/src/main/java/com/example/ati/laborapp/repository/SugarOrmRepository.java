package com.example.ati.laborapp.repository;

import android.content.Context;

import com.example.ati.laborapp.model.Cocktail;
import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;


public class SugarOrmRepository implements Repository {

    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<Cocktail> getCocktails() {
        return SugarRecord.listAll(Cocktail.class);
    }

    @Override
    public void saveCocktail(Cocktail cocktail) {
        SugarRecord.saveInTx(cocktail);
    }

    @Override
    public void saveAllCocktails(List<Cocktail> meals) {
        SugarRecord.saveInTx(meals);
    }
    @Override
    public void updateCocktail(List<Cocktail> cocktails) {
        List<Cocktail> cocktailList = getCocktails();
        List<Cocktail> toUpdate = new ArrayList<>(cocktailList.size());
        for (Cocktail cocktail1 : cocktailList) {
            for (Cocktail cocktail2 : cocktails) {
                if (cocktail2.getIdDrink().equals(cocktail1.getIdDrink())) {
                    toUpdate.add(cocktail2);
                }
            }
        }
        SugarRecord.saveInTx(toUpdate);
    }

    @Override
    public void removeCocktail(Cocktail cocktail) {
        SugarRecord.deleteInTx(cocktail);
    }

    @Override
    public void removeAll(){
        SugarRecord.deleteAll(Cocktail.class);
    }

    @Override
    public boolean isInDB(Cocktail cocktail) {
        return SugarRecord.findById(Cocktail.class, Long.valueOf(cocktail.getIdDrink())) != null;
    }
}