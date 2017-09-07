package com.example.thanyani.vendalandtourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    VendaTour vendaTour;
    TextView topic,descrip;
    ImageView imageView;
    RecyclerView us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        topic = (TextView) findViewById(R.id.textView);
        descrip = (TextView) findViewById(R.id.textView2);
        imageView= (ImageView) findViewById(R.id.imageView);
        Intent intent = getIntent();
        vendaTour = (VendaTour) intent.getSerializableExtra("daki") ;
        descrip.setText(vendaTour.getText());
        topic.setText(vendaTour.getTopic());
        imageView.setImageResource(vendaTour.getImage());
    }


    }

