package com.example.macstudent.employeepayrollsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Userprofile extends AppCompatActivity {

    private TextView emailText;
    private TextView lastLoggedInText;
    private EditText nameText;
    private EditText oldPasswordText;
    private EditText passwordText;
    private EditText confirmPasswordText;
    private EditText mobileText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        oldPasswordText = (EditText) findViewById(R.id.input_old_password);
        passwordText = (EditText) findViewById(R.id.input_new_password);
        confirmPasswordText = (EditText) findViewById(R.id.input_confirm_password);
        mobileText = (EditText) findViewById(R.id.input_mobile);
        updateButton = (Button) findViewById(R.id.btn_update);
        lastLoggedInText = (TextView) findViewById(R.id.input_last_login);

    }

}
