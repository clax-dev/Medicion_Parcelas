package Proyecto;

public class Triangulo implements Figura {
    // Iniciamos los atributos/variables necesarios
    private final double lado1;
    private final double lado3;
    private final double lado2;

    // Creamos el constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcArea() {
        // Calculamos el área siguiendo la formula (bxa)/2
        // Aplicamos el teorema de Herón para obtener la altura.
        double s = (lado1 + lado2 + lado3) / 2;
        // s --> semiperímetro
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    @Override
    public double calcPerimetro() {
        // Sumaremos todos los lados del triángulo para obtener el perímetro
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado3=" + lado3 +
                ", lado2=" + lado2 +
                '}';
    }
}
