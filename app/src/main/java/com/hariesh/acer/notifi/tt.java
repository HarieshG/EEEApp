package com.hariesh.acer.notifi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class tt extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tt);
        CardView ems = (CardView) findViewById(R.id.em);
        CardView ems1 = (CardView) findViewById(R.id.em1);
        CardView ems2 = (CardView) findViewById(R.id.em2);
        CardView ems3 = (CardView) findViewById(R.id.em4);
        CardView ems4 = (CardView) findViewById(R.id.em5);
        ems.setOnClickListener(this);
        ems1.setOnClickListener(this);
        ems2.setOnClickListener(this);
        ems3.setOnClickListener(this);
        ems4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId())
        {
            case R.id.em : i = new Intent(this,monday.class); startActivity(i); break;
            case R.id.em1 : i = new Intent(this,tuesday.class); startActivity(i); break;
            case R.id.em2 : i = new Intent(this,wednes.class); startActivity(i); break;
            case R.id.em4 : i = new Intent(this,thurs.class); startActivity(i); break;
            case R.id.em5 : i = new Intent(this,friday.class); startActivity(i); break;
            default:break;
        }
    }
}
