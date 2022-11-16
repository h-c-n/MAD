package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    int image[]={R.drawable.f1, R.drawable.f2, R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,R.drawable.f7,R.drawable.f8};
    String[] names = {"India","United Kingdom", "U.S.A.", "China", "Germany", "Sri Lanka", "Australia", "Argentina"};
    GridView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g = (GridView) findViewById(R.id.grid);
        GridArrayAdapter gridArrayAdapter = new GridArrayAdapter(this, R.layout.cell, image,names);
        g.setAdapter(gridArrayAdapter);
        g.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you know the flag of "+names[position]+"?");
        builder.setPositiveButton("YES",null);
        builder.setNegativeButton("NO",null);
        AlertDialog a = builder.create();
        a.show();
    }
}
