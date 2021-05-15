package com.whnm.practica;

public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 4;
        lives = lives + 1;
        System.out.println(lives);

        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        int gift = 100;
        gift = gift + lives++; //postfijo aumenta o disminuye en la proxima linea y prefijo aumenta o disminuye en la misma linea
        System.out.println(gift);

    }
}
