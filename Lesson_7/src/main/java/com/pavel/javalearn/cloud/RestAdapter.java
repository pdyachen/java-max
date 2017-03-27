package com.pavel.javalearn.cloud;

import com.pavel.javalearn.models.*;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Callback;
import java.util.List;

public interface RestAdapter {
    String ENDPOINT = "http://194.190.63.108:9123/";

     @GET("/all")
     void artists(Callback<List<Artist>> cb);

     @GET("/single")
      void artist(@Query("id") long id, Callback<FullArtist> cb);
     
     @GET("/genres")
      void genres(Callback<List<Genre>> cb);
}