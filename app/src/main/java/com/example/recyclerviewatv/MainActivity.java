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

        itemList.add(new Item("Nome: Bulbasaur", "Tipo: Planta, Venenoso", R.drawable.a));
        itemList.add(new Item("Nome: Ivysaur", "Tipo: Planta, Venenoso", R.drawable.b));
        itemList.add(new Item("Nome: Venusaur", "Tipo: Planta, Venenoso", R.drawable.c));
        itemList.add(new Item("Nome: Charmander", "Tipo: Fogo", R.drawable.d));
        itemList.add(new Item("Nome: Charmeleon", "Tipo: Fogo", R.drawable.e));
        itemList.add(new Item("Nome: Charizard", "Tipo: Fogo, Voador", R.drawable.f));
        itemList.add(new Item("Nome: Squirtle", "Tipo: Água", R.drawable.g));
        itemList.add(new Item("Nome: Wartortle", "Tipo: Água", R.drawable.h));
        itemList.add(new Item("Nome: Blastoise", "Tipo: Água", R.drawable.i));
        itemList.add(new Item("Nome: Gastly", "Tipo: Fantasma, Venenoso", R.drawable.j));
        itemList.add(new Item("Nome: Haunter", "Tipo: Fantasma, Venenoso", R.drawable.k));
        itemList.add(new Item("Nome: Gengar", "Tipo: Fantasma, Venenoso", R.drawable.l));


    }
}