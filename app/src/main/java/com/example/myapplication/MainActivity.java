package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private void onClick(){
        Intent intent = new Intent(this,ColorShowActivity.class);
        EditText editText = findViewById(R.id.input);
        String editTextValue = editText.getText().toString();
        intent.putExtra("color",editTextValue);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_color_layout);
        final Button myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener((view -> onClick()));
    }

}