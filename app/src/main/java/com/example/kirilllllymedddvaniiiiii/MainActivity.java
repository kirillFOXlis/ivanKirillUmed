package com.example.kirilllllymedddvaniiiiii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void k1(View v1){
        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
    public void k2(View v2){
        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }
}