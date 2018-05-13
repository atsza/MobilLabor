package com.example.ati.laborapp.mock.interceptors;

import android.net.Uri;

import com.example.ati.laborapp.network.NetworkConfig;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

import static com.example.ati.laborapp.mock.interceptors.MockHelper.makeResponse;


public class CocktailMock {
    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();


        if (uri.getPath().equals(NetworkConfig.ENDPOINT_ADDRESS) && request.method().equals("POST")) {
            responseString = "";
            responseCode = 200;
        }else if (uri.getPath().equals(NetworkConfig.ENDPOINT_ADDRESS) && request.method().equals("Get")) {
            //MemoryRepository memoryRepository = new MemoryRepository();
            //memoryRepository.open(null);
            //responseString = GsonHelper.getGson().toJson(memoryRepository.getCocktails());
            responseString = "";
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return makeResponse(request, headers, responseCode, responseString);
    }
}