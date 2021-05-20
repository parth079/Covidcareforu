package com.example.covidcareforu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16;
    TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner =(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter =new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.hospital));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        tv1 =findViewById(R.id.tv1);
        tv2 =findViewById(R.id.tv2);
        tv3 =findViewById(R.id.tv3);
        tv4 =findViewById(R.id.tv4);
        tv5 =findViewById(R.id.tv5);
        tv6 =findViewById(R.id.tv6);
        tv7 =findViewById(R.id.tv7);
        tv8 =findViewById(R.id.tv8);
        tv9 =findViewById(R.id.tv9);
        tv10 =findViewById(R.id.tv10);
        tv11 =findViewById(R.id.tv11);
        tv12 =findViewById(R.id.tv12);
        tv13 =findViewById(R.id.tv13);
        tv14 =findViewById(R.id.tv14);
        tv15=findViewById(R.id.tv15);
        tv16 =findViewById(R.id.tv16);

        n1 =findViewById(R.id.n1);
        n2 =findViewById(R.id.n2);
        n3 =findViewById(R.id.n3);
        n4 =findViewById(R.id.n4);
        n5 =findViewById(R.id.n5);
        n6 =findViewById(R.id.n6);
        n7 =findViewById(R.id.n7);
        n8 =findViewById(R.id.n8);
        n9 =findViewById(R.id.n9);
        n10 =findViewById(R.id.n10);
        n11 =findViewById(R.id.n11);
        n12 =findViewById(R.id.n12);





    }
}