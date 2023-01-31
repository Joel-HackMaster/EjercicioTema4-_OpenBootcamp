package com.ejercicioTema4;

public class Main {
    public static void main(String[] args) {
        SmartDevice phone1 = new SmartPhone("Samsung", "Negro", 3, "USB tipo C", 10.0, 30.0, "Snapdragon 888", 6, 16 );
        SmartDevice watch1 = new SmartWatch("Apple", "Gris", 1, "Inalambrica", 3.0,  4.0, true, true, true, false, 6 );
        phone1.resolucionPantalla();
        watch1.resolucionPantalla();
        System.out.println(phone1.toString());
        System.out.println(watch1.toString());
    }
}
