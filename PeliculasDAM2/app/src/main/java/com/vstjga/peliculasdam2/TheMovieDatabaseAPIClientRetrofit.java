package com.vstjga.peliculasdam2;

import android.util.Log;
import android.widget.ArrayAdapter;

import com.vstjga.peliculasdam2.json.ApiData;
import com.vstjga.peliculasdam2.json.Movie;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;

public class TheMovieDatabaseAPIClientRetrofit {
    final String BASE_URL = "http://api.rottentomatoes.com/api/public/v1.0/";
    final String API_KEY = "9htuhtcb4ymusd73d4z6jxcj";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    TheMovieDatabase servei = retrofit.create(TheMovieDatabase.class);

    public TheMovieDatabaseAPIClientRetrofit() {
        super();
    }

    public void getPeliculesMesVistes(final ArrayAdapter adapter) {
        Call<ApiData> call = servei.getPeliculesMesVistes("es", API_KEY);
        call.enqueue(new Callback<ApiData>() {
                         @Override
                         public void onResponse(Response<ApiData> response, Retrofit retrofit) {
                             if (response.isSuccess()) {
                                 ApiData apiData = response.body();

                                 adapter.clear();
                                 for (Movie peli : apiData.getMovies()) {
                                     adapter.add(peli.getTitle());
                                 }
                             } else {
                                 Log.e("XXX", response.errorBody().toString());
                             }
                         }

                         @Override
                         public void onFailure(Throwable t) {

                         }
                     }

        );
    }

    public void getProximesEstrenes(final ArrayAdapter adapter) {
        Call<ApiData> call = servei.getProximesEstrenes("es", API_KEY);
        call.enqueue(new Callback<ApiData>() {
                         @Override
                         public void onResponse(Response<ApiData> response, Retrofit retrofit) {
                             if (response.isSuccess()) {
                                 ApiData apiData = response.body();

                                 adapter.clear();
                                 for (Movie peli : apiData.getMovies()) {
                                     adapter.add(peli.getTitle());
                                 }
                             } else {
                                 Log.e("XXX", response.errorBody().toString());
                             }
                         }

                         @Override
                         public void onFailure(Throwable t) {

                         }
                     }

        );
    }


    interface TheMovieDatabase {
        @GET("lists/movies/box_office.json")
        Call<ApiData> getPeliculesMesVistes(
                @Query("country") String pais,
                @Query("apikey") String apiKey
        );

        @GET("lists/movies/upcoming.json")
        Call<ApiData> getProximesEstrenes(
                @Query("country") String pais,
                @Query("apikey") String apiKey
        );
    }

}
