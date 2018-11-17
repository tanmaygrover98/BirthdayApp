package com.example.nishant.nishant;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText pass1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pass1= findViewById(R.id.pass);
        b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass1.getText().toString().equalsIgnoreCase("NishantBanga"))
                {
                    Intent intent =new Intent(MainActivity.this,MainPage.class);
                    startActivity(intent);
                }
                else
                  Snackbar.make(getWindow().getDecorView().getRootView(),"WHY SO HIGH BIRTHDAY BOY??",5000).show();

            }
        });


    }
}
