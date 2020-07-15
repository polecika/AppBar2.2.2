package com.example.appbar222;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(NotesActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            Toast.makeText(NotesActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_settings) {
            Intent intentSettings = new Intent(NotesActivity.this, SettingsActivity.class);
            startActivity(intentSettings);
            Toast.makeText(NotesActivity.this, "Отркыть настройки", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}