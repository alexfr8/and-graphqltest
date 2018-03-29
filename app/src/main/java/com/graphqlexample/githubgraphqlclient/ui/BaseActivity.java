package com.graphqlexample.githubgraphqlclient.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected  void onResume() {
        super.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onBackPressed(){
        // avoid hardaware back button
    }
}