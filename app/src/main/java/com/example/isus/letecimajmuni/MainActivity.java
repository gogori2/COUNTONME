package com.example.isus.letecimajmuni;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {


    public void brojac(View view) {


        // Do something in response to button
        Intent intent = new Intent(this, Brojac.class);
        //   EditText editText = (EditText) findViewById(R.id.edit_username);
        // String message = editText.getText().toString();
        //    intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }



    public void kosarka(View view) {


        // Do something in response to button
        Intent intent = new Intent(this, Kosarka.class);
        //   EditText editText = (EditText) findViewById(R.id.edit_username);
        // String message = editText.getText().toString();
        //    intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    }

}
/*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
*/