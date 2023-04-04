package com.example.da1.Models;

public class Style {
    private int id;
    private String name;
    private int image;

    public Style() {
    }

    public Style(int id, String name, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Style(String name, int image) {
        this.name = name;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
