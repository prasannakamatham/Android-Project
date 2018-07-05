package com.example.macstudent.employeepayrollsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {
    Button login;
    EditText mail,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mail=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";

String email=mail.getText().toString();
                Matcher matcher = Pattern.compile(validemail).matcher(email);
                if(matcher.matches()){
                    Toast.makeText(getApplicationContext(), "true",Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(getApplicationContext(), "enter valid email",Toast.LENGTH_LONG).show();
                }
                if (password.getText().toString().equals("")) {
                    password.setError("Enter password");
                }
            }
        });

    }
}
