package com.example.recyclerviewatv;

public class Item {
    String name;
    String type;
    int image;

    public Item(String name, String type, int image){
        this.name = name;
        this.type = type;
        this.image = image;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getImage(){
        return this.image;
    }

    void setName(String name){
        this.name = name;
    }

    void setType(String type){
        this.type = type;
    }

    void setImage(int image){
        this.image = image;
    }
}
