package com.yuka3vt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner)findViewById(R.id.spinner1);

        List<String> negaList = new ArrayList<>();
        negaList.add("Albania");
        negaList.add("Belgia");
        negaList.add("Hungary");
        negaList.add("Iran");
        negaList.add("Slovenia");

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(),negaList);
        spinner1.setAdapter(na);

    }
}