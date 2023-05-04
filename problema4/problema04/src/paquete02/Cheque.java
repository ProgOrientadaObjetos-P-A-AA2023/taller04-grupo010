package paquete02;

public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Cheque() {
        nombreCliente = "Alex Ramirez";
        nombreBanco = "Banco Pichincha";
        valorCheque = 123.32;
    }

    public Cheque(String nC, String nB, double vC) {
        nombreCliente = nC;
        nombreBanco = nB;
        valorCheque = vC;
    }

    public void establecerNombreCliente(String nC) {
        nombreCliente = nC;
    }

    public void establecerNombreBanco(String nB) {
        nombreBanco = nB;
    }

    public void establecerValorCheque(double vC) {
        valorCheque = vC;
    }

    public void calcularComision() {
        comision = valorCheque * 0.003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      Nombre del Cliente: %s
                                      Banco: %s
                                      Valor del Cheque: $%.2f
                                      Comision del Cheque: $%.2f
                                      """,
                nombreCliente,
                nombreBanco,
                valorCheque,
                comision);
        return cadena;
    }

}
