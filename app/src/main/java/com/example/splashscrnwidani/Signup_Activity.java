package com.example.splashscrnwidani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Signup_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void gotologinpage(View view) {
        Intent i=new Intent(Signup_Activity.this,Login.class);
        startActivity(i);
    }
}
