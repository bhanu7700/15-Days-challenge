package com.bhanu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<< Bills Burgers >>>>>>>>>>>>>");
        System.out.println("............MENU...............");
        System.out.println("1.Basic Hamburger - 450 Rs " +"\n"+
                "2.Healthy Hamburger - 400 Rs"+"\n"+
                "3.Delux Hamburger - 500 Rs"+ "\n");



        BasicHamburger burg = new BasicHamburger("potato","chicken",450);
        Healthyburger health = new Healthyburger();
        Deluxburger delux = new Deluxburger();



        Scanner m = new Scanner(System.in);

        System.out.println("How many burgers you need?");
        int j = m.nextInt();
        int i;





        for(i=0; i<j; i++) {
            System.out.println("what type of burger you need?");
            int write = m.nextInt();


            if (write == 1) {
                System.out.println("Basic Hamburger is selected");
                System.out.println(burg.getRolltype());
                System.out.println(burg.getMeat());
                System.out.println(burg.getPrice(450));
                burg.additions();


            } else if (write == 2) {
                System.out.println("Healthy Hamburger is selected");
                System.out.println(health.getRolltype());
                System.out.println(health.getMeat());
                System.out.println(health.getPrice(400));
                health.additions();

            } else {
                System.out.println("Delux Hamburger is selected");
                System.out.println(delux.getRolltype());
                System.out.println(delux.getMeat());
                delux.additions();
                System.out.println(delux.getPrice(500));

            }




        }


    }


    }
























