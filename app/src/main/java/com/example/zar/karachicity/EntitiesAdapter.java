package com.example.zar.karachicity;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zar on 12/24/2016.
 */

public class EntitiesAdapter extends ArrayAdapter<GuideEntity> {

    public EntitiesAdapter(Activity context,ArrayList<GuideEntity> entitiesList)
    {
        super(context,0,entitiesList);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItems=convertView;

        if(listViewItems==null)
        {
            listViewItems= LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false);

        }

        GuideEntity currentEntity=getItem(position);

        TextView entity_name= (TextView) listViewItems.findViewById(R.id.entity_name);
        TextView entity_loc= (TextView) listViewItems.findViewById(R.id.entity_loc);
        ImageView entity_image= (ImageView) listViewItems.findViewById(R.id.entity_image);
        TextView entity_price= (TextView) listViewItems.findViewById(R.id.entity_price);
        entity_name.setText(currentEntity.getEntityName());
        entity_loc.setText(currentEntity.getEntityLocation());
        entity_image.setImageResource(currentEntity.getEntityImage());
        entity_image.setVisibility(View.VISIBLE);
        if (currentEntity.getEntityTime()!=null)
        {
            entity_price.setText(currentEntity.getEntityTime());
        }
        else{
        entity_price.setText(""+currentEntity.getEntityPrice());}




        return listViewItems;
    }
}
