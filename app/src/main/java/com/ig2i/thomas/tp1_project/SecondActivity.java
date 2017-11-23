package com.ig2i.thomas.tp1_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String value = intent.getStringExtra("name"); //if it's a string you stored.
        TextView inputNom =  findViewById(R.id.name);
        inputNom.setText(value);
    }
}
