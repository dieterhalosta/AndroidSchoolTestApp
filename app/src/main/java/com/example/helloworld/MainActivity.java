package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView txtFirstName = findViewById(R.id.fNameBox);
        TextView txtLastName = findViewById(R.id.lastNameBox);
        TextView txtEmailAddress = findViewById(R.id.emailBox);
        EditText firstName = findViewById(R.id.editFName);
        EditText lastName = findViewById(R.id.lastName);
        EditText emailAddress = findViewById(R.id.emailAddress);


        txtFirstName.setText(firstName.getText().toString());
        txtLastName.setText(lastName.getText().toString());
        txtEmailAddress.setText(emailAddress.getText().toString());
    }
}