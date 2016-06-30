package com.example;

public class MyClass {

    public static void main(String[] args) {

        printName();
        printArea(12,34);

        int area = getArea(5,6);
    }

    public static void printName(){
        System.out.println("my name is enrique");

    }

    public static void printArea(int lenght, int width){
        System.out.println("area " + (lenght * width));
    }


    public static int getArea(int length, int width){
        return length * width;
    }
}
