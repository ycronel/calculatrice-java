package com.example.calculatrice.utilitaire;

public class Maths {

    public static int fact(int n) {
        return n <= 1 ? 1 : n * fact(n-1);
    }
}
