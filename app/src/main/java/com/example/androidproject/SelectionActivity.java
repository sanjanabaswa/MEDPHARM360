package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectionActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
    public static final int Doctor = 0;
    public static final int Patient = 0;
    public static final int back1 = 0;


    public void doctorClick(View v){
        Intent intent = new Intent(this,DoctorSignupActivity.class);
        startActivityForResult(intent,Doctor);

    }
    public void patientClick(View v){
        Intent intent = new Intent(this,PatientSignupActivity.class);
        startActivityForResult(intent,Patient);

    }
    public void back1Click(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent,back1);
    }

    public void onDoctor(View v) {
        Intent intent = new Intent(this, DoctorSignupActivity.class);
        startActivityForResult(intent,1);
    }

    public void onPatient(View v) {
        Intent intent = new Intent(this, PatientSignupActivity.class);
        startActivityForResult(intent,1);
    }

}
