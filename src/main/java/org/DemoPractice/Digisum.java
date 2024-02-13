package org.DemoPractice;

public class Digisum {
    public static void main(String[] args) {

        System.out.println("THIS IS DIGI SUM");
//        int a = 164;
//
//        while (a > 9) {
//            int sum = 0;
//
//            while (a != 0) {
//                sum += a % 10;
//                a /= 10;
//            }
//
//            a = sum;
//        }
//
//        System.out.println(a);
//    }
//}
        int a = 164;
        while (a > 9
        ) {
            int sum = 0;
            while (a != 0) {
                sum += a % 10;
                a /= 10;
            }
            a = sum;
        }
        System.out.println(a);
    }}