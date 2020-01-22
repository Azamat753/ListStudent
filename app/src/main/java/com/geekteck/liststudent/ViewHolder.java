package com.geekteck.liststudent;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.geekteck.liststudent.MainActivity.JACK;
import static com.geekteck.liststudent.MainActivity.JIMMY;
import static com.geekteck.liststudent.MainActivity.JOHN;

public class ViewHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView ;

    TextView textView;
    int counter = 0;
    ArrayList<String> data = new ArrayList<String>() {
        {
            add("Jack");
            add("John");
            add("Jimmy");

        }
    };

    public ViewHolder(@NonNull final View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.item_holder);
recyclerView=itemView.findViewById(R.id.recycler_view);
    }

    public void setText(String text) {
        textView.setText(text);


        itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int itemPosition =recyclerView.getChildAdapterPosition(v);
                    final String item = data.get(itemPosition);

                    if (item == null) {
                        Intent intent = new Intent(v.getContext(), InfoActivity.class);
                        intent.putExtra(JACK, "Джэк 20 лет ударник ,занимается конный спорторм");
                        v.getContext().startActivity(intent);
                        Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show();
                    }
                }

            });
        }

        /*if (itemView.getId() == counter) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), InfoActivity.class);
                    intent.putExtra(JOHN, "Джон 19 лет круглый отличник,увлекается бесболом");
                    v.getContext().startActivity(intent);
                    Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show();
                }

            });
        }
        if (itemView.getId() == counter) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), InfoActivity.class);
                    intent.putExtra(JIMMY, "Джимми 18 лет,Рок музыкант");
                    v.getContext().startActivity(intent);
                    Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show();
                }

            });
        }
        counter++;

    }*/
    }
}

