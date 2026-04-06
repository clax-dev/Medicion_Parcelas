package Proyecto;

public class Prueba {
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

        /*/ Imprimimos
        System.out.println("Elementos de la parcela: " + parcela.toString() + "\nTotal perímetro: " + parcela.totalPerimetro() + " m");
        System.out.println("Elementos de la parcela: " + parcela.toString() + "\nTotal perímetro: " + parcela.totalArea() + " m^2");
        */

        Parcela parcela2 = new Parcela();
        Figura cuadrado2 = new Cuadrado(5);
        Figura triangulo2 = new Triangulo(4, 6, 6);

        parcela2.agregarFigura(cuadrado2);
        parcela2.agregarFigura(triangulo2);

        // Creamos un dron para calcular el área y el perímetro total de las parcelas que introduzcamos
        Dron dron = new Dron();

        // Comprobamos que funcione como debe
        System.out.println(dron.totalPerimetro(parcela, parcela2));
        System.out.println(dron.totalArea(parcela, parcela2));
    }
}
