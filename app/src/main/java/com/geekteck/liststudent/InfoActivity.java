package com.geekteck.liststudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.geekteck.liststudent.MainActivity.JACK;
import static com.geekteck.liststudent.MainActivity.JIMMY;
import static com.geekteck.liststudent.MainActivity.JOHN;

public class InfoActivity extends AppCompatActivity {
    TextView firstST, secondST, thirdSt;
    String firstInfo;
    String secondInfo;
    String thirdInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initViews();
        first();
        second();
        third();
    }

    public void initViews() {
        firstST = findViewById(R.id.first_student);
        secondST = findViewById(R.id.second_student);
        thirdSt = findViewById(R.id.third_student);
    }

    public void first() {
        Intent intent = getIntent();
        firstInfo = intent.getStringExtra(JACK);
        firstST.setVisibility(View.VISIBLE);
        firstST.setText(firstInfo);


    }

    public void second() {
        Intent intent = getIntent();
        secondInfo = intent.getStringExtra(JOHN);
        secondST.setVisibility(View.VISIBLE);
        secondST.setText(secondInfo);
    }

    private void third() {
        Intent intent = getIntent();
        thirdInfo = intent.getStringExtra(JIMMY);
        thirdSt.setVisibility(View.VISIBLE);
        thirdSt.setText(thirdInfo);
    }

    public void back(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
