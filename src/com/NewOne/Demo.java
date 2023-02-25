package com.NewOne;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println();
//        int age = 15;
//        String name = "Safal";
//        float salary = 2233.5f;
//        Double radius;
//        Double Area;
//        Scanner sc = new Scanner(System.in);
//        System.out.println( "Enter the radius of circle :");
//        radius = sc.nextDouble();
//        sc.close();
//
//        Area = Math.PI *radius *radius;
//        System.out.println("Area of the circle is "+Area);
//        int number;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        number = sc.nextInt();
//        System.out.println("Multiply of this number is 2*1="+number *1);
//        System.out.println(" 2*2="+number *2);
//        System.out.println(" 2*3="+number *3);
//        System.out.println(" 2*4="+number *4);
//        System.out.println(" 2*5="+number *5);
//        System.out.println(" 2*6="+number *6);
//        System.out.println(" 2*7="+number *7);
//        System.out.println(" 2*8="+number *8);
//        System.out.println(" 2*9="+number *9);
//        System.out.println(" 2*10="+number *10);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        for (int i = 1; i<=10 ; i++) {
            System.out.println(number + "X" + i + "=" + (number * i));
        }


    }


}
