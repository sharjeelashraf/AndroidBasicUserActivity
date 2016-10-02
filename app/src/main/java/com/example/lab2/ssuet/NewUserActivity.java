package com.example.lab2.ssuet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewUserActivity extends AppCompatActivity {
EditText edituser, editpass, editconfirm;
    String username, password, confirmpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);
         edituser = (EditText) findViewById(R.id.username);
        editpass = (EditText) findViewById(R.id.password);
        editconfirm = (EditText) findViewById(R.id.confirmpassword);

    }
    public void submit(View view)
    {
        username = edituser.getText().toString();
        password = editpass.getText().toString();
        confirmpass = editconfirm.getText().toString();
        if (username.isEmpty()) {
            // doSomething
            Toast.makeText(this, "Please fill Username", Toast.LENGTH_SHORT).show();
        }
        else if (password.isEmpty()) {
            // doSomething
            Toast.makeText(this, "Please fill password", Toast.LENGTH_SHORT).show();
        }

       else if (confirmpass.isEmpty()) {
            // doSomething
            Toast.makeText(this, "Please fill confirm pass", Toast.LENGTH_SHORT).show();
        }

       else if (!password.equals(confirmpass))
        {
            Toast.makeText(this, "Both pass need to be same", Toast.LENGTH_SHORT).show();
        }
        else if(username != null && password != null && confirmpass != null && password.equals(confirmpass))
        {
            Intent i = new Intent(getBaseContext(), ExistingUserActivity.class);

            startActivity(i);
        }

        //3.	OnClick of submit button check password should not be empty. If its empty show a Toast message “Please fill Password”.
    }
}
