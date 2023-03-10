package com.example.donateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    private EditText USERNAME;
    private EditText PASSWORD;
    private Button LOGIN;
    private Button CANCEL;
    private ImageView GANNONLOGO;
    private TextView TITLE;
    private TextView ATTEMPTS;
    private int COUNT = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        USERNAME = (EditText)findViewById(R.id.username);
        PASSWORD = (EditText)findViewById(R.id.password);
        LOGIN = (Button) findViewById(R.id.login);
        CANCEL = (Button) findViewById(R.id.cancel);
        GANNONLOGO = (ImageView)findViewById(R.id.imageView);
        TITLE = (TextView)findViewById(R.id.textView);
        ATTEMPTS = (TextView)findViewById(R.id.numattempts);

        ATTEMPTS.setText("Number of Attempts Remaining: 5");
        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(USERNAME.getText().toString(), PASSWORD.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPass){
        if((userName == "username") && (userPass == "password")){
            Intent intent = new Intent(LoginActivity.this, DonateActivity.class);
            startActivity(intent);
        } else{
            COUNT--;

            ATTEMPTS.setText("Number of Attempts Left: " + String.valueOf(COUNT));

            if(COUNT == 0){
               LOGIN.setEnabled(false);
           }
        }
    }
}