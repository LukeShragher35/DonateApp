package com.example.donateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DonateActivity extends AppCompatActivity {

    private TextView WELCOME;
    private TextView PLEAD;
    private RadioGroup BOX;
    private RadioButton CHECK;
    private RadioButton DIRECT;
    private EditText NUMBERPICK;
    private Button UPLOAD;
    private ImageView ART;
    private ProgressBar UNO;
    private ProgressBar DOS;
    private TextView AMOUNT;
    private EditText DONATEAPP;
    private Button DONATE;
    private TextView TOTALFAR;
    private EditText TOTAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        WELCOME = (TextView)findViewById(R.id.welcome);
        PLEAD = (RadioGroup)findViewById(R.id.box);}
}