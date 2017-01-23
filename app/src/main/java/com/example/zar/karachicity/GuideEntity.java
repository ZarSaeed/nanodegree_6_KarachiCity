package com.example.zar.karachicity;

/**
 * Created by Zar on 12/24/2016.
 */

public class GuideEntity {
    private String entityName,entityLocation;
    private int entityImage,entityPrice;
    private String entityTime;
    private int mImage=NO_IMAGE_HERE;
    private static int NO_IMAGE_HERE=-1;

    public GuideEntity(String entityName,String entityLocation,int entityImage,int entityPrice)
    {
        this.entityName=entityName;
        this.entityLocation=entityLocation;
        this.entityImage=entityImage;
        this.entityPrice=entityPrice;
    }
    public GuideEntity(String entityName,String entityLocation,int entityImage,String entityTime)
    {
        this.entityName=entityName;
        this.entityLocation=entityLocation;
        this.entityImage=entityImage;
        this.entityTime=entityTime;
    }


    public int getEntityImage() {
        return entityImage;
    }

    public int getEntityPrice() {
        return entityPrice;
    }

    public String getEntityLocation() {
        return entityLocation;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getEntityTime() {
        return entityTime;
    }

    public boolean hasImage(){return NO_IMAGE_HERE!=mImage; }
}

