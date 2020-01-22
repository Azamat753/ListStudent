package com.geekteck.liststudent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    RecyclerView recyclerView;
    MainAdapter adapter;
    EditText editText;

    private ArrayList<String> list;

    public static final String JACK = "JACK";
    public static final String JOHN = "JOHN";
    public static final String JIMMY = "JIMMY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        MainAdapter adapter = new MainAdapter();

        recyclerView.setAdapter(adapter);
        editText = findViewById(R.id.edit_text);
    }


    public void initListeners() {

    }

    public void ok(View view) {
        String newStudent = editText.getText().toString();
        adapter.addText(newStudent);
    }

    public void sendInfoJack(View view) {

    }

    public void sendInfoJohn(View view) {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra(JOHN, "Джон 19 лет круглый отличник,увлекается бесболом");
        startActivityForResult(intent, 2);
    }

    public void sendInfoJimmy(View view) {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra(JIMMY, "Джимми 18 лет,Рок музыкант");
        startActivityForResult(intent, 3);
    }


}
