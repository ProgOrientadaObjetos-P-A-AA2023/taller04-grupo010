package paquete02;

public class Estudiante {

    private String nombreEstudiante;
    private double materiaUno;
    private double materiaDos;
    private double materiaTres;
    private double promedio;

    public Estudiante() {
        nombreEstudiante = "Carlos";
        materiaUno = 9.8;
        materiaDos = 7.5;
        materiaTres = 6.8;
    }

    public Estudiante(String nombre, double m1,
            double m2, double m3) {

        nombreEstudiante = nombre;
        materiaUno = m1;
        materiaDos = m2;
        materiaTres = m3;

    }

    public void establecerNombre(String n) {
        nombreEstudiante = n;
    }

    public void establecerMateria1(double m1) {
        materiaUno = m1;
    }

    public void establecerMateria2(double m2) {
        materiaDos = m2;
    }

    public void establecerMateria3(double m3) {
        materiaTres = m3;
    }

    public void calcularPromedio() {
        promedio = (materiaUno + materiaDos + materiaTres) / 3;
    }

    public String obtenerNombre() {
        return nombreEstudiante;
    }

    public double obtenerMateria1() {
        return materiaUno;
    }

    public double obtenerMateria2() {
        return materiaDos;
    }

    public double obtenerMateria3() {
        return materiaTres;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      El estudiante %s.
                                        En la materia 1, tiene: %.2f
                                        En la materia 2, tiene: %.2f 
                                        En la materia 3, tiene: %.2f
                                      Promedio final: %.2f
                                      """,
                nombreEstudiante,
                materiaUno,
                materiaDos,
                materiaTres,
                promedio);
        return cadena;
    }

}
