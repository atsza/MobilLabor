package com.example.ati.laborapp;

import com.example.ati.laborapp.interactor.InteractorModule;
import com.example.ati.laborapp.interactor.cocktails.CocktailsInteractor;
import com.example.ati.laborapp.network.NetworkModule;
import com.example.ati.laborapp.ui.UIModule;
import com.example.ati.laborapp.ui.details.DetailsActivity;
import com.example.ati.laborapp.ui.details.DetailsPresenter;
import com.example.ati.laborapp.ui.main.MainActivity;
import com.example.ati.laborapp.ui.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class, InteractorModule.class})
public interface CocktailsApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(DetailsActivity detailsActivity);

    void inject(CocktailsInteractor cocktailsInteractor);

    void inject(MainPresenter mainPresenter);

    void inject(DetailsPresenter detailsPresenter);
}
