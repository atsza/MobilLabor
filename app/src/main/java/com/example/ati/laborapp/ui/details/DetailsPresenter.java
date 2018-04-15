package com.example.ati.laborapp.ui.details;

import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.ui.Presenter;

public class DetailsPresenter extends Presenter<DetailsScreen> {
    @Override
    public void attachScreen(DetailsScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void ShowCocktailDetails(Cocktail searchTerm) {
        screen.showDetails(searchTerm);
    }
}
