package com.geektech;

public class Main {


    public static void main(String[] args) {

        String mame = "Isken";
        int age = 14;
        int temp = 25;
        if (age < 20 && age < 45 && temp < +30 && temp  > -20
         && temp > 0 && temp < 28 ) {
            System.out.println("Можно идти гулять");
            if (age < 20 && temp > 0 && temp < 28){
                System.out.println("Можно гулять");
                if (age > 45 || temp > -10 && temp < 25){
                    System.out.println(" То Можно гулять");

                }
            }
        }

    }

}