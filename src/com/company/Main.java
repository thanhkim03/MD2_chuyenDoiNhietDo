package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double F;
        double C;
        System.out.println("chọn 1 (F->C); 2 (C->F)");
        int a = scanner.nextInt();
    switch (a) {
        case 1: {
            System.out.println("nhập độ f ");
            F = scanner.nextDouble();
            System.out.println("độ c là: " + doCsangF(F));
            break;
        }
        case 2:{
            System.out.println("nhập độ c ");
            C = scanner.nextDouble();
            System.out.println("độ f là: "+ doFsangC(C));
            break;
        }
    }
    }  static double doCsangF (double b){
        double d = (9.0/5)*b+32;
        return d;
    }
    static  double doFsangC (double d){
        double b = (5.0/9)*(d-32);
        return b;
    }
}
