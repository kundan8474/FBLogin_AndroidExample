package com.android.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity {

    LoginButton loginButton;
    TextView textView;
    CallbackManager callbackManager;
    Button about,faq,tnc,shippingReturns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        loginButton=(LoginButton)findViewById(R.id.fbLoginButton);
        textView=(TextView)findViewById(R.id.textView);
        about=(Button)findViewById(R.id.AboutUsButton);
        faq=(Button)findViewById(R.id.faqButton);
        tnc=(Button)findViewById(R.id.tncButton);
        shippingReturns=(Button)findViewById(R.id.shipping_returns_button);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AboutUs.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FAQs.class);
                startActivity(intent);
            }
        });

        tnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),TNC.class);
                startActivity(intent);
            }
        });

        shippingReturns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Shipping_Returns.class);
                startActivity(intent);
            }
        });

        // facebook login integration
        callbackManager=CallbackManager.Factory.create();

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                    textView.setText("Login Succcess :"+loginResult.getAccessToken().getUserId()+"\n"+loginResult.getAccessToken().getToken());
            }

            @Override
            public void onCancel() {
                    textView.setText("Cancelled by User");
            }

            @Override
            public void onError(FacebookException error) {
                    textView.setText("error occured");
            }
        })

    }

    // this function will register the activity result coming from the facebook sdk
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
