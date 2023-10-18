package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupActivity extends AppCompatActivity {
    RadioGroup check_gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        check_gender = findViewById(R.id.radio_group);

        check_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioGroup radioButton = findViewById(checkedId);

                 Toast.makeText(RadioGroupActivity.this, "you click" + radioButton.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}