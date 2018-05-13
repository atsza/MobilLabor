package com.example.ati.laborapp.interactor;

import dagger.Module;
import dagger.Provides;
import com.example.ati.laborapp.interactor.cocktails.CocktailsInteractor;
import com.example.ati.laborapp.interactor.cocktails.RepositoryInteractor;

@Module
public class InteractorModule {
    @Provides
    public CocktailsInteractor provideCocktailsInteractor() {
        return new CocktailsInteractor();
    }

    @Provides
    public RepositoryInteractor provideRepositoryInteractor() { return new RepositoryInteractor(); }
}