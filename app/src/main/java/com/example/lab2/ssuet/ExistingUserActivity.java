package com.example.lab2.ssuet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ExistingUserActivity extends AppCompatActivity {
EditText email, pass;
    String stringemail, stringpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existinguser);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);


    }
    public void signin(View view)
    {
        stringemail = email.getText().toString();
        stringpass = pass.getText().toString();

        if (stringemail.isEmpty()) {
            // doSomething
            Toast.makeText(this, "Please fill Username", Toast.LENGTH_SHORT).show();
        }

      else if (stringpass.isEmpty()) {

                Toast.makeText(this, "Please fill password", Toast.LENGTH_SHORT).show();
        }

       else if (stringemail.equals("ssuet@gmail.com") && stringpass.equals("ssuet")) {
            // doSomething
            Toast.makeText(this, "Congratulations!", Toast.LENGTH_SHORT).show();
        }



        //3.	OnClick of submit button check password should not be empty. If its empty show a Toast message “Please fill Password”.
    }
    public void forget(View view)
    {

        Toast.makeText(this, "Wait for Username password!", Toast.LENGTH_SHORT).show();
        String[] schoolbag = new String[1];

        // add elements to the array
        schoolbag[0] = "ssuet@gmail.com";

      composeEmail(schoolbag, "SUBJECT LINE");
        //3.	OnClick of submit button check password should not be empty. If its empty show a Toast message “Please fill Password”.
    }


    public void composeEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
