package com.example;

public class MyClass {

    public static void main(String[] args) {
        int[] tomsAverages = new int[10];

        double[] dblArray;
        String[] names;
        names = new String[5];
        names[0] = "john";
        names[1] = "jingle";
        names[2] = "jacob";
        names[3] = "heimer";
        System.out.println("names are " + names[3]);

        tomsAverages[0] = 250;

        tomsAverages[1] = 400;
        tomsAverages[2] = 600;

        System.out.println(" value is "+ tomsAverages[0]);

        String[] top10cars = {
                "GTR", "Astin Martin", "chevy pento", "mazarati"," jaguar",
                "bmw"
        };

        System.out.println(top10cars[2]);

    }

}
