package com.verifrat.verifratapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginSignup extends AppCompatActivity {

    private Button signupBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
        signupBtn =  (Button)findViewById(R.id.button);

        signupBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent = new Intent(LoginSignup.this, MainActivity.class);
                LoginSignup.this.startActivity(mainIntent);
                LoginSignup.this.finish();
            }
        });
    }
}
