package com.example.android.alc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button aboutALCButton;
    private Button myProfileButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutALCButton = (Button) findViewById(R.id.about_button);
        aboutALCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutALC();
            }
        });

        myProfileButton = (Button) findViewById(R.id.myProfileButton);
        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile();
            }
        });
    }

        public void openMyProfile () {
            Intent intent = new Intent(this, MyProfile.class);
            startActivity(intent);
        }


        public void openAboutALC () {
            Intent intent = new Intent(this, AboutALCActivity.class);
            startActivity(intent);
        }






}
