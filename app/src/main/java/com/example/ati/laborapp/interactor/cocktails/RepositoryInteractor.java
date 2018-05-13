package com.example.ati.laborapp.interactor.cocktails;

import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.repository.Repository;

import java.util.List;

import javax.inject.Inject;

public class RepositoryInteractor {

    Repository repository;

    public RepositoryInteractor() {
        CocktailsApplication.injector.inject(this);
    };

    public List<Cocktail> getCocktails(){
        return repository.getCocktails();
    };

    public void saveCocktail(Cocktail cocktail){
        repository.saveCocktail(cocktail);
    };

    public void saveAllCocktails(List<Cocktail> cocktail){
        repository.saveAllCocktails(cocktail);
    };

    public void updateCocktails(List<Cocktail> cocktail){
        repository.updateCocktail(cocktail);
    };

    public void removeCocktail(Cocktail cocktail){
        repository.removeCocktail(cocktail);
    };

    public void removeAll(){
        repository.removeAll();
    };

    public boolean isInDB(Cocktail cocktail){
        return repository.isInDB(cocktail);
    };
}
