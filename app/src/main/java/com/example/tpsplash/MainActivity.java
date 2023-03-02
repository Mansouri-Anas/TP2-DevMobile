package com.example.tpsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText password;

    Button Connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Connect = findViewById(R.id.login);
        Intent i = new Intent(this, AffichageActivity.class);

        Connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("Name", login.getText().toString());
                b.putString("Password", password.getText().toString());
                i.putExtras(b);
                startActivity(i);

            }
        });


    }
}