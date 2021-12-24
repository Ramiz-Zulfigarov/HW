package com.geekbrains;

public class Main {

//public class HomeWorkApp {
//
//    public static void main(String[] args){
//
//        printThreeWords();
//        checkSumSign();
//        printColor();
//        compareNumbers();
//    }
//
//    public static void  printThreeWords() {
//        System.out.println("Orange");
//        System.out.println("Banana");
//        System.out.println("Apple");
//    }
//
//    public static void checkSumSign(){
//        int a = 1;
//        int b = 2;
//        if ((a + b) >= 0 ){
//            System.out.println("Сумма положительная");
//        } else {
//            System.out.println("Сумма отрицательная");
//        }
//
//
//    }
//    public static void printColor(){
//        int value = 140;
//        if (value <= 0) {
//            System.out.println("Красный");
//        } else if (value > 100){
//            System.out.println("Зеленый");
//        } else {
//            System.out.println("Желтый");
//        }
//    }
//    public static void compareNumbers(){
//        int a = 10;
//        int b = 15;
//        if (a > b){
//            System.out.println("a >= b");
//        } else {
//            System.out.println("a < b");
//        }
//    }

    public static void main(String[] args) {

        System.out.println(checkSumSign(20, 10));
        isPositiveOrNegative(10);
        System.out.println(isNegative(20));
        printWordNTimes("123213", 5);





    }

        public static boolean checkSumSign(int a, int b) {

            if ((a + b) >= 10 && (a + b) <= 20) {
                return true;
            } else {
                return false;
            }
        }

            public static void isPositiveOrNegative(int x) {
                if (x >= 0) {
                    System.out.println("число положительное");
                } else {
                    System.out.println("число отрицательное");
                }
            }
            public static boolean isNegative(int x) {
                if (x < 0 || x != 0) {
                    return (true);
                } else {
                    return (false);
                }
            }
            public static void printWordNTimes(String a, int n){

                for (int i = 0;i <= n; i++) {
                    System.out.println(a);
                }

            }


}




