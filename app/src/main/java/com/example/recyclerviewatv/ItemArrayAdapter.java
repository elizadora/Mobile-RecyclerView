package com.example.recyclerviewatv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder> {

    private int listItemLayout;
    private ArrayList<Item> itemList;


    public ItemArrayAdapter(int layoutId, ArrayList<Item> itemList){
        this.listItemLayout = layoutId;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView itemName = holder.itemName;
        TextView itemType = holder.itemType;
        ImageView itemImage = holder.itemImage;

        itemName.setText(itemList.get(position).getName());
        itemType.setText(itemList.get(position).getType());
        itemImage.setImageResource(itemList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView itemName;
        public TextView itemType;
        public ImageView itemImage;

        public ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            itemName = (TextView) itemView.findViewById(R.id.item_name);
            itemType = (TextView) itemView.findViewById(R.id.item_type);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
        }

        @Override
        public void onClick(View v) {
            String name = itemName.getText().toString().substring(5);
            Toast.makeText(v.getContext(), "Você selecionou: " + name, Toast.LENGTH_SHORT).show();
        }
    }

}
