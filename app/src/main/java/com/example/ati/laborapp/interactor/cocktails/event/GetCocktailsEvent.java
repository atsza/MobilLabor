package com.example.ati.laborapp.interactor.cocktails.event;

import com.example.ati.laborapp.model.Cocktail;

import java.util.List;

public class GetCocktailsEvent {
    private int code;
    private List<Cocktail> cocktails;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public GetCocktailsEvent() {
    }

    public GetCocktailsEvent(int code, List<Cocktail> cocktails, Throwable throwable) {
        this.code = code;
        this.cocktails = cocktails;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    public void setCocktails(List<Cocktail> cocktails) {
        this.cocktails = cocktails;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    //</editor-fold>
}