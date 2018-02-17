package edu.ggc.tsegaye.chapter1caseproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.btn1_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("button 1", "clicked");
                startActivity(new Intent(MainActivity.this, techQuotes.class));
            }
        });

        Button button2 = (Button) findViewById(R.id.btn1_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("button 2", "clicked");
                startActivity(new Intent(MainActivity.this, dessertNames.class));
            }
        });

        Button button3 = (Button) findViewById(R.id.btn1_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("button 3", "clicked");
                startActivity(new Intent(MainActivity.this, LargeTechCompanies.class));
            }
        });
    }
}