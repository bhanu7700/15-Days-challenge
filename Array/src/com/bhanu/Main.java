package com.bhanu;


import java.util.Scanner;

public class Main {

   public static Scanner m = new Scanner(System.in);

    public static void main(String[] args) {
	 int[] value =  getarray(5);
	 int[] sorted = sortintegers(value);
	 printarray(sorted);



    }


    public static void printarray(int[] value) {

        for (int i = 0; i < value.length; i++) {

            System.out.println("For " + i + "entered value is " + value[i]);

        }
    }





    public static int[] getarray(int num){
        System.out.println("Enter "+ num +" integer values");
        int[] Array = new int[num];

        for(int i=0; i<num; i++ ){
            Array[i] = m.nextInt();


        }

        return Array;


    }

    public static int[] sortintegers(int[] array){
        int[] sortarray = new int[array.length];
        for(int i =0; i<array.length; i++){
            sortarray[i] = array[i];


            }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i<array.length-1; i++){
                if(sortarray[i]<sortarray[i+1]){
                    temp = sortarray[i];
                    sortarray[i]=sortarray[i+1];
                    sortarray[i+1]=temp;
                    flag = true;
                }
            }



        }
        return sortarray;
    }



}
