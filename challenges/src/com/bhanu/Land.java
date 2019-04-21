package com.bhanu;

public class Land {
    private House thehouse;
    private Room theroom;
    private Dimensions thedimensions;

    public Land(House thehouse, Room theroom, Dimensions thedimensions) {
        this.thehouse = thehouse;
        this.theroom = theroom;
        this.thedimensions = thedimensions;
    }

    public House getThehouse() {
        return thehouse;
    }

    public Room getTheroom() {
        return theroom;
    }

    public Dimensions getThedimensions() {
        return thedimensions;
    }
}
