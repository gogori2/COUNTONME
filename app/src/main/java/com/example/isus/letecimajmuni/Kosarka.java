package com.example.isus.letecimajmuni;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Stack;


public class Kosarka extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosarka);
    }


    Stack<Integer> undostackint = new Stack<Integer>();
    Stack<Integer> undostacktim = new Stack<Integer>();

 //   Button undobutton=(Button) findViewById(R.id.undo);


    public void inc11(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje1);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 1);
        editText.setText(broj);
        undostackint.push(1);
        undostacktim.push(1);
        //undobutton.setEnabled(true);
    }


    public void inc21(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje2);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 1);
        editText.setText(broj);
        undostackint.push(1);
        undostacktim.push(2);
        //undobutton.setEnabled(true);
    }


    public void inc12(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje1);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 2);
        editText.setText(broj);
        undostackint.push(2);
        undostacktim.push(1);
        //undobutton.setEnabled(true);
    }


    public void inc22(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje2);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 2);
        editText.setText(broj);
        undostackint.push(2);
        undostacktim.push(2);
        //undobutton.setEnabled(true);
    }


    public void inc13(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje1);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 3);
        editText.setText(broj);
        undostackint.push(3);
        undostacktim.push(1);
        //undobutton.setEnabled(true);
    }


    public void inc23(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje2);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 3);
        editText.setText(broj);
        undostackint.push(3);
        undostacktim.push(2);
        //undobutton.setEnabled(true);

    }


    public void undo(View view) {


        if (undostackint.empty()) {
          //   undobutton.setEnabled(false);
        }

        else {
            if (undostacktim.peek() == 1) {
                EditText editText = (EditText) findViewById(R.id.stanje1);

                undostacktim.pop();
                int undobroj = undostackint.pop();
                String broj = editText.getText().toString();
                broj = String.valueOf(Integer.parseInt(broj) - undobroj);
                editText.setText(broj);

            } else if (undostacktim.peek() == 2) {
                EditText editText = (EditText) findViewById(R.id.stanje2);

                undostacktim.pop();
                int undobroj2 = undostackint.pop();
                String broj = editText.getText().toString();
                broj = String.valueOf(Integer.parseInt(broj) - undobroj2);
                editText.setText(broj);

            }

        }
    }
/*
    public void dec1(View view) {
        EditText editText = (EditText) findViewById(R.id.stanje);
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) - 1);
        editText.setText(broj);
    }
*/



/*
    public void inc13(View view) {


        EditText editText = (EditText) findViewById(R.id.stanje1);

        //  int broj = editText.;
        String broj = editText.getText().toString();
        broj = String.valueOf(Integer.parseInt(broj) + 3);
        editText.setText(broj);
    }

*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kosarka, menu);
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
