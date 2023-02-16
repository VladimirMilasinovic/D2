package Domaci;

import java.util.Scanner;

public class Domacidva {
    public static void main(String[] args) {

        //Napraviti program gde cete uneti svoju godinu rodjenja,
        //trenutnu godinu i u konzoli istampati svoj broj godina.

        Scanner sc = new Scanner(System.in);


        System.out.println("Uneti svoju godinu rodjenja: ");
        int x = sc.nextInt();
        System.out.println("Godina koju ste uneli je: " + x);

        System.out.println("Uneti trenutnu godinu: ");
        int y = sc.nextInt();

        System.out.println("Imate godina:" + (y - x));
    }
}
