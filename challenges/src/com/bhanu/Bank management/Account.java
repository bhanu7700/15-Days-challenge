package com.bhanu;

public class Account {

    private int anum;
    private int balance;
    private String name;
    private String email;
    private String pno;


    public Account(){
        this(5677,5000,"default","email default","default pno");
        System.out.println("Default constructor");
    }

    public Account(int anum,int balance,String name,String email,String pno){
        System.out.println("Constructor is created ");
        this.anum = anum;
        this.balance = balance;
        this.name  = name;
        this.email = email;
        this.pno = pno;


    }

    public void setanum(int anum){
        this.anum = anum;
    }

    public int getanum(){
        return this.anum;
    }

    public void setbalance(int balance){
        this.balance = balance;
    }

    public int getbalance(){
        return this.balance;
    }

    public void setaname(String name){
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String getemail(){
        return this.email;
    }

    public void setpno(String pno){
        this.pno = pno;
    }

    public String getpno(){
        return this.pno;
    }

    public void deposite(int money){
        int total = money + balance;

        System.out.println("the money to be deposited is "+ money);
        System.out.println("Balance in account is "+ total);
    }

    public void withdraw(int money){
        if(money>=balance){
            System.out.println("your account has insufficient balance");
        }
        else {
            int total = balance-money;
            System.out.println("ammount to be withdrawl is "+ money);
            System.out.println("Balance ammount is "+ total);

        }
    }
}
