package com.x10host.dhanushpatel.quickthrow.javacode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.x10host.dhanushpatel.quickthrow.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void throwStart(View v){
        startActivity(new Intent(getApplicationContext(), ThrowingActivity.class));
    }



}
