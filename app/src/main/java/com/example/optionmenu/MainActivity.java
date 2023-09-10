package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.shareId){
            Toast.makeText(this, "Share Item is Clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.settingId){
            Toast.makeText(this, "Setting Item is Clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.colorId){
            Toast.makeText(this, "Color Item is Clicked", Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }
}