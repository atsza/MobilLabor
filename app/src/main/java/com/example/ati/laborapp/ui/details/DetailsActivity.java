package com.example.ati.laborapp.ui.details;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.ati.laborapp.CocktailsApplication;
import com.example.ati.laborapp.R;
import com.example.ati.laborapp.model.Cocktail;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.inject.Inject;

public class DetailsActivity extends AppCompatActivity implements DetailsScreen{
    //@Inject
    //DetailsPresenter detailsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //CocktailsApplication.injector.inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*ImageView imageView = (ImageView)findViewById(R.id.detail_ImageView);
        URL url = null;
        try {
            url = new URL("https://www.thecocktaildb.com/images/media/drink/rdvqmh1503563512.jpg");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Bitmap bmp = null;
        try {
            bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageView.setImageBitmap(bmp);*/
        TextView detailsTextView = (TextView)findViewById(R.id.cocktail_details);

        detailsTextView.setText("Ingredient1: Rum \nIngredient2: Vodka \n" +
                "Ingredient3: Tequila \nIngredient4: Gin \nIngredient5: Triple sec \n" +
                "Ingredient6: Chambord raspberry liqueur\nIngredient7: Midori melon liqueur\n" +
                "Ingredient8: Malibu rum\n\nPour all ingredients over ice in a very tall glass. Sip cautiously.");

    }

    @Override
    public void showDetails(Cocktail cocktail) {

    }
}
