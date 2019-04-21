package com.bhanu;

public class Calci {

    public static void main(String[] args){

        feetandinches(2,3.5);
        feetininches(2);







    }

    public static void feetandinches(double feet, double inches){
        if(feet>=0){
            double fincm = feet*12*2.54;
            System.out.println("foot in cm is "+ fincm);
        }
        if((inches>=0) && (inches<=12))
        {
            double iincm = inches*2.54;
            System.out.println("inches in cms is "+ iincm);
        }


    }

    public static double feetininches(double feet){
        if(feet>=0){
            double fininch = feet*12;
            return fininch;

        }
        else{
            return 23;
        }


    }
}
