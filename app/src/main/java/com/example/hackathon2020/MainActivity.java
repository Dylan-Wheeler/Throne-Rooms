package com.example.hackathon2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView BathroomListRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private Bathroom[] bathrooms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        load array of bathroom objects

        BathroomListRecyclerView = findViewById(R.id.rv_bathroom_list);

        BathroomListRecyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        BathroomListRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new RvAdapter(bathrooms);
        BathroomListRecyclerView.setAdapter(mAdapter);
    }
}
