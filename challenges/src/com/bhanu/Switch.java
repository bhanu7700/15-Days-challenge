package com.bhanu;

public class Switch {

    public static void main(String[] args){

        char alpha = 'f';

        switch(alpha){
            case 'a':
                System.out.println("alphabet is A");
                break;

            case 'b':
                System.out.println("Alphabet is B");
                break;

            case 'c': case 'e': case 'f':
                System.out.println("Alphabet is "+ alpha );
                break;

            default:
                System.out.println("nothing is given");
                break;

        }

        String month = "JUNE";

        switch(month.toLowerCase()){

            case "january":
                System.out.println("month is jan");
                break;

            case "june":
                System.out.println("month is june");
                break;

            default:
                System.out.println("not sure");
                break;
        }

    }
}
