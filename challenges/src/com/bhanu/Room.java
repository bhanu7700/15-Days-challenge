package com.bhanu;

public class Room {

    private int numof;
    private int doors;
    private int windows;
    private int chairs;
    private  Dimensions dimensions;

    //Dimensions dimensions = new Dimensions(45,56,76);


    public Room(int numof, int doors, int windows, int chairs, Dimensions dimensions) {
        this.numof = numof;
        this.doors = doors;
        this.windows = windows;
        this.chairs = chairs;
        this.dimensions = dimensions;
    }

    public int getNumof() {
        System.out.println("there are total "+ numof + " rooms");
        return numof;
    }

    public int getDoors() {
        System.out.println("toatl "+ doors + " doors per room" );
        return doors;
    }

    public int getWindows() {
        System.out.println("total "+ windows + " windows per room");
        return windows;
    }

    public int getChairs() {
        System.out.println("total "+ chairs + " chairs in the house");
        return chairs;
    }

    public Dimensions getDimensions() {
        return dimensions;
   }
}
