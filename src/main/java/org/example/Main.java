package org.example;

import clases.Tienda;

public class Main {
    public static void main(String[] args) {

        Tienda exito = new Tienda();
        exito.setCantidad(2);

        double total=exito.calcularCosto();

        System.out.println("El total es de: "+total);

    }
}