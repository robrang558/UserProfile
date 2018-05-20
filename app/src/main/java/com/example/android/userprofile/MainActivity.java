package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nameTextView = findViewById(R.id.name);
        nameTextView.setText("Robert");
        nameTextView.setTextSize(50);
        TextView birthdayTextView = findViewById(R.id.birthday);
        birthdayTextView.setText("April 30");
        birthdayTextView.setTextSize(25);
        TextView countryTextView = findViewById(R.id.country);
        countryTextView.setText("USA");
        countryTextView.setTextSize(20);
        ImageView profileImageView = findViewById(R.id.profile_picture);
        profileImageView.setImageResource(R.drawable.lollipop);
    }
}
