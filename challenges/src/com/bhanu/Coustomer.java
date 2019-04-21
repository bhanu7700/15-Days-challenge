package com.bhanu;

public class Coustomer {

    private String name;
    private String limit;
    private String email;

    public Coustomer(String name,String limit, String email){
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public Coustomer(String name,String limit){

        this(name,limit,"bhanu.udhissa");
        System.out.println("default of one value");

    }

    public Coustomer(){
        this("default name","default limit","default email");
        System.out.println("default of three values is created");
    }

    public String getname(){
        return this.name;
    }

    public String getlimit(){
        return this.limit;
    }

    public String getemail(){
        return this.email;
    }

}
