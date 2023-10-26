package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonLinear(View v){
        Intent i = new Intent(this,ActivityLinear.class);
        startActivity(i);
    }

    public void botonFrame(View v){
        Intent i = new Intent(this,ActivityFrame.class);
        startActivity(i);
    }
}