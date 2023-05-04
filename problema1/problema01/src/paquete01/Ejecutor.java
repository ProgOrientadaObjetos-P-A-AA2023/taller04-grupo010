package paquete01;

import paquete02.Estudiante;

public class Ejecutor {

    public static void main(String[] args) {
        Estudiante es1 = new Estudiante();
        es1.calcularPromedio();
        System.out.printf("%s\n", es1);

        Estudiante es2 = new Estudiante("Sebastián", 7.8, 8.7, 9.7);
        es2.calcularPromedio();
        System.out.printf("%s", es2);

    }

}
