package com.example.daftarmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView Rmakanan;
    RecyclerView.Adapter adapter;
    private ArrayList<classmakanan> listmakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rmakanan = findViewById(R.id.remenu);
        initData();

        Rmakanan.setAdapter(new adapter(listmakanan));
        Rmakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initData(){
        this.listmakanan = new ArrayList<>();
        listmakanan.add(new classmakanan("pecel lele","lele dikasih sambel",20000,R.drawable.pecel_lele));
        listmakanan.add(new classmakanan("ayam geprek","ayam digeprek",20000,R.drawable.ayam_geprek));
        listmakanan.add(new classmakanan("nasi goreng","nasi ditumis",20000,R.drawable.nasi_goreng));
    }
}