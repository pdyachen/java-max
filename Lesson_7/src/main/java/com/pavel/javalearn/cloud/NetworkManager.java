package com.pavel.javalearn.cloud;

import retrofit2.Retrofit;
import okhttp3.OkHttpClient;
import com.google.gson.*;

public class NetworkManager {
    private RestAdapter restAdapter;
    public final OkHttpClient okHttpClient = OkHttpClient.Builder().build();

    public NetworkManager() {
         Gson gson = GsonBuilder().create();
         //OkHttpClient okHttpClient = OkHttpClient.Builder().build(); 

         restAdapter = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson))
                                   .baseUrl("http://194.190.63.108:9123/")
                                   .client(okHttpClient)
                                   .build()
                                   .create(RestAdapter.class);   // Class<T>
    }

   public RestAdapter get() { return restAdapter; }
}