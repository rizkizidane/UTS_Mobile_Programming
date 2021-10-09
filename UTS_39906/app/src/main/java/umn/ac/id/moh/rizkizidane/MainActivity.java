package umn.ac.id.moh.rizkizidane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Profile (View view){
        Intent intent = new Intent(MainActivity.this, profile.class);
        startActivity(intent);
    }

    public void Library (View view){
        Intent intent = new Intent(MainActivity.this, input.class);
        startActivity(intent);
    }
}