package chap4;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Menu------------");
        System.out.print(" 0 : Exit\n 1 : Normal Letter \n 2 : Register Letter \n 3 : EMS Letter ");
        System.out.println("\n---------------------------- ");
        System.out.print("Please Enter Menu[0-3] : ");
        int type = sc.nextInt();
        System.out.print("1 Normal Letter \n    Enter weight(g) : ");
        int weight = sc.nextInt();

//        !!Normol Letter
        if (type == 1 && weight <= 20) {
            System.out.println("    Normal Letter Service Price = 3 baht");
        } else if (type == 1 && weight <= 100) {
            System.out.println("    Normal Letter Service Price = 5 baht");
        } else if (type == 1 && weight <= 250) {
            System.out.println("    Normal Letter Service Price = 9 baht");
        } else if (type == 1 && weight <= 500) {
            System.out.println("    Normal Letter Service Price = 15 baht");
        } else if (type == 1 && weight <= 1000) {
            System.out.println("    Normal Letter Service Price = 25 baht");
        } else if (type == 1 && weight <= 2000) {
            System.out.println("    Normal Letter Service Price = 45 baht");
        } //       !!Register Letter
        else if (type == 2 && weight <= 20) {
            System.out.println("    Register Letter Service Price = 16 baht");
        } else if (type == 2 && weight <= 100) {
            System.out.println("    Register Letter Service Price = 18 baht");
        } else if (type == 2 && weight <= 250) {
            System.out.println("    Register Letter Service Price = 22 baht");
        } else if (type == 2 && weight <= 500) {
            System.out.println("    Register Letter Service Price = 28 baht");
        } else if (type == 2 && weight <= 1000) {
            System.out.println("    Register Letter Service Price = 38 baht");
        } else if (type == 2 && weight <= 2000) {
            System.out.println("    Register Letter Service Price = 58 baht");
        } //        !!EMS Letter 
        else if (type == 3 && weight <= 20) {
            System.out.println("    EMS Letter Service Price = 27 baht");
        } else if (type == 3 && weight <= 100) {
            System.out.println("    EMS Letter Service Price = 32 baht");
        } else if (type == 3 && weight <= 250) {
            System.out.println("    EMS Letter Service Price = 37 baht");
        } else if (type == 3 && weight <= 500) {
            System.out.println("    EMS Letter Service Price = 47 baht");
        } else if (type == 3 && weight <= 1000) {
            System.out.println("    EMS Letter Service Price = 62 baht");
        } else if (type == 3 && weight <= 2000) {
            System.out.println("    EMS Letter Service Price = 77 baht");
        } else {
            System.out.println("ไม่ตรงกับเงื่อนไขที่คุณเลือกไว้");
        }
    }
}
