package umn.ac.id.moh.rizkizidane;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class library extends AppCompatActivity {

    private final List<String> namasfx = new ArrayList<>();
    private SfxAdapter adapter;


    @SuppressLint("UseSupportActionBar")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setActionBar(toolbar);

        adapter = new SfxAdapter(this, namasfx);
        namasfx.add("sfx bom");
        namasfx.add("sfx water");
        namasfx.add("sfx wind");

        RecyclerView recyclerView = findViewById(R.id.listsfx);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.awal){
            startActivity(new Intent(this, MainActivity.class));
        } else if (item.getItemId() == R.id.profil) {
            startActivity(new Intent(this, profile.class));
        }
        return true;
    }



}