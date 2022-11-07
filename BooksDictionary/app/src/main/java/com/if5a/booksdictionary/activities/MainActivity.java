package com.if5a.booksdictionary.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.if5a.booksdictionary.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}