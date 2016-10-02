package com.example.lab2.ssuet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button, button0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
addListenerOnButton();

    }
    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent i = new Intent(getBaseContext(), NewUserActivity.class);

                startActivity(i);

            }

        });  button0 = (Button) findViewById(R.id.button0);

        button0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent i = new Intent(getBaseContext(), ExistingUserActivity.class);

                startActivity(i);

            }

        });

    }
}
