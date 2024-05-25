package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonShowRed = findViewById(R.id.btnCreateRed);
        Button buttonShowOrange = findViewById(R.id.btnCreateOrange);

        FragmentManager fragmentManager = getSupportFragmentManager();


        buttonShowRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRedFragment(fragmentManager);
                Log.d("Mostrando rojo", "aaaaaa");
            }
        });

        buttonShowOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOrangeFragment(fragmentManager);
                Log.d("Mostrando nanaja", "AAAAAAA");
            }
        });
    }

    private void showRedFragment(FragmentManager fragmentManager) {
        RedFragment redFragment = RedFragment.newInstance("", "");

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainerView, redFragment);
        fragmentTransaction.commit();
    }

    private void showOrangeFragment(FragmentManager fragmentManager) {
        OrangeFragment orangeFragment = OrangeFragment.newInstance("", "");

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainerView, orangeFragment);
        fragmentTransaction.commit();
    }
}