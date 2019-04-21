package com.bhanu;
import java.awt.*;
import java.util.Scanner;

public class BasicHamburger {

    private String rolltype;
    private String meat;
    private int price;


    public BasicHamburger(String rolltype, String meat, int price) {
        this.rolltype = rolltype;
        this.meat = meat;
        this.price = price;
    }

    public String getRolltype() {
        System.out.println("select the type of roll");
        System.out.println("1.Potato Roll" +"\n"+
                "2.Onion Roll" +"\n"+
                "3.Pretzel Roll");

        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        String roll;

        switch(type){
            case 1:
                roll = "Potato Roll is selected \n";
                break;


            case 2:
                roll =  "Onion Roll is selected \n ";
                break;


            case 3:
                roll = "Pretzel Roll is selected \n ";
                break;


            default:
                roll = "nothing is selected";
                break;

        }
        return roll;
    }

    public String getMeat() {
        System.out.println(" \n select the type of meat");
        System.out.println("1.Chicken"+"\n"+
                "2.Mutton" +"\n"+
                "3.Prawns" +"\n"+
                "4.Veg");

        Scanner sc = new Scanner(System.in);

        int meat = sc.nextInt();
        String ttp;

        switch (meat){
            case 1:
                ttp = " Chicken is selected \n";
                break;



            case 2:
               ttp =  "mutton is selected \n";
               break;


            case 3:
                ttp = "Prawns is selected \n";
                break;


            case 4:
                ttp = "veg Hamburger is selected";
                break;

            default:
                ttp = "nothing is selected";
                break;


        }
        return ttp;



    }


    public int getPrice(int price) {
        System.out.println("Total prize of Hamburger is  ");
        return price;
    }

    public void additions(){
        System.out.println("Select the toppings");
        System.out.println("1.lettuce - 20Rs" +"\n"+
                       "2.Tomato - 20Rs" +"\n"+
                        "3.Carrot - 20Rs" +"\n"+
                        "4.Extra cheese - 30Rs" +"\n"+
                        "5.No toppings");
        Scanner x = new Scanner(System.in);

        int topping = x.nextInt();
        String add;
        switch(topping){
            case 1:
                add = "lettuce is selected \n";
                System.out.println(add);
                price += 20;
                System.out.println("Total price is "+ price);
                break;
            case 2:
                add = "Tomato is selected \n";
                System.out.println(add);
                price += 20;
                System.out.println("Total price is "+ price);
                break;

            case 3:
                add = "Carrot is selected \n";
                System.out.println(add);
                price += 20;
                System.out.println("Total price is "+price);
                break;

            case 4:
                add = "Extra cheese is selected \n";
                System.out.println(add);
                price += 30;
                System.out.println("Total price is "+price);
                break;

            case 5:
                add = "nothing is selected";
                System.out.println(add);
                break;



        }




        }





    }






