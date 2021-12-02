package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Левая обезьянка", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClicked1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Обезьянка по центру", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClicked2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Правая обезьянка", Toast.LENGTH_LONG);
        myToast.show();
    }
}