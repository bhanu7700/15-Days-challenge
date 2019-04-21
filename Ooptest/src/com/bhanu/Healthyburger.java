package com.bhanu;

public class Healthyburger extends BasicHamburger {


    public Healthyburger() {
        super("Brown bread","no meat",400);

    }

    @Override
    public String getRolltype() {
        return "Brown bread rye is served";
    }

    @Override
    public String getMeat() {
        return "No meat is served with Healthy burger";
    }

    @Override
    public int getPrice(int price) {
        System.out.println("Total price is ");
        return price;
    }

    @Override
    public void additions() {
        super.additions();
    }


}
