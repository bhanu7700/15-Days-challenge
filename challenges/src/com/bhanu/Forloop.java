package com.bhanu;

public class Forloop {

    public static void main(String[] args){
//        for(int i=1; i<7; i++){
//            System.out.println("the result is "+calculateamount(10000,i));
//        }
//
//        for(int i=8; i>0; i--){
//            System.out.println("the result is "+String.format("%.2f",(calculateamount(10000,i))));
//
//        }
//
//
       int count =0;
       for(int i=2; i<50; i++){
           if(ISprime(i)){
               count++;
               System.out.println("number "+ i +" is a prime number");
               if(count>3){
                   System.out.println("existing looop");
                   break;
               }

           }
       }

       int s = 5;
       int lastnum = 20;
       count =0;
       while(s<=lastnum){

           if(!isEven(s)){
               s++;
               continue;
           }

           System.out.println("even number is "+ s);
           s++;
           count++;

           if(count>=5){
               System.out.println("exist loop");
               break;


           }


       }
        System.out.println("total number of even numbers is "+ count);


   }
//
//    public static double calculateamount(double amount, double intrestrate){
//        return amount*(intrestrate/100);
//    }

    public static boolean ISprime(int n){
        if(n==1){
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n%i==0){
               return false;
            }
        }

        return true;
    }

    public static boolean isEven(int s){
        if(s%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
