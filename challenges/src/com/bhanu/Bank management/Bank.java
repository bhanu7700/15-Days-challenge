package com.bhanu;

public class Bank {

    public static void main(String[] args){
        Account SBI = new Account();
       // SBI.setanum(23456);
        System.out.println("Account number is "+ SBI.getanum());

        //SBI.setaname("Bhanu");
        System.out.println("User name is "+ SBI.getname());

       // SBI.setbalance(5000);
        System.out.println("Balance is "+ SBI.getbalance());

        //SBI.setemail("bhanu.udhissa@gmail.com");
        System.out.println("email id is "+ SBI.getemail());

        //SBI.setpno("7995965487");
        System.out.println("Phone number is "+ SBI.getpno());

        SBI.withdraw(400);

    }
}