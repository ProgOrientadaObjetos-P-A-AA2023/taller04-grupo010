package paquete02;

public class Automotor {

    private String cedula;
    private String marca;
    private int anio;
    private double valorCarro;
    private double valorMatricula;

    public Automotor() {
        cedula = "12312434";
        marca = "Hyundai";
        anio = 2004;
        valorCarro = 15.560;
    }

    public Automotor(String c, String m, int a, double vC) {
        cedula = c;
        marca = m;
        anio = a;
        valorCarro = vC;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerAnio(int a) {
        anio = a;
    }

    public void establecerValorCarro(double vC) {
        valorCarro = vC;
    }

    public void calcularValorMatricula() {
        int anioAntiguedad = 2023 - anio;
        valorMatricula = (valorCarro * anioAntiguedad) * (0.002);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerValorCarro() {
        return valorCarro;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      Cédula: %s
                                      Marca: %s
                                      Año: %d
                                      Valor del Carro: $%.3f
                                      Valor de la Matrícula: $%.2f
                                      """,
                cedula,
                marca,
                anio,
                valorCarro,
                valorMatricula);
        return cadena;
    }

}
