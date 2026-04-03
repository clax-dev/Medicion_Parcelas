package Proyecto;

public class Circulo implements Figura {
    // Iniciamos los atributos/variables necesarios
    private final double radio;

    // Creamos el constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcArea() {
        // Calculamos el área siguiendo la fórmula Pi*r^2
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcPerimetro() {
        // Calculamos el perímetro siguiendo la fórmula 2*Pi*r
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
