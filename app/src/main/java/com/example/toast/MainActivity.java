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
        Toast myToast = Toast.makeText(getApplicationContext(), "Ура! Вспылающие сообщения работают", Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP,0,0);
        myToast.show();
    }
}