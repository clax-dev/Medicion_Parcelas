package Proyecto;

public class Dron {

    // Introducimos parcelas a la función para que calcule el área o el perímetro
    public double totalArea(Parcela... parcela) {
        double total = 0;
        // Recorremos la parcela con un foreach
        for (Parcela x : parcela) {
            total += x.totalArea();
        }
        return total;
    }

    public double totalPerimetro(Parcela... parcela) {
        double total = 0;
        for (Parcela x : parcela) {
            total += x.totalPerimetro();
        }
        return total;
    }
}
