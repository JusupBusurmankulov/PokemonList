package com.example.pokemonlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pokemonlist.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    PokemonListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.img);
        list.add(R.drawable.img_1);
        list.add(R.drawable.img_2);
        list.add(R.drawable.img_3);
        list.add(R.drawable.img_4);
        list.add(R.drawable.img_5);
        list.add(R.drawable.img_6);
        list.add(R.drawable.img_7);
        list.add(R.drawable.img_8);
        list.add(R.drawable.img_9);
        adapter = new PokemonListAdapter(list);
        binding.pokemonRecycle.setAdapter(adapter);



    }
}