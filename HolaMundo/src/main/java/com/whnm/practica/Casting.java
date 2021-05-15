package com.whnm.practica;

public class Casting {
    public static void main(String[] args) {

        double monthlyDogs = 30.0/12.0;//si divides 2 int el resultado sera otro int
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        int a = 2;
        char letra = 'a';
        a = letra;
        letra = (char) a;
    }
}
