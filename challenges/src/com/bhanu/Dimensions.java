package com.bhanu;

public class Dimensions {

    private int width;
    private int height;
    private int lenth;


    public Dimensions(int width, int height, int lenth) {
        this.width = width;
        this.height = height;
        this.lenth = lenth;
    }

    public int getWidth() {

        System.out.println("width of the room is "+ width);

        return width;
    }

    public int getHeight() {
        System.out.println("Height of the room is "+ height);
        return height;
    }

    public int getLenth() {
        System.out.println("Lenght of the room is "+ lenth);
        return lenth;
    }
}
