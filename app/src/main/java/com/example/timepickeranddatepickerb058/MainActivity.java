package com.example.timepickeranddatepickerb058;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TimePicker tp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void time(View v)
    {
        tp=(TimePicker)findViewById(R.id.times);
        tp.setIs24HourView(true);
        Toast.makeText(getBaseContext(),tp.getCurrentHour()+":"+tp.getCurrentMinute(),Toast.LENGTH_LONG).show();
    }

   public void intent(View v)
   {
       startActivity(new Intent(MainActivity.this,Main2Activity.class));
   }
}
