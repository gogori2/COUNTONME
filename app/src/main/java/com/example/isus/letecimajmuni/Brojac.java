package com.example.isus.letecimajmuni;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Brojac extends ActionBarActivity {



    public void inc1(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 1);
        editText.setText(broj);
    }

    public void dec1(View view) {
        EditText editText = (EditText) findViewById(R.id.stanje);
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) - 1);
        editText.setText(broj);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brojac);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brojac, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
