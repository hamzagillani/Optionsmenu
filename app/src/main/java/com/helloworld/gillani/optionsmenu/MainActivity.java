package com.helloworld.gillani.optionsmenu;

import android.support.v7.app.AppCompatActivity;
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

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if (id==R.id.title1){
            Toast.makeText(this,"Item1 clicked",Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.title2){
            Toast.makeText(this,"Item2 clicked",Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.title3){
            Toast.makeText(this,"Item3 clicked",Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.title4){
            Toast.makeText(this,"Item4 clicked",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
