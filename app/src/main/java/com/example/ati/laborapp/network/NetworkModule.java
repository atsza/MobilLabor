package com.example.ati.laborapp.network;


import com.example.ati.laborapp.util.GsonHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        return new OkHttpClient().newBuilder();
    }


    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl(NetworkConfig.ENDPOINT_ADDRESS).client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }


    @Provides
    @Singleton
    public CocktailApi provideCocktailApi(Retrofit retrofit) {
        return retrofit.create(CocktailApi.class);
    }

    @Provides
    @Singleton
    public CocktaillistApi provideCocktaillistApi(Retrofit retrofit) {
        return retrofit.create(CocktaillistApi.class);
    }
}
