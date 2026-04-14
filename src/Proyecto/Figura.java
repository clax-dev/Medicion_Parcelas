package Proyecto;

/**
 * Interfaz que define el comportamiento base para cualquier figura geométrica.
 * Obliga a todas las clases que la implementen a proporcionar la lógica
 * matemática para calcular tanto su área como su perímetro.
 * * Clases esperadas que implementan esta interfaz:
 * Cuadrado, Rectángulo, Triángulo y Círculo.
 * * * @author Clax
 * @version 1.0
 */
public interface Figura {

    /**
     * Función abstracta para calcular el área de la figura geométrica.
     * @return devolviendo el resultado del cálculo del área correspondiente a la figura específica.
     */
    double calcArea();

    /**
     * Función abstracta para calcular el perímetro de la figura geométrica.
     * @return devolviendo el resultado del cálculo del perímetro correspondiente a la figura específica.
     */
    double calcPerimetro();
}