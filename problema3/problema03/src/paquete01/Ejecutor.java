package paquete01;

import paquete02.Automotor;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        Automotor au1 = new Automotor();
        au1.calcularValorMatricula();
        System.out.printf("%s\n", au1);
        
        Automotor au2 = new Automotor("123145452", "Ford", 2022, 50.560);
        au2.calcularValorMatricula();
        System.out.printf("%s", au2);
    }
    
}
