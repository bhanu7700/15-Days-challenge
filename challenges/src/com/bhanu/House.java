package com.bhanu;

public class House  {

    private String type;
    private String colour;
    private com.bhanu.Room rooms;


   // Room rooms = new Room(2,3,4,);


    public House(String type, String colour, com.bhanu.Room rooms) {
        this.type = type;
        this.colour = colour;
        this.rooms = rooms;

    }

    public String getType() {
        System.out.println("House is of "+ type);
        return type;
    }

    public String getColour() {
        System.out.println("House is in the colour of "+ colour);
        return colour;
    }

    public com.bhanu.Room getRooms() {
        return rooms;
    }
}
