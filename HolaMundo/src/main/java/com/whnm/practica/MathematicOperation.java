package com.whnm.practica;

public class MathematicOperation {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve numero x elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Raiz cuadrada
        System.out.println((Math.sqrt(y)));

        //Area de un circulo pi*r2
        System.out.println(Math.PI*Math.pow(x,2));

    }
}
