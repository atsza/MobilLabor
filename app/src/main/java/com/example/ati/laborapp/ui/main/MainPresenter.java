package com.example.ati.laborapp.ui.main;

import com.example.ati.laborapp.ui.Presenter;

public class MainPresenter extends Presenter<MainScreen>{
    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void ShowCocktailsList(String searchTerm) {
        screen.showCocktails(searchTerm);
    }
}
