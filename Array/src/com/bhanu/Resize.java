package com.bhanu;

import java.util.Scanner;

public class Resize {

    private static Scanner s = new Scanner(System.in);
    private static int[] basedata =  new int[10];

    public static void main(String[] args){
        getarray();
        printarray();
        resize();
        basedata[10] = 45;
        basedata[11] = 23;
        printarray();

    }

    public static void getarray(){
        System.out.println("Enter "+ basedata.length + " integers");
        for(int i =0; i<basedata.length; i++){

            basedata[i]= s.nextInt();

        }

    }

    public static void printarray(){
        for(int i=0; i<basedata.length; i++){
            System.out.println("for "+i+" entered value is "+ basedata[i]);
        }
    }

    public static void resize(){
        int[] original = basedata;
        basedata = new int[12];
        for (int i =0; i<original.length; i++){
            basedata[i] = original[i];
        }
    }



    }


