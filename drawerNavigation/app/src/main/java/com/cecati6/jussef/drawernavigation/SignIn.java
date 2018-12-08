package com.cecati6.jussef.drawernavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SignIn extends AppCompatActivity {

    Button cancel;
    Button login2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        cancel=findViewById(R.id.btnCancel);
        login2=findViewById(R.id.btnLogin2);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignIn.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignIn.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
