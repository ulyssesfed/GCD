package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //GCD of 2 numbers
        System.out.println(gcd(getint("number 1"), getint("number 2")));

    }

    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
    private static int getint(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        return sc.nextInt();
    }

}