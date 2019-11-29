package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // you need do declare button first as i did bellow
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // also you need to find the button or call it by id
        // see bellow

        btn_next = (Button) findViewById(R.id.btn_next_page);

        // set onClick listener see bellow and go up to public class MainActivity and Implement View.onClickListener

        btn_next.setOnClickListener(this);
    }

    // so we have created a method here the on Click listener will start working here

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }
}
