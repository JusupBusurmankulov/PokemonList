package com.example.pokemonlist;

import android.text.style.AlignmentSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokemonlist.databinding.ItemPokemonBinding;

import java.util.ArrayList;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.PokemonViewHolder> {

    ArrayList<Integer> list;

    public PokemonListAdapter(ArrayList<Integer> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PokemonListAdapter.PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PokemonViewHolder(ItemPokemonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonListAdapter.PokemonViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class PokemonViewHolder extends RecyclerView.ViewHolder {
        ItemPokemonBinding binding;
        public PokemonViewHolder(@NonNull ItemPokemonBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Integer image) {
            binding.ivPokemon.setImageResource(image);
        }
    }
}
