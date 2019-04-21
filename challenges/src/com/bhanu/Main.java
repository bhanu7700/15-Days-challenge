package com.bhanu;

public class Main {

    public static void main(String[] args) {

        int m = calculatescore(400);
        displayhighscore("sachin", m);

        m = calculatescore(900);
        displayhighscore("dhoni", m);

        m = calculatescore(1600);
        displayhighscore("virat", m);



    }

    public static void displayhighscore(String player, int position) {
        System.out.println(player + " managed to get into the position " + position);
        System.out.println(" on the high score table");

    }

    public static int calculatescore(int score) {
        int position;

        if (score > 1000) {
            position = 1;
            System.out.println(position);
            return position;
        } else if ((score > 500) && (score < 1000)) {
            position = 2;
            System.out.println(position);
            return position;
        } else if ((score > 100) && (score < 500)) {
            position = 3;
            System.out.println(position);
            return position;
        } else {

            position = 4;
            System.out.println(position);
            return position;
        }








    }
}






