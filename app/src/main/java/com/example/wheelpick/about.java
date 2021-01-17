package com.example.wheelpick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class about extends AppCompatActivity {

    private final String JSON_URL = "https://gist.githubusercontent.com/Francisndungu2/f00e3432b7e0e71012dfa1f694b07644/raw/db8a46ed8c9f61544bac79781b6898492d85c50f/name.json" ;
    private JsonArrayRequest request ;
    private RequestQueue requestQueue ;
    private List<Anime> lstAnime ;
    private RecyclerView recyclerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstAnime = new ArrayList<>() ;
        recyclerView = findViewById(R.id.recyclerviewid);
        jsonrequest();



    }

