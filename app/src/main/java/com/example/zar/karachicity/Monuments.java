package com.example.zar.karachicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entities_list);


        final ArrayList<GuideEntity> entities=new ArrayList<GuideEntity>();
        entities.add(new GuideEntity("Abdullah Shah Gazi","Clifton",R.drawable.abdul,"24/7"));
        entities.add(new GuideEntity("Mazar-e-Quaid","Nomish Chorangi",R.drawable.mazar,"9am-6pm"));
        entities.add(new GuideEntity("St Patrick's","saddartown",R.drawable.saint,"24/7"));
        entities.add(new GuideEntity("Mahadev Temple","Clifton",R.drawable.mandir,"24/7"));
        entities.add(new GuideEntity("Chawkhandi","29 km in east",R.drawable.grav,"24/7"));
        entities.add(new GuideEntity("Frere Hall","Fatima Jinnah Rd",R.drawable.frerehall,"24/7"));
        entities.add(new GuideEntity("Empress Market","SaddarTown",R.drawable.empressmarket,"7am-9am"));
        entities.add(new GuideEntity("Mohatta Palace","Halmi Alvi Rd",R.drawable.mohatta,"11am-6pm"));


        EntitiesAdapter entitiesAdapter=new EntitiesAdapter(this,entities);
        ListView listView= (ListView) findViewById(R.id.list_item);
        listView.setAdapter(entitiesAdapter);
    }
}
