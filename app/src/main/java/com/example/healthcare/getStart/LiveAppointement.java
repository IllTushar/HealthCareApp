package com.example.healthcare.getStart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthcare.LoginRegistration.Login;
import com.example.healthcare.MainActivity;
import com.example.healthcare.R;

public class LiveAppointement extends AppCompatActivity {
Button next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_appointement);
        next2 = findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(), Login.class));
            }
        });
    }
}