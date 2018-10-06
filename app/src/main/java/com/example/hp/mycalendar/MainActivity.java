package com.example.hp.mycalendar;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button button;
Calendar calendar=Calendar.getInstance();
int mDate = calendar.get(Calendar.DAY_OF_MONTH);
int mMonth = calendar.get(Calendar.MONTH);
int mYear = calendar.get(Calendar.YEAR);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this,mDate+"/"+(mMonth + 1)+"/"+mYear, Toast.LENGTH_SHORT).show();
                new DatePickerDialog(MainActivity.this,onDateSetListener,mYear,mMonth,mDate).show();
            }
        });
    }/*
    DatePickerDialog.OnDateSetListener onDateSetListener=new DatePickerDialog.OnDateSetListener(){

        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            Toast.makeText(MainActivity.this, i2+"/"+(i1+1)+"/"+i, Toast.LENGTH_SHORT).show();
        }
    };*/
    DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            Toast.makeText(MainActivity.this,dayOfMonth+"/"+(month+1)+"/"+year, Toast.LENGTH_SHORT).show();

        }
    };
}
