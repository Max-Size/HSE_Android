package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

public class ColorShowActivity extends AppCompatActivity {

    private int defineColor(String color){
        switch (color.toLowerCase()){
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "blue":
                return Color.BLUE;
        }
        return -1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        Intent intent = getIntent();
        String inputtedText = intent.getStringExtra("color");
        TextView color = findViewById(R.id.color_value);
        color.setText(inputtedText);
        View layout = findViewById(R.id.result_activity);
        int colorValue = defineColor(inputtedText == null ? "" : inputtedText);
        if(colorValue!=-1){
            layout.setBackgroundColor(colorValue);
        }else{
            TextView error = findViewById(R.id.error);
            error.setText(String.format("ERROR: The %s isn't the 'red','green' or 'blue'", inputtedText));
        }
    }
}