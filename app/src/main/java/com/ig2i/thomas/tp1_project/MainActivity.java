package com.ig2i.thomas.tp1_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.value;

public class MainActivity extends Activity implements View.OnClickListener {

    String valueInput = "";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_relative);
        Log.i("LISTENNER", "Creer");
        Button btnOK = findViewById(R.id.btnOK);
        EditText inputNom = findViewById(R.id.inputNom);
        valueInput = inputNom.getText().toString();
        btnOK.setOnClickListener(this);
        inputNom.setOnClickListener(this);
    }

    public void foo(View view) {
       // Log.i("LISTENNER", "Click sur le boutton");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOK:
                afficherMessage("Salut "+valueInput);
                Intent myIntent = new Intent(getApplicationContext(),SecondActivity.class);
                myIntent.putExtra("name", valueInput); //Optional parameters
                startActivity(myIntent);
                break;
            case R.id.inputNom:
                afficherMessage( "edit du text");
                break;
        }
    }

    private void afficherMessage(String message){
        Log.i("LISTENNER", message);
        Toast t = Toast.makeText(this,message,Toast.LENGTH_LONG);
        t.show();
    }
}
