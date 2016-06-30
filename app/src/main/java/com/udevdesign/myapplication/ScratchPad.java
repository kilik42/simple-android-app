package com.udevdesign.myapplication;

/**
 * Created by marvinevins on 6/29/16.
 */
public class ScratchPad {

    public static void main(String[] args) {
//        System.out.println("hello nurse");
//        System.out.println("hello beast");

        String vehicle = "truck";
        String make = "chevy";
        String model = "tahoe";

        String fullVehicleDetails = vehicle + "-" + make + ":" + model;

        System.out.println(fullVehicleDetails);

        String upper = "CRAZY";
        String lower = upper.toLowerCase();
        System.out.println(lower);

        int accountBalance = 500;
        String printBalance = String.format("your account is %d", accountBalance);

        System.out.println(printBalance);

//        int bankAccount = 45479;
//
//        String name = "john";
//        int homeruns = 55;
//        float bankBalance = 100.44f;
//        float finalBalance = bankBalance -50;
//
//        System.out.println(name + "has " + homeruns + "homeruns");
//        System.out.println(homeruns);
//        System.out.println(name + " has "  + finalBalance + " in his account");
    }
}
