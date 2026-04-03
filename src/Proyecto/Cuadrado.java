package Proyecto;

public class Cuadrado implements Figura {
    // Asignamos los atributos/variables necesarias
    private final double lado;

    // Creamos el constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Sobrescribimos cada una de las funciones que hay en el interface Figura
    @Override
    public double calcArea() {
        // Calculamos el área siguiendo la formula lxl
        return lado * lado;
    }

    @Override
    public double calcPerimetro() {
        // Como un cuadrado tiene 4, obligamos a que este sea su valor
        return lado * 4;

    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
