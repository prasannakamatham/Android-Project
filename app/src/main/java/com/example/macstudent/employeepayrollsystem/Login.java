package com.example.macstudent.employeepayrollsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                Login();
            }

        });

    private void Login()
        {
            String name= mail.getText().toString().trim();
            String pass=password.getText().toString().trim();
            if(name.equals("user@employee.com") && pass.equals("s3cr3t"))
            {
                Toast.makeText(this, "Credentials matched",Toast.LENGTH_LONG).show();
                Intent home = new Intent(Login.this,HomeScreen.class);
                startActivity(home);
            }
            else
                Toast.makeText(this, "Error Login",Toast.LENGTH_LONG).show();

        }
    }

}






