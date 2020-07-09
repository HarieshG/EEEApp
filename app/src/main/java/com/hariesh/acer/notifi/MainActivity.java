package com.hariesh.acer.notifi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView timecard = findViewById(R.id.timetable);
        CardView facultycard = findViewById(R.id.faculty);
        CardView calendercard = findViewById(R.id.cal);
        CardView coursecard = findViewById(R.id.cinfo);

        timecard.setOnClickListener(this);
        facultycard.setOnClickListener(this);
        calendercard.setOnClickListener(this);
        coursecard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId())
        {
            case R.id.timetable : i = new Intent(this,tt.class); startActivity(i); break;
            case R.id.faculty : i = new Intent(this,facul.class); startActivity(i); break;
            case R.id.cal : i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1uufOl2ASzgiIFXc0ZAi_tipCmGZ0qXTx")); startActivity(i); break;
            case R.id.cinfo : i = new Intent(this,coursei.class); startActivity(i); break;
            default:break;
        }
    }
}
