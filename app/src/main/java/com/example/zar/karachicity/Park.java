package com.example.zar.karachicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Park extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entities_list);

        final ArrayList<GuideEntity> entities=new ArrayList<GuideEntity>();
        entities.add(new GuideEntity("Safari Park","Gulshan-e-iqbal",R.drawable.safari,"12-8pm"));
        entities.add(new GuideEntity("Zamzama Park","zamzama",R.drawable.park,"4-10:30pm"));
        entities.add(new GuideEntity("Baghi ibn-e-Qasim","Clifton",R.drawable.bagh,"24/7"));
        entities.add(new GuideEntity("Aladin Park","Gulshan-e-iqbal",R.drawable.aladin,"4pm-12am"));
        entities.add(new GuideEntity("Karachi Zoo","Garden west",R.drawable.zoo,"8am-8pm"));
        entities.add(new GuideEntity("Quaid-e-Azam","Gulshan Hadeed",R.drawable.quaid,"7am-11pm"));
        entities.add(new GuideEntity("Askari Park","University Rd",R.drawable.askari,"9am-11:30am"));



        EntitiesAdapter entitiesAdapter=new EntitiesAdapter(this,entities);
        ListView listView= (ListView) findViewById(R.id.list_item);
        listView.setAdapter(entitiesAdapter);
    }



}
