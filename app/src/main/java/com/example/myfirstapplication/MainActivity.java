package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onMyClick(View view)
    {
        TextView textView=(TextView) findViewById(R.id.TextView1);
        EditText editText=(EditText)findViewById(R.id.editTextTextPersonName);
        textView.setText("Привет, "+editText.getText()+"!!!");
    }
}