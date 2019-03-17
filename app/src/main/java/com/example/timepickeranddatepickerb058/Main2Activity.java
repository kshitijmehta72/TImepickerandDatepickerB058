package com.example.timepickeranddatepickerb058;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
     DatePicker dp;
     Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dp=(DatePicker)findViewById(R.id.datep);



    }
    public void dates(View v)
    {
        Toast.makeText(Main2Activity.this, dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear(), Toast.LENGTH_LONG).show();
    }
}
