package com.example.beebugsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseAuthenticationType extends AppCompatActivity {

    Button Email, Phone, Google, Facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_authentication_type);

        Email = (Button) findViewById(R.id.button4);
        Phone = (Button) findViewById(R.id.button5);
        Google = (Button) findViewById(R.id.button6);
        Facebook = (Button) findViewById(R.id.button7);

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseAuthenticationType.this,signin.class));
            }
        });

        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseAuthenticationType.this,AuthenticationViaPhone.class));
            }
        });

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseAuthenticationType.this,ByGoogle.class));
            }
        });

        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseAuthenticationType.this,ByFacebook.class));
            }
        });
    }
}