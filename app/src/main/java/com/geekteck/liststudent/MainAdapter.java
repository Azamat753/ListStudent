package com.geekteck.liststudent;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.geekteck.liststudent.MainActivity.JACK;

public class MainAdapter extends RecyclerView.Adapter<ViewHolder> {
   ArrayList<String> data;

    public MainAdapter(ArrayList<String> data) {
        this.data = data;

        addText("Jack");
        addText("John");
        addText("Jimmy");

    }

    {{


    }
    };

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    public void addText(String text) {
        data.add(text);
        notifyDataSetChanged();
    }

    }


