package com.example.zar.karachicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entities_list);

        final ArrayList<GuideEntity> entities=new ArrayList<GuideEntity>();
        entities.add(new GuideEntity("Movenpick","Club Rd",R.drawable.moven,22737));
        entities.add(new GuideEntity("Marriot","9 Abdullah Haroon Rd",R.drawable.marriot,18527));
        entities.add(new GuideEntity("Pearl C","Dr Ziauddin Ahmed Rd",R.drawable.pearlcontinental,20012));
        entities.add(new GuideEntity("Sarawan","Raja Ghazanfar Ali Rd",R.drawable.sarawan,5500));
        entities.add(new GuideEntity("Avari Tower","Fatima Jinnah Rd",R.drawable.avari,23120));
        entities.add(new GuideEntity("Dream Resort","Gulshan-I-Maymar Rd",R.drawable.dreamworld,6180));

        EntitiesAdapter entitiesAdapter=new EntitiesAdapter(this,entities);
        ListView listView= (ListView) findViewById(R.id.list_item);
        listView.setAdapter(entitiesAdapter);


    }
}
