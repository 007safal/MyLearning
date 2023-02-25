package com.NewOne;


//  Multiplication of Any numbers;

import java.util.Scanner;

public class Repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number1 = sc.nextInt();
       // int number2 = sc.nextInt();
        sc.close();
//        for( int i=1; i<=10; i++){
//            System.out.println(number+"X"+i+"="+(number*i));
//        }
        //CheckGivenNumberIsEvenOrOdd
//        if(number%2==0){
//            System.out.println("ThisNumberIsEven");
//        }else{
//            System.out.println("ThisNumberIsOdd");
//        }
        //PatternProgramming
//            for( int i=1; i<=number1; i++){
//                for (int j=1; j<=number2; j++){
//                    System.out.print(" "+"*");
//                }
//                System.out.println();
//            }
//        for( int i=1; i<=number1; i++){
//            for( int j=1; j<=number2; j++){
//                if(i==1||j==1||i==number1||j==number2){
//                    System.out.print(" "+"*");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        for( int i=1; i<=number1; i++){
//            for( int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for( int i=number1; i>=1; i--){
            for( int j=1; j<=i; j++){
                System.out.print("*");
                System.out.println("safal");
            }
            System.out.println();
        }
    }

}
