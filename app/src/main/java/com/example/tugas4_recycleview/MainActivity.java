package com.example.tugas4_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SosmedAdapter adapter;
    private ArrayList<Sosmed> planetArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        adapter = new SosmedAdapter(planetArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        planetArrayList = new ArrayList<>();
        planetArrayList.add(new Sosmed("Facebook", "Facebook berkantor pusat di Amerika",R.drawable.fb));
        planetArrayList.add(new Sosmed("Google", "Google berkantor pusat di Amerika",R.drawable.google));
        planetArrayList.add(new Sosmed("Instagram", "Instagram aplikasi berbagi foto",R.drawable.ig));
        planetArrayList.add(new Sosmed("Twitter", "Twitter berkantor pusat di California ",R.drawable.twitt));
        planetArrayList.add(new Sosmed("Pinterest", "Pinterest aplikasi jejaring sosial",R.drawable.pinterest));

    }
}