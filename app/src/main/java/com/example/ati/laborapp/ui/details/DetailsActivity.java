package com.example.ati.laborapp.ui.details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.R;
import com.example.ati.laborapp.model.Cocktail;

import javax.inject.Inject;

public class DetailsActivity extends AppCompatActivity implements DetailsScreen{
    @Inject
    DetailsPresenter detailsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        CocktailsApplication.injector.inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void showDetails(Cocktail cocktail) {

    }
}
