package com.example.ati.laborapp;

import com.example.ati.laborapp.interactor.InteractorModule;
import com.example.ati.laborapp.mock.MockNetworkModule;
import com.example.ati.laborapp.repository.TestRepositoryModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class, TestRepositoryModule.class})
public interface TestComponent extends CocktailsApplicationComponent {
}
