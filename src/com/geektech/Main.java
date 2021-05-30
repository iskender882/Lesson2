package com.geektech;

public class Main {

    public static void main(String[] args) {

        String name = ("Isken");

        switch (name) {
            case "Alex":
                System.out.println("Его имя Alex");
                break;
            case "Steve":
                System.out.println("Его имя Steve");
                break;
            case "Isken":
                System.out.println("Его имя Isken");
                break;
            default:
                System.out.println("Неизвестно");
        }

        int temp = 25;
        int age = 14;
        if (age < 20 && age > 45 && temp < +30 && temp > -20
                && temp > 0 && temp < 28) {
            System.out.println("Можно идти гулять");
        }else if  (age < 20 && temp > 0 && temp < 28) {
            System.out.println("Можно гулять");
            if (age < 45 || temp > -10 && temp < 25){
                System.out.println("То можно гулять");
            }


        }
    }

}
