package com.hariesh.acer.notifi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class coursei extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursei);
        CardView ems = (CardView) findViewById(R.id.em);
        CardView ems1 = (CardView) findViewById(R.id.em1);
        CardView ems2 = (CardView) findViewById(R.id.em2);
        CardView ems3 = (CardView) findViewById(R.id.em4);
        CardView ems4 = (CardView) findViewById(R.id.em5);
        ems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1dy-qfHXZ51yIZetrr_bwf2YCZzvfcdaG"));
                startActivity(intent);
            }
        });
        ems1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1idcE_la2rdG8AwQpgGkcNApY6L7RwXmi"));
                startActivity(intent);

            }
        });
        ems2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1rJfJWKk_TSeth5IyuC8kvhJYvKiQ8gkl"));
                startActivity(intent);
            }
        });
        ems3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ZWZDFTVQ7WivzeId6zvSrV32PhPulAzR"));
                startActivity(intent);
            }
        });
        ems4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1okuPuBHAeI95DZNJ7iisaef_0DprMWIC"));
                startActivity(intent);
            }
        });
    }
}
