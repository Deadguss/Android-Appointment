package com.example.appointmentsystem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class PatientRegistrationActivity extends AppCompatActivity {
    private TextView patQuestion;
    private TextView patpageFullname,patpageEmail,patpagePassword;
    private Button patBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);

        patQuestion=findViewById(R.id.patQuestion);
        patQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientRegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        patpageEmail=findViewById(R.id.patpageEmail);
        patpageFullname=findViewById(R.id.patpageFullname);
        patpagePassword=findViewById(R.id.patpagePassword);

        patBtn=findViewById(R.id.patBtn);

        patBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String  email= patpageEmail.getText().toString().trim();
                final String  Fullname= patpageFullname.getText().toString().trim();
                final String  password= patpagePassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    patpageEmail.setError("Email required");
                    return;
                }
                if (TextUtils.isEmpty(Fullname)){
                    patpageFullname.setError("Email required");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    patpagePassword.setError("Password required");
                    return;
                }
            }
        });

    }

}