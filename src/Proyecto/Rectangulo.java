package Proyecto;

public class Rectangulo implements Figura {
    // Iniciamos los atributos/variables necesarias
    private final double base;
    private final double altura;

    // Creamos el constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Sobrescribimos cada una de las funciones que hay en el interface Figura
    @Override
    public double calcArea() {
        // Calculamos el área siguiendo la formula bxa
        return base * altura;
    }

    @Override
    public double calcPerimetro() {
        // Ya que sus lados son irregulares los aislamos antes de sumar el total
        return (base * 2) + (altura * 2);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
