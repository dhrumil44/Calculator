package com.example.dhrumil.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {


        private Button functions, clear;
        private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDevide, bEqual, bSum, bMulti, bDot, bMinus;
        public EditText display;
        EditText textView;
        Float d, r;
        String a = "", aa = "", b = "";
        double f;
        Intent intent = getIntent();
        @Override
        protected void onCreate (Bundle savedInstanceState){
            try {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                functions = (Button) findViewById(R.id.functions);
                clear = (Button) findViewById(R.id.clear);


                b0 = (Button) findViewById(R.id.b0);
                b1 = (Button) findViewById(R.id.b1);
                b2 = (Button) findViewById(R.id.b2);
                b3 = (Button) findViewById(R.id.b3);
                b4 = (Button) findViewById(R.id.b4);
                b5 = (Button) findViewById(R.id.b5);
                b6 = (Button) findViewById(R.id.b6);
                b7 = (Button) findViewById(R.id.b7);
                b8 = (Button) findViewById(R.id.b8);
                b9 = (Button) findViewById(R.id.b9);
                bDot = (Button) findViewById(R.id.bDot);
                bDevide = (Button) findViewById(R.id.bDevide);
                bMinus = (Button) findViewById(R.id.bMinus);
                bMulti = (Button) findViewById(R.id.bMulti);
                bSum = (Button) findViewById(R.id.bSum);
                bEqual = (Button) findViewById(R.id.bEqual);
                textView = (EditText) findViewById(R.id.textView);
                clear = (Button) findViewById(R.id.clear);


                final Intent intent = getIntent();
                a = intent.getStringExtra("message");
                textView.setText(a);


                functions.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String send = textView.getText().toString();
                        Intent intent = new Intent(MainActivity.this, function.class);
                        intent.putExtra("message", textView.getText().toString());
                        intent.putExtra("bc", a);

                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        startActivity(intent);


                    }
                });

                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "0";
                            aa += "0";

                            textView.setText(b);

                        } else {
                            //  if(textView.getText().toString())
                            a = textView.getText().toString();
                            a += "0";
                            textView.setText(a);
                        }


                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "1";
                            aa += "1";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "1";
                            textView.setText(a);
                        }

                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "2";
                            aa += "2";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "2";
                            textView.setText(a);
                        }


                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "3";
                            aa += "3";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "3";
                            textView.setText(a);
                        }
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "4";
                            aa += "4";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "4";
                            textView.setText(a);
                        }

                    }
                });

                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "6";
                            aa += "6";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "6";
                            textView.setText(a);
                        }
                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "5";
                            aa += "5";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "5";
                            textView.setText(a);
                        }

                    }
                });

                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "7";
                            aa += "7";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "7";
                            textView.setText(a);
                        }

                    }
                });

                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "8";
                            aa += "8";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "8";
                            textView.setText(a);
                        }

                    }
                });

                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
                            b = textView.getText().toString();
                            b += "9";
                            aa += "9";

                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += "9";
                            textView.setText(a);
                        }

                    }
                });

                bDot.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {
                        if (a.contains(".") && aa.contains(".")) {
//
                        } else if ((textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/")) && !aa.contains(".")) {
                            b = textView.getText().toString();
                            b += ".";
                            aa += ".";
                            textView.setText(b);

                        } else {
                            a = textView.getText().toString();
                            a += ".";
                            textView.setText(a);
                        }
                    }
                });
                bSum.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
//
                        } else {
                            b = textView.getText().toString();
                            b += "+";
                            textView.setText(b);

                        }

                    }
                });
                bMinus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
//
                        } else {
                            b = textView.getText().toString();
                            b += "-";
                            textView.setText(b);

                        }

                    }
                });
                bMulti.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
//
                        } else {
                            b = textView.getText().toString();
                            b += "*";
                            textView.setText(b);

                        }

                    }
                });
                bDevide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("*") || textView.getText().toString().contains("/") || textView.getText().toString().contains("^")) {
//
                        } else {
                            b = textView.getText().toString();
                            b += "/";
                            textView.setText(b);

                        }

                    }
                });
                bEqual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (aa.isEmpty()) {

                        } else if (textView.getText().toString().contains("+")) {
                            d = (Float.valueOf(a).floatValue() + Float.valueOf(aa).floatValue());
                            textView.setText(d.toString());
                            a = (Double.toString(d));
                            aa = "";
                            b = "";
                        } else if (textView.getText().toString().contains("-")) {
                            d = (Float.valueOf(a).floatValue() - Float.valueOf(aa).floatValue());
                            textView.setText(d.toString());
                            a = (Double.toString(d));
                            aa = "";
                            b = "";
                        } else if (textView.getText().toString().contains("/")) {
                            f = (Float.parseFloat(a) / Float.parseFloat(aa));
                            textView.setText(Double.toString(f));
                            a = (Double.toString(f));
                            aa = "";
                            b = "";
                        } else if (textView.getText().toString().contains("*")) {
                            f = (Double.valueOf(a).doubleValue() * Double.valueOf(aa).doubleValue());
                            textView.setText(Double.toString(f));
                            a = (Double.toString(f));
                            aa = "";
                            b = "";
                        } else if (textView.getText().toString().contains("^")) {
                            a = intent.getStringExtra("ac");
                            f = Math.pow(Double.valueOf(a).doubleValue(), Double.valueOf(aa).doubleValue());
                            textView.setText(Double.toString(f));
                            a = (Double.toString(f));
                            aa = "";
                            b = "";
                        }

                    }
                });
                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        a = "";
                        aa = "";
                        b = "";
                        textView.setText("");


                    }
                });
            }
            catch (Exception e) {

            }

    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
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
