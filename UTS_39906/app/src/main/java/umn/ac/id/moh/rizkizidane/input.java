package umn.ac.id.moh.rizkizidane;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class input extends AppCompatActivity {

    EditText nama;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        nama = findViewById(R.id.nama1);
        next = findViewById(R.id.btnN);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nama.getText().toString().length()==0){
                    nama.setError("Harap Di-isi!");
                 } else {
                    Intent intent = new Intent(input.this, library.class);
                    startActivity(intent);
                    Toast.makeText(input.this, "Selamat datang," + nama, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}


