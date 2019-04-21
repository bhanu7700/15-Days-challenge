package com.bhanu;

public class Deluxburger extends BasicHamburger{

    public Deluxburger() {
        super("Onion","chicken",500);
    }

    @Override
    public String getRolltype() {
        return super.getRolltype();
    }

    @Override
    public String getMeat() {
        return super.getMeat();
    }

    @Override
    public int getPrice(int price) {
        System.out.println("Total price is ");
        return price;
    }

    @Override
    public void additions() {
        System.out.println("French fries and coke are served");

    }


}
