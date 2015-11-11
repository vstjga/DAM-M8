package com.proyectodam.peliculasdam2;

import android.provider.SyncStateContract;
import android.util.Log;
import android.widget.ArrayAdapter;


import com.proyectodam.peliculasdam2.json.Populares;
import com.proyectodam.peliculasdam2.json.Result;
import com.proyectodam.peliculasdam2.json.Valoradas;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;


/**
 * Created by usuario1 on 8/11/15.
 */
public class TheMovieDatabaseAPIClient {
    final String BASE_URL = "http://api.themoviedb.org/";
    final String API_KEY = "b404d9a80c93a915d1d599ce78c30cd7";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://api.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    TheMovieDatabaseInterface servei = retrofit.create(TheMovieDatabaseInterface.class);

    public TheMovieDatabaseAPIClient() {
        super();
    }


    public void getValoradas(final ArrayAdapter<Result> adapter, String pais) {
        Call<Valoradas> call = servei.getValoradas(API_KEY, pais);
        call.enqueue(new Callback<Valoradas>() {
                         @Override
                         public void onResponse(Response<Valoradas> response, Retrofit retrofit) {
                             if (response.isSuccess()) {
                                 Valoradas valoradas = response.body();

                                 adapter.clear();
                                 for (Result peli : valoradas.getResults()) {
                                     adapter.add(peli);

                                 }
                             } else {
                                 Log.e("ERROR_RESPONSE_VAL", response.errorBody().toString());
                                 adapter.clear();
                             }
                         }

                         @Override
                         public void onFailure(Throwable t) {
                         }
                     }
        );
    }

    public void getPopulares(final ArrayAdapter<Result> adapter, String pais) {
        Call<Populares> call = servei.getPopulares(API_KEY, pais);
        call.enqueue(new Callback<Populares>() {
                         @Override
                         public void onResponse(Response<Populares> response, Retrofit retrofit) {
                             if (response.isSuccess()) {
                                 Populares populares = response.body();

                                 adapter.clear();
                                 for (Result peli : populares.getResults()) {
                                     adapter.add(peli);

                                 }
                             } else {

                                 adapter.clear();
                             }
                         }
                         @Override
                         public void onFailure(Throwable t) {
                         }
                     }
        );
    }

    interface TheMovieDatabaseInterface {
       @GET("3/movie/top_rated")
       Call<Valoradas> getValoradas(@Query("api_key") String apiKey, @Query("language") String pais);

       @GET("3/movie/popular")
       Call<Populares> getPopulares(@Query("api_key") String apiKey, @Query("language") String pais);
    }
}


