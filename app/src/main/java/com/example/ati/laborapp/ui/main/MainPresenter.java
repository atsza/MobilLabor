package com.example.ati.laborapp.ui.main;

import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.ui.Presenter;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import static com.example.ati.laborapp.CocktailsApplication.injector;

public class MainPresenter extends Presenter<MainScreen>{



    public MainPresenter() {
        CocktailsApplication.injector.inject(this);
    }

    @Override
    public void attachScreen(MainScreen screen) {

        super.attachScreen(screen);
        injector.inject(this);
    }

    @Override
    public void detachScreen() {

        super.detachScreen();
    }

    public void ShowCocktailsList(final String searchTerm) {
        new Thread() {
            @Override
            public void run() {
                screen.showCocktails(searchTerm);
            }
        }.start();

    }
}
