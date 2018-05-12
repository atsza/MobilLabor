package com.example.ati.laborapp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.R;
import com.example.ati.laborapp.model.Cocktail;
import com.example.ati.laborapp.ui.details.DetailsActivity;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

import java.util.ArrayList;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreen {

    //@Inject
    //MainPresenter mainPresenter;

    private ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<Cocktail> cocktails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        //CocktailsApplication.injector.inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listView = (ListView) findViewById(R.id.cocktail_list);

        cocktails = new ArrayList<Cocktail>();

        Cocktail c1 = new Cocktail();
        c1.setStrDrink("Cocktail");

        Cocktail c2 = new Cocktail();
        c2.setStrDrink("Non alcoholic Cocktail");

        cocktails.add(c1);
        cocktails.add(c2);

        String[] listItems = new String[cocktails.size()];

        for(int i = 0; i < cocktails.size(); i++){
            Cocktail todo = cocktails.get(i);
            listItems[i] = todo.getStrDrink();
        }

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPos = position;
                String value = (String) listView.getItemAtPosition(position);

                Intent detailsIntent = new Intent(context, DetailsActivity.class);
                startActivity(detailsIntent);
            }
        });

    }


    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //mainPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //mainPresenter.detachScreen();
    }


    @Override
    public void showCocktails(String searchTerm) {

    }
}
