package Proyecto;

public class Main {
    public static void main(String[] args) {

        // Creamos la parcela y varios objetos figuras.
        Parcela parcela = new Parcela();
        Figura cuadrado = new Cuadrado(5);
        Figura triangulo = new Triangulo(4, 6, 6);
        Figura rectangulo = new Rectangulo(4, 8);
        Figura circulo = new Circulo(3);

        // Agregamos las figuras a las parcelas utilizando el método
        parcela.agregarFigura(cuadrado);
        parcela.agregarFigura(triangulo);
        parcela.agregarFigura(rectangulo);
        parcela.agregarFigura(circulo);

        // Imprimimos
        System.out.println("Elementos de la parcela: " + parcela.toString() + "\nTotal perímetro: " + parcela.totalPerimetro() + " m");
        System.out.println("Elementos de la parcela: " + parcela.toString() + "\nTotal perímetro: " + parcela.totalArea() + " m^2");
    }
}
