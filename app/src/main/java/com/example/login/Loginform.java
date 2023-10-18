package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Loginform extends AppCompatActivity {
    Button here_login;

    TextView registere_here;

    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);
        here_login = findViewById(R.id.login_here);

        registere_here = findViewById(R.id.registere_here);

        here_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://letsview.com/screen-mirroring"));
              startActivity(intent);

            }

        });
        registere_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Loginform.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}