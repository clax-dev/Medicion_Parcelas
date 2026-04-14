package Proyecto;

/**
 * Representa una entidad de tipo Dron.
 * Esta clase proporciona las funcionalidades necesarias para procesar
 * y calcular las métricas totales (área y perímetro) de una o múltiples
 * instancias de la clase {@link Parcela}.
 * * @author Clax
 * @version 1.0
 */
public class Dron {

    /**
     * Función para calcular el área total abarcada por un conjunto de parcelas.
     * @param parcela siendo este un número variable de objetos Parcela (varargs) a procesar.
     * @return devolviendo el resultado de sumar el área total de todas las parcelas introducidas.
     */
    public double totalArea(Parcela... parcela) {
        double total = 0;
        // Recorremos las parcelas con un bucle for-each
        for (Parcela x : parcela) {
            total += x.totalArea();
        }
        return total;
    }

    /**
     * Función para calcular el perímetro total abarcado por un conjunto de parcelas.
     * @param parcela siendo este un número variable de objetos Parcela (varargs) a procesar.
     * @return devolviendo el resultado de sumar el perímetro total de todas las parcelas introducidas.
     */
    public double totalPerimetro(Parcela... parcela) {
        double total = 0;
        // Recorremos las parcelas con un bucle for-each
        for (Parcela x : parcela) {
            total += x.totalPerimetro();
        }
        return total;
    }
}