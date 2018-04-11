package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that directs you to 5*5 grid
        Button ultra =  findViewById(R.id.ultra);

        //set a clicklistener on the view
        ultra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a toast message "Good Luck"
                Toast.makeText(v.getContext(), "Good Luck!!", Toast.LENGTH_LONG).show();

                //Create a new intent to open the {@link UltraMode}

                Intent ultraIntent = new Intent(MainActivity.this, UltraMode.class);

                //Start the new activity
                startActivity(ultraIntent);
            }
        });
        //Find the View that directs you to 3*3 grid

        Button simple =  findViewById(R.id.simple);

        //set a clicklistener on the view
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a toast message "Good Luck"
                Toast.makeText(v.getContext(), "Simple Mode", Toast.LENGTH_LONG).show();

                //Create a new intent to open the {@link SimpleMode}

                Intent simpleIntent = new Intent(MainActivity.this, simplemode.class);

                //Start the new activity
                startActivity(simpleIntent);
            }
        });

    }
}
