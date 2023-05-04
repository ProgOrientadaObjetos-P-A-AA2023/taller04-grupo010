package paquete01;

import paquete02.Profesor;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        Profesor pr1 = new Profesor();
        pr1.calcularSueldoT();
        System.out.printf("%s\n", pr1);
        
        Profesor pr2 = new Profesor("Paulina", "Muñoz", "12394921", 567.9);
        pr2.calcularSueldoT();
        System.out.printf("%s", pr2);
    }
    
}
