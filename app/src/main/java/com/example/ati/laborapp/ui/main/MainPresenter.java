package com.example.ati.laborapp.ui.main;

import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.interactor.cocktails.CocktailsInteractor;
import com.example.ati.laborapp.interactor.cocktails.RepositoryInteractor;
import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.model.Cocktails;
import com.example.ati.laborapp.ui.Presenter;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

public class MainPresenter extends Presenter<MainScreen>{

    @Inject
    CocktailsInteractor cocktailsInteractor;

    @Inject
    RepositoryInteractor repositoryInteractor;

    Executor executor;

    @Override
    public void attachScreen(MainScreen screen) {

        super.attachScreen(screen);
        CocktailsApplication.injector.inject(this);
    }

    @Override
    public void detachScreen() {

        super.detachScreen();
    }


    public void getCocktailsFromApi(final String search){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try{
                    Cocktails cocktails = cocktailsInteractor.getCocktails(search);
                    List<Cocktail> cocktailList = cocktails.getDrinks();
                    saveCocktails(cocktailList);
                    screen.showCocktails(cocktailList);
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        });
    }

    private void saveCocktails(List<Cocktail> cocktails){
        repositoryInteractor.removeAll();
        repositoryInteractor.saveAllCocktails(cocktails);
    }

    public void loadFromRepo(){
        executor.execute(new Runnable(){
            @Override
            public void run(){
                List<Cocktail> cocktails = repositoryInteractor.getCocktails();
                screen.showCocktails(cocktails);
            }
        });
    }
}
