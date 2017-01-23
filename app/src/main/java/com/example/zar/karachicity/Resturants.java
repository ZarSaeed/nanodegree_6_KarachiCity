package com.example.zar.karachicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Resturants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entities_list);

        final ArrayList<GuideEntity> entities=new ArrayList<GuideEntity>();
        entities.add(new GuideEntity("Mei Kong Chinese","NorthNazimabad",R.drawable.meikong,"12pm-11pm"));
        entities.add(new GuideEntity("Largess","NorthNazimabad",R.drawable.largess,"6:30am-9pm"));
        entities.add(new GuideEntity("Cafe flo","26th street,clifton",R.drawable.cafeflo,"8am-7pm"));
        entities.add(new GuideEntity("Food Bowl","Johar Mor Rd",R.drawable.food,"12:30pm-11pm"));
        entities.add(new GuideEntity("Lal-Qila","Shahrh-e-faisal",R.drawable.resturant,"12:30pm-11:30pm"));
        entities.add(new GuideEntity("Capsicum","Gulshan-e-iqbal",R.drawable.capsicum,"1pm-11pm"));



        EntitiesAdapter entitiesAdapter=new EntitiesAdapter(this,entities);
        ListView listView= (ListView) findViewById(R.id.list_item);
        listView.setAdapter(entitiesAdapter);

    }
}
