package com.example;

public class MyClass {

    public static void main(String[] args) {


           int accountBalance = 100;

           int itemPrice = 25;


            if (accountBalance >= itemPrice){
                System.out.println(" you have purchased the item");
            }else{
                System.out.println("you dont have enough money");
            }

            int degrees = 70;
            if(degrees >=70 ){
                System.out.println(" put on some sunblock!");
            }else if(degrees <70 && degrees >= 59){
                System.out.println("you might need a sweater");
            }else {
                System.out.println("put on a heavy coat!");
            }

            boolean firstTimeCustomer = false;
            boolean isExecutiveMember = true;
        if (firstTimeCustomer == true || isExecutiveMember == true){
            System.out.println("you received a 10% discount");
        }

        if (firstTimeCustomer || isExecutiveMember){
            System.out.println("you received a 15% discount");
        }
        if (false == true && true == true){

        }

    }
}
