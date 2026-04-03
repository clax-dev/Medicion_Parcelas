package Proyecto;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Parcela {
    // Creamos un ArrayList para almacenar los objetos figura.
    // Utilizamos List para mayor versatilidad, ya que nos permite cambiar la implementación de la lista si es necesario sin afectar el resto del código.
    List<Figura> parcela = new LinkedList<>();

    // Función para añadir figuras
    public void agregarFigura(Figura figura) {
        // Agregamos la figura al ArrayList
        parcela.add(figura);
    }

    // Funciones para calcular el total de área y perímetro que se encuentra en la parcela
    public double totalArea() {
        double totalArea = 0;
        for (Figura figura : parcela) {
            totalArea += figura.calcArea();
        }
        return totalArea;
    }

    public double totalPerimetro() {
        double totalPerimetro = 0;
        for (Figura figura : parcela) {
            totalPerimetro += figura.calcPerimetro();
        }
        return totalPerimetro;
    }

    @Override
    public String toString() {
        return "Parcela{" +
                "parcela=" + parcela +
                '}';
    }
}
