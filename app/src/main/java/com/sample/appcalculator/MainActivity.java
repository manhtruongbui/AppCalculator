package com.sample.appcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,buttonC,buttonAdd,buttonSub,buttonMul,buttonDiv,buttonEql;
    EditText crunchifyEditText;

    float mValueOne,mValueTwo;
    boolean crunchifyAdd, mSubtract, crunchifyMul, crunchifyDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn_0);
        button1 = (Button) findViewById(R.id.btn_1);
        button2 = (Button) findViewById(R.id.btn_2);
        button3 = (Button) findViewById(R.id.btn_3);
        button4 = (Button) findViewById(R.id.btn_4);
        button5 = (Button) findViewById(R.id.btn_5);
        button6 = (Button) findViewById(R.id.btn_6);
        button7 = (Button) findViewById(R.id.btn_7);
        button8 = (Button) findViewById(R.id.btn_8);
        button9 = (Button) findViewById(R.id.btn_9);
        button10 = (Button) findViewById(R.id.btn_dot);
        buttonC = (Button) findViewById(R.id.btn_c);
        buttonAdd = (Button) findViewById(R.id.btn_add);
        buttonSub = (Button) findViewById(R.id.btn_sub);
        buttonMul = (Button) findViewById(R.id.btn_mul);
        buttonDiv = (Button) findViewById(R.id.btn_div);
        buttonEql = (Button) findViewById(R.id.btn_eql);

        crunchifyEditText = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                }else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyAdd = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

         buttonSub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mValueOne = Float.parseFloat(crunchifyEditText.getText() +"");
                 mSubtract = true;
                 crunchifyEditText.setText(null);
             }
         });

         buttonMul.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                 crunchifyMul = true;
                 crunchifyEditText.setText(null);
             }
         });

         buttonDiv.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                 crunchifyDiv = true;
                 crunchifyEditText.setText(null);
             }
         });

         buttonEql.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mValueTwo = Float.parseFloat(crunchifyEditText.getText() +"");

                 if(crunchifyAdd == true) {
                     crunchifyEditText.setText(mValueOne + mValueTwo + "");
                     crunchifyAdd =false;
                 }
                 if(mSubtract ==true) {
                     crunchifyEditText.setText(mValueOne - mValueTwo + "");
                     mSubtract = false;
                 }
                 if(crunchifyMul == true) {
                     crunchifyEditText.setText(mValueOne * mValueOne + "");
                     crunchifyMul = false;
                 }
                 if(crunchifyDiv == true) {
                     crunchifyEditText.setText(mValueOne / mValueTwo + "");
                     crunchifyDiv = false;
                 }
             }
         });

         buttonC.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 crunchifyEditText.setText("");
             }
         });

         button10.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 crunchifyEditText.setText(crunchifyEditText.getText() + ".");
             }
         });

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