package com.example.ati.laborapp.interactor;

import dagger.Module;
import dagger.Provides;
import com.example.ati.laborapp.interactor.cocktails.CocktailsInteractor;

@Module
public class InteractorModule {
    @Provides
    public CocktailsInteractor provideArtistsInteractor() {
        return new CocktailsInteractor();
    }
}