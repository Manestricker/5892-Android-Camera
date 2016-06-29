package com.example.david.a5892_android_camera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Loads opencv Libraries
    static {
        System.loadLibrary("opencv_java3");
    }
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

}

