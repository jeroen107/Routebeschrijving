package com.example.jeroe.routebeschrijving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        TextView time = (TextView)findViewById(R.id.textView22);
        time.setText(currentDateTimeString);

    }




    public void onClick3(View view){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void onClick4(View view){
        Intent intent = new Intent(this,MapsActivity2.class);
        startActivity(intent);
    }

}
