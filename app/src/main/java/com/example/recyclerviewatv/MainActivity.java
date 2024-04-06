package com.example.recyclerviewatv;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvPokemon = findViewById(R.id.rv_pokemon);

        ArrayList<Item> itemList = new ArrayList<Item>();

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(R.layout.list_item, itemList);

        rvPokemon = (RecyclerView) findViewById(R.id.rv_pokemon);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvPokemon.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        rvPokemon.addItemDecoration(dividerItemDecoration);

        rvPokemon.setAdapter(itemArrayAdapter);

        itemList.add(new Item("Nome: Bulbasaur", "Tipo: Pererca", R.drawable.a));
        itemList.add(new Item("Nome: Ivysaur", "Tipo: Pererca", R.drawable.b));
        itemList.add(new Item("Nome: Venusaur", "Tipo: Pererca", R.drawable.c));
        itemList.add(new Item("Nome: Charmander", "Tipo: Pererca", R.drawable.d));
        itemList.add(new Item("Nome: Charmeleon", "Tipo: Pererca", R.drawable.e));
        itemList.add(new Item("Nome: Charizard", "Tipo: Pererca", R.drawable.f));
        itemList.add(new Item("Nome: Squirtle", "Tipo: Pererca", R.drawable.g));
        itemList.add(new Item("Nome: Wartortle", "Tipo: Pererca", R.drawable.h));
        itemList.add(new Item("Nome: Blastoise", "Tipo: Pererca", R.drawable.i));
        itemList.add(new Item("Nome: Gastly", "Tipo: Pererca", R.drawable.j));
        itemList.add(new Item("Nome: Haunter", "Tipo: Pererca", R.drawable.k));
        itemList.add(new Item("Nome: Gengar", "Tipo: Pererca", R.drawable.l));


    }
}