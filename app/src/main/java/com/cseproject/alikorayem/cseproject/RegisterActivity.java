package com.cseproject.alikorayem.cseproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void doRegister(View view) {
        Toast.makeText(this, "Successful register", Toast.LENGTH_SHORT).show();
    }
}
