package com.bhanu;

public class Composition {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(23, 45, 67);
        Room rooms = new com.bhanu.Room(5, 6, 7, 8, dimensions);
        House house = new House("two storyed", "yellow", rooms);

        house.getType();
        house.getColour();
        house.getRooms().getNumof();
        house.getRooms().getDoors();
        rooms.getWindows();
        rooms.getChairs();
        dimensions.getHeight();
        dimensions.getLenth();
        dimensions.getWidth();

    }


}



