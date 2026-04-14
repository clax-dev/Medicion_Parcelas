package Proyecto;

import java.util.LinkedList;
import java.util.List;

/**
 * Representa una entidad de tipo Parcela.
 * Esta clase actúa como un contenedor para agrupar múltiples objetos
 * que implementen la interfaz {@link Figura}, proporcionando la lógica
 * para calcular el área y perímetro total del conjunto.
 * * @author Clax
 * @version 1.0
 */
public class Parcela {
    /**
     * Lista en privada para almacenar los objetos de tipo figura y garantizar el encapsulamiento.
     * Se utiliza la interfaz List para mayor versatilidad, permitiendo cambiar
     * la implementación (LinkedList, ArrayList, etc.) sin afectar al resto del código.
     */
    private List<Figura> parcela = new LinkedList<>();

    /**
     * Función para añadir una nueva figura a la parcela.
     * @param figura siendo esta la figura geométrica que se desea agregar a la lista.
     */
    public void agregarFigura(Figura figura) {
        // Agregamos la figura a la lista
        parcela.add(figura);
    }

    /**
     * Función para calcular el área total que ocupan todas las figuras en la parcela.
     * @return devolviendo el resultado de sumar las áreas de cada una de las figuras almacenadas.
     */
    public double totalArea() {
        double totalArea = 0;
        for (Figura figura : parcela) {
            totalArea += figura.calcArea();
        }
        return totalArea;
    }

    /**
     * Función para calcular el perímetro total de todas las figuras en la parcela.
     * @return devolviendo el resultado de sumar los perímetros de cada una de las figuras almacenadas.
     */
    public double totalPerimetro() {
        double totalPerimetro = 0;
        for (Figura figura : parcela) {
            totalPerimetro += figura.calcPerimetro();
        }
        return totalPerimetro;
    }

    /**
     * Función para representar el objeto Parcela y su contenido como una cadena de texto.
     * @return Cadena de texto que muestra la lista de figuras que componen la parcela.
     */
    @Override
    public String toString() {
        return "Parcela{" +
                "parcela=" + parcela +
                '}';
    }
}