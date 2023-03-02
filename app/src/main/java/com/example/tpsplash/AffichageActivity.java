package com.example.tpsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AffichageActivity extends AppCompatActivity {

    TextView login ;
    TextView password ;

    Button signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);
        login = findViewById(R.id.textView2);
        password  = findViewById(R.id.textView3);
        signout=findViewById(R.id.signout);
        Bundle b=getIntent().getExtras();
        login.setText(b.getString("Name"));
        password.setText(b.getString("Password"));

        Intent i = new Intent(this, SplashActivity.class);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("Name", "");
                b.putString("Password", "");
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}