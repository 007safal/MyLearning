package com.NewOne;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        int num1;
//        int num2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers:");
//        num1 = sc.nextInt();
//        num2 = sc.nextInt();
//        sc.close();
//        System.out.println("Addition"+"=" + (num1+num2));
//        System.out.println("Subtraction"+"=" + (num1-num2));
//        System.out.println("Multiplication"+"=" + (num1*num2));
//        System.out.println("Division"+"=" + (num1/num2));
//        System.out.println("Modulo"+"=" + (num1%num2));

//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the months:");
//        n = scanner.nextInt();
//        scanner.close();
//
//          switch(n){
//              case 1:
//              System.out.println("january");
//              break;
//              case 2:
//                  System.out.println("february");
//                  break;
//              case 3:
//                  System.out.println("march");
//                  break;
//              case 4:
//                  System.out.println("april");
//                  break;
//              case 5:
//                  System.out.println("May");
//                  break;
//              case 6:
//                  System.out.println("june");
//                  break;
//              case 7:
//                  System.out.println("july");
//                  break;
//              case 8:
//                  System.out.println("august");
//                  break;
//              case 9:
//                  System.out.println("september");
//                  break;
//              case 10:
//                  System.out.println("october");
//                  break;
//              case 11:
//                  System.out.println("november");
//                  break;
//              case 12:
//                  System.out.println("december");
//                  break;
//              default:
//                  System.out.println("invalid");
//
//          }

//            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int operator = sc.nextInt();
//         switch(operator){
//             case 1:
//                 System.out.println("Addition"+(a+b));
//                 break;
//             case 2:
//                 System.out.println("Subtraction"+(a-b));
//                 break;
//             case 3:
//                 System.out.println("Multiplication"+(a*b));
//                 break;
//             case 4:
//                 if(b==0){
//                 System.out.println("Invalid input");}
//                 else{
//                     System.out.println("Division"+(a/b));
//                 }
//                 break;
//             case 5:
//                 if(b==0){
//                     System.out.println("invalid input");}
//                 else{
//                     System.out.println("Modulo"+(a%b));
//                 }
//                 break;
//             default:
//                 System.out.println("Cannot get more result");
//         }
//

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number:");
//        int n = sc.nextInt();
//        sc.close();
//
//        for(int i =1 ; i<=n;i++){
//            if(i%2==0){
//                System.out.println("even number");
//            }else{
//                System.out.println("Error");
//            }
//        }
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//            int input;
//
//       do{
//           int marks =sc.nextInt();
//           if(marks>=90){
//               System.out.println("This is Good");
//           }else if(89>=marks && marks>=60){
//               System.out.println("This is also Good");
//           }else if (marks<=59 && marks >=0) {
//               System.out.println("This is Good as well");
//           }else{
//               System.out.println("invalid");
//           }
//           System.out.println("want to continue ?yes(1) or no(0)");
//           input = sc.nextInt();
//       }while(input==1);

//        int n;
//        int m;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter two numbers:");
//        n = sc.nextInt();
//        m = sc.nextInt();
//        sc.close();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=m; j++){
//                System.out.print(" "+"*");
//            }
//            System.out.println();
//        }
//         int n = 4;
//         int m = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=m; j++) {
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print(" "+"*");}
//                 else{
//                     System.out.print("  ");
//                 }
//
//
//             }
//                 System.out.println();
//
//         }

// int n;
// Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        n = sc.nextInt();
//        sc.close();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        n = sc.nextInt();
//        sc.close();
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(" "+"*");
//            }
//            System.out.println();
//        }

         int n=4;
         for(int i=1; i<=n; i++){
             for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
             for(int j=1; j<=i; j++){
                 System.out.print("*"+"");
                 System.out.println("vks");
             }
             System.out.println();
         }










    }

}
