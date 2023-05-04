package paquete02;

public class Profesor {

    private String nombreProfesor;
    private String apellidoProfesor;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Profesor() {
        nombreProfesor = "Valeria";
        apellidoProfesor = "León";
        cedula = "1101435312";
        sueldoBasico = 450.57;
    }

    public Profesor(String nombre, String apellido, String c,
            double sB) {
        nombreProfesor = nombre;
        apellidoProfesor = apellido;
        cedula = c;
        sueldoBasico = sB;
    }

    public void establecerNombreP(String nP) {
        nombreProfesor = nP;
    }

    public void establecerApellidoP(String aP) {
        apellidoProfesor = aP;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldoB(double sB) {
        sueldoBasico = sB;
    }

    public void calcularSueldoT() {
        sueldoTotal = ((sueldoBasico * 0.20) + sueldoBasico);
    }

    public String obtenerNombreP() {
        return nombreProfesor;
    }

    public String obtenerApellidoP() {
        return apellidoProfesor;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoB() {
        return sueldoBasico;
    }

    public double obtenerSueldoT() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                            El sueldo total de %s %s, con cedula %s es de: $%.2f
                                      """,
                nombreProfesor,
                apellidoProfesor,
                cedula,
                sueldoTotal);
        return cadena;
    }

}
