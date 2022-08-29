package com.example.grade;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends Activity {

    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        TextView percent,msg;


        percent = (TextView) findViewById(R.id.percentage);
        msg = (TextView) findViewById(R.id.message);


        SharedPreferences sp = getSharedPreferences("MarkDetails",MODE_PRIVATE);
        int percentage = sp.getInt("percentage",0);
        String message = sp.getString("message","Message");

        String percent_string =  percentage + "%";

        percent.setText(percent_string);
        msg.setText(message);

        if (percentage < 50)
            msg.setTextColor(getResources().getColor(R.color.danger));
    }
}