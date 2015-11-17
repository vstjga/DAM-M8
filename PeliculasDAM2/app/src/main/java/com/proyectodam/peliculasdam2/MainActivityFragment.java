package com.proyectodam.peliculasdam2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.proyectodam.peliculasdam2.json.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

 //   private ArrayList<String> items;
 //    private ArrayAdapter<String> adapter;

    private ArrayList<Result> items;
    private ResultAdapter adapter;
    public static String OBJETO_PELICULA = "OBJETO_PELICULA";

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Override
    public void onStart() {
        super.onStart();
        refresh();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView lvPelis = (ListView) rootView.findViewById(R.id.lvPelis);
        items = new ArrayList<Result>();
        adapter = new ResultAdapter(
                getContext(),
                R.layout.lvpelis_row,
                items
        );
        lvPelis.setAdapter(adapter);

        lvPelis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getContext(), DetailActivity.class);
                i.putExtra(OBJETO_PELICULA, adapter.getItem(position));
                startActivity(i);
            }
        });




        return rootView;










    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_pelis_fragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_refresh) {
            refresh();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void refresh() {
        TheMovieDatabaseAPIClient apiClient = new TheMovieDatabaseAPIClient();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String tipusConsulta = preferences.getString("tipus_consulta", "valoradas");

        String pais          = preferences.getString("pais", "valoradas");

        if (tipusConsulta.equals("valoradas")) {
            apiClient.getValoradas(adapter, pais);
            Log.d(tipusConsulta, "MAS VALORADAS");
        } else {
            apiClient.getPopulares(adapter, pais);
            Log.d(tipusConsulta, "MAS POPULARES");

        }
    }

}