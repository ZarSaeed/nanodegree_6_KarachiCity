package com.example.zar.karachicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button hotels,resturants,munoments,parks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiComponent();
        setClickListners();
    }

    private void intiComponent()
    {
        hotels= (Button) findViewById(R.id.button_hotel);
        resturants= (Button) findViewById(R.id.button_resturant);
        munoments= (Button) findViewById(R.id.button_menusments);
        parks= (Button) findViewById(R.id.button_park);
    }

    private void setClickListners()
    {
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHotel=new Intent(v.getContext(),Hotels.class);
                startActivity(intentHotel);
            }
        });
        resturants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHotel=new Intent(v.getContext(),Resturants.class);
                startActivity(intentHotel);
            }
        });
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHotel=new Intent(v.getContext(),Park.class);
                startActivity(intentHotel);
            }
        });
        munoments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHotel=new Intent(v.getContext(),Monuments.class);
                startActivity(intentHotel);
            }
        });
    }


}
