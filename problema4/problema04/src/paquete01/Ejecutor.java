package paquete01;

import paquete02.Cheque;

public class Ejecutor {

    public static void main(String[] args) {

        Cheque ch1 = new Cheque();
        ch1.calcularComision();
        System.out.printf("%s\n", ch1);

        Cheque ch2 = new Cheque("Alex Chavez", "Banco Bolivariano", 45.34);
        ch2.calcularComision();
        System.out.printf("%s", ch2);
    }

}
