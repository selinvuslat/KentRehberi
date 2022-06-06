package com.mobileappselin.cityguide.Common.LoginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobileappselin.cityguide.R;

public class SignUp extends AppCompatActivity {

    //Variables
    ImageView backBtn;
    Button createaccount, login;
    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Hooks
        backBtn = findViewById(R.id.signup_back_button);
        createaccount = findViewById(R.id.create_account_button);
        titleText = findViewById(R.id.signup_title_text);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUp.super.onBackPressed();
            }
        });
    }

    public void callNextSignupScreen(View view) {

        Intent intent = new Intent(getApplicationContext(), Login.class);

        //Add Transition
        Pair[] pairs = new Pair[3];

        pairs[0] = new Pair<View, String>(backBtn, "transition_back_arrow_btn");
        pairs[1] = new Pair<View, String>(createaccount, "transition_create_account_btn");
        pairs[2] = new Pair<View, String>(titleText, "transition_title_btn");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUp.this, pairs);
            startActivity(intent, options.toBundle());
        } else {
            startActivity(intent);
        }

    }

}