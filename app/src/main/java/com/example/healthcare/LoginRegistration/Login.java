package com.example.healthcare.LoginRegistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.healthcare.R;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imageSlider = findViewById(R.id.image_slider);
        ArrayList<SlideModel> slider = new ArrayList<>();
        slider.add(new SlideModel(R.drawable.login, ScaleTypes.FIT));
        slider.add(new SlideModel(R.drawable.login1,ScaleTypes.FIT));
        slider.add(new SlideModel(R.drawable.login3,ScaleTypes.FIT));
        slider.add(new SlideModel(R.drawable.login4,ScaleTypes.FIT));
        imageSlider.setImageList(slider);
    }
}