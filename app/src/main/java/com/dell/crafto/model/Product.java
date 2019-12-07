package com.dell.crafto.model;

import android.graphics.Bitmap;

public class Product {

    private int id;
    private String name, discription,price;
    private Bitmap bitmap;

    public Product(String name, String discription, String price, Bitmap bitmap) {
        this.name = name;
        this.discription = discription;
        this.price = price;
        this.bitmap = bitmap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
