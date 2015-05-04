package com.example.dhrumil.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class function extends ActionBarActivity {
    private EditText textView;

    private Button back,clear;
    private Button bsin,bcos,btan,bi,bln,blog,bmod,bpi,be,broot,bfact,bexp,bsb1,bsb2,bbx,bEqual;
    String s,aa="",a="",b;
    double d;
    int t;
    String ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.functions);


            back = (Button) findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(function.this, MainActivity.class);
                    intent.putExtra("message", textView.getText().toString());
                    intent.putExtra("ac", ac);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);


                }
            });
            clear = (Button) findViewById(R.id.clear);
            bsin = (Button) findViewById(R.id.bsin);
            bcos = (Button) findViewById(R.id.bcos);
            btan = (Button) findViewById(R.id.btan);
            bi = (Button) findViewById(R.id.bi);
            bln = (Button) findViewById(R.id.bln);
            blog = (Button) findViewById(R.id.blog);
            bmod = (Button) findViewById(R.id.bmod);
            bpi = (Button) findViewById(R.id.bpi);
            be = (Button) findViewById(R.id.be);
            broot = (Button) findViewById(R.id.broot);
            bfact = (Button) findViewById(R.id.bfact);
            bsb1 = (Button) findViewById(R.id.bsb1);
            bsb2 = (Button) findViewById(R.id.bsb2);
            bbx = (Button) findViewById(R.id.bbx);
            bEqual = (Button) findViewById(R.id.bEqual);
            bexp = (Button) findViewById(R.id.bexp);


            Intent intent = getIntent();
            String message = intent.getStringExtra("message");
            ac = intent.getStringExtra("bc");

            textView = (EditText) findViewById(R.id.textView);
            textView.setText(message);

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("");


                }
            });
            bsin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        a = textView.getText().toString();
                        d = Double.valueOf(a).doubleValue();
                        d = Math.toRadians(d);
                        d = Math.sin(d);
                        textView.setText(Double.toString(d));
                    }
                    catch (Exception e)
                    {

                    }


                }
            });
            bcos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        a = textView.getText().toString();
                        d = Double.valueOf(a).doubleValue();
                        d = Math.toRadians(d);
                        d = Math.cos(d);
                        textView.setText(Double.toString(d));
                    }
                    catch (Exception e)
                    {

                    }


                }
            });
            btan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        a = textView.getText().toString();
                        d = Double.valueOf(a).doubleValue();
                        d = Math.toRadians(d);
                        d = Math.tan(d);
                        textView.setText(Double.toString(d));
                    }
                    catch (Exception e)
                    {

                    }


                }
            });
            bbx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = textView.getText().toString();
                    d = Double.valueOf(a).doubleValue();
                    d = 1 / d;
                    textView.setText(Double.toString(d));


                }
            });
            broot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = textView.getText().toString();
                    d = Double.valueOf(a).doubleValue();
                    d = Math.sqrt(d);
                    textView.setText(Double.toString(d));


                }
            });
            bpi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (textView.getText().toString().isEmpty()) {
                        d = 3.1415926535897932384626433832795;
                        textView.setText(Double.toString(d));
                    } else {
                        d = Double.parseDouble(textView.getText().toString()) * 3.1415926535897932384626433832795;
                        textView.setText(Double.toString(d));
                    }


                }
            });
            be.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    d = 2.7182818284590452353602874713527;
                    textView.setText(Double.toString(d));


                }
            });
            bexp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (textView.getText().toString().contains("^")) {
//
                    } else {
                        b = textView.getText().toString();
                        b += "^";
                        textView.setText(b);

                    }

                }
            });
            bfact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {


                        a = textView.getText().toString();
                        t = Integer.parseInt(a);
                        t = factorial(t);
                        textView.setText(Double.toString(t));
                    }
                    catch (Exception e)
                    {

                    }


                }
            });
            bmod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {


                        a = textView.getText().toString();
                        d = Double.parseDouble(a);
                        d = d / 100;
                        textView.setText(Double.toString(d));
                    }
                    catch(Exception e)
                    {

                    }


                }
            });
            bln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {


                        a = textView.getText().toString();
                        d = Double.parseDouble(a);
                        d = (Math.log(d) / Math.log(2.7182818284590452353));
                        textView.setText(Double.toString(d));
                    }
                    catch(Exception e)
                    {

                    }


                }
            });
            blog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {


                        a = textView.getText().toString();
                        d = Double.parseDouble(a);
                        d = (Math.log(d) / Math.log(10));
                        textView.setText(Double.toString(d));
                    }
                    catch (Exception e)
                    {

                    }


                }
            });
        }
        catch (Exception e)
        {

        }








    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


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