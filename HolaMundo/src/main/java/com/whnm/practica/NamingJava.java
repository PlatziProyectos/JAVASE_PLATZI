package com.whnm.practica;

public class NamingJava {

    public static void main(String[] args) {
        int cellphone=4333;
        int cellPhone=6534;

        System.out.println(cellphone);
        System.out.println(cellPhone);

        int $moneda = 23;
        String _currency = "PEN";

        int $ = 1;
        //String _ = "2"; //funciona hasta java9

        System.out.println($);
        //System.out.println(_); //funciona hasta java9

        //Constantes
        int POSITION = -5;
        int MAX_WIDTH = 99999;
        int MIN_WIDTH = 77;
    }
}
