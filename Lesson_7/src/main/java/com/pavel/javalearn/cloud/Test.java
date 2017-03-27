package com.pavel.javalearn.cloud;

import com.pavel.javalearn.models.*;
import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Callback;

public class Test {
  private static NetworkManager netManager = new NetworkManager();

  public static void main (String[] args) {
    RestAdapter restAdapter  = netManager.get();
    restAdapter.artist(100500, new Callback<FullArtist>() {
      @Override
      public void onFailure(Call<FullArtist> r, Throwable t) {
        System.out.println(t.getMessage());
      }
      @Override
      public void onResponse(Call<FullArtist> a, Response<FullArtist> resp) {
        FullArtist artist = resp.body();
        System.out.println(artist.id + " " + artist.name);
      }
    });
  }
}
