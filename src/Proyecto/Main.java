package Proyecto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializamos variables
        int entradaInt;
        String entrada;
        Parcela parcelaActiva = null;
        Scanner sc = new Scanner(System.in);

        // Iniciamos listas anónimas para almacenar las parcelas sin necesidad de darle un nombre.
        List<Parcela> listaParcelas = new LinkedList<>();

        // Llamamos a la función que imprime el menú.
        while (true) {
            do {
                // Imprimimos el menú
                menu();
                entradaInt = sc.nextInt();
                // Hacemos saber al usuario que debe introducir algo que tome el programa
                if (entradaInt < 1 || entradaInt > 7) {
                    System.out.println("Opción no disponible, introduce algo válido");
                }
            } while (entradaInt < 1 || entradaInt > 7);

            switch (entradaInt) {
                case 1:
                    // Crear parcela
                    System.out.println("Creando parcela...");
                    listaParcelas.add(new Parcela());
                    System.out.println("Parcela creada con éxito.\n" +
                            "¡Recuerda que puedes crear infinitas parcelas!, " +
                            "pero si quieres seleccionar una parcela deberás específicarlo, de no ser así se autoseleccionara la última que hayas creado!");
                    int ultimapos = listaParcelas.size() - 1;
                    parcelaActiva = listaParcelas.get(ultimapos);
                    break;
                case 2:
                    // Selección de parcela
                    // Mostramos las parcelas creadas.
                    System.out.println("Mostrando parcelas creadas...");
                    System.out.println(listaParcelas.toString());
                    // Aquí deberemos validar si existe la parcela introducida por el usuario.
                    do {
                        System.out.println("¿Qué parcela quieres seleccionar? (Introduce el número de la parcela, siendo la primera parcela 1)");
                        entradaInt = sc.nextInt();
                        if (entradaInt < 1 || entradaInt > listaParcelas.size()) {
                            System.out.println("Parcela no encontrada. ¡Introduce una parcela que hayas creado!");
                            // Volvemos a mostrar las parcelas creadas
                            System.out.println(listaParcelas.toString());
                        }
                    } while (entradaInt < 1 || entradaInt > listaParcelas.size());
                    parcelaActiva = listaParcelas.get(entradaInt - 1);
                    break;
                case 3:
                    // Añadir figuras
                    // Tomamos y arreglamos la excepción por si se da el caso de que el usuario elige una opción sin haber creado una parcela
                    if (parcelaActiva == null) {
                        System.out.println("No hay ninguna parcela activa. ¡Selecciona o crea una parcela para mostrar su contenido!");
                        // Salimos del switch
                        break;
                    }
                    System.out.println("""
                            \s
                             ----------------------------------------
                                      SELECCIÓN DE FIGURA           \s
                             ----------------------------------------
                              1. Cuadrado
                              2. Triángulo
                              3. Rectángulo
                              4. Círculo
                              5. Volver al menú principal
                             ----------------------------------------
                             Elige una figura:\s""");
                    entradaInt = sc.nextInt();
                    switch (entradaInt) {
                        case 1:
                            System.out.println("Introduce el lado del cuadrado:");
                            double lado = sc.nextDouble();
                            parcelaActiva.agregarFigura(new Cuadrado(lado));
                            break;
                        case 2:
                            System.out.println("Introduce los lados del triángulo (base, lado1, lado2):");
                            double base = sc.nextDouble();
                            double lado1 = sc.nextDouble();
                            double lado2 = sc.nextDouble();
                            parcelaActiva.agregarFigura(new Triangulo(base, lado1, lado2));
                            break;
                        case 3:
                            System.out.println("Introduce la base y la altura del rectángulo:");
                            double baseRect = sc.nextDouble();
                            double alturaRect = sc.nextDouble();
                            parcelaActiva.agregarFigura(new Rectangulo(baseRect, alturaRect));
                            break;
                        case 4:
                            System.out.println("Introduce el radio del círculo:");
                            double radio = sc.nextDouble();
                            parcelaActiva.agregarFigura(new Circulo(radio));
                            break;
                        case 5:
                            System.out.println("Saliendo del submenú");
                            break;
                        default:
                            System.out.println("Figura no reconocida. ¡Introduce una figura válida!");
                    }
                case 4:
                    // Calcular área total
                    // Tomamos y arreglamos la excepción por si se da el caso de que el usuario elige una opción sin haber creado una parcela
                    if (parcelaActiva == null) {
                        System.out.println("No hay ninguna parcela activa. ¡Selecciona o crea una parcela para mostrar su contenido!");
                        // Salimos del switch
                        break;
                    }
                    System.out.println("Parcela seleccionada: " + parcelaActiva.toString());
                    System.out.println("El área total de la parcela es: " + parcelaActiva.totalArea() + " m^2");
                    break;
                case 5:
                    // Calcular perímetro total
                    // Tomamos y arreglamos la excepción por si se da el caso de que el usuario elige una opción sin haber creado una parcela
                    if (parcelaActiva == null) {
                        System.out.println("No hay ninguna parcela activa. ¡Selecciona o crea una parcela para mostrar su contenido!");
                        // Salimos del switch
                        break;
                    }
                    System.out.println("Parcela seleccionada: " + parcelaActiva.toString());
                    System.out.println("El área total de la parcela es: " + parcelaActiva.totalPerimetro() + " m");
                    break;
                case 6:
                    // Mostrar resumen de parcela (mostrar figuras)
                    // Tomamos y arreglamos la excepción por si se da el caso de que el usuario elige una opción sin haber creado una parcela
                    if (parcelaActiva == null) {
                        System.out.println("No hay ninguna parcela activa. ¡Selecciona o crea una parcela para mostrar su contenido!");
                        // Salimos del switch
                        break;
                    }
                    System.out.println("\n----------------------------------------");
                    System.out.println("         RESUMEN DEL SISTEMA            ");
                    System.out.println("----------------------------------------");
                    System.out.println(" > Todas las parcelas creadas:");
                    System.out.println("   " + listaParcelas.toString());
                    System.out.println();
                    System.out.println(" > Parcela activa actualmente:");
                    System.out.println("   " + parcelaActiva.toString());
                    System.out.println("----------------------------------------\n");
                    break;
                case 7:
                    // Salir del programa
                    System.out.println("Finalizando programa...");
                    // Salimos del programa con el return
                    return;
            }
        }

    }

    public static void menu() {
        /* El menú debe permitir al usuario:
         * Agregar figuras a la parcela
         * Calcular el área total de la parcela
         * Calcular el perímetro total de la parcela
         * Mostrar resumen de parcela (mostrar figuras)
         * Salir del programa
         */

        System.out.println("""
                \s
                 ========================================
                           SISTEMA DE PARCELAS          \s
                 ========================================
                  1. Crear parcela
                  2. Seleccionar parcela
                  3. Añadir figuras a la parcela
                  4. Calcular área de la parcela
                  5. Calcular perímetro de la parcela
                  6. Mostrar contenido de la parcela
                  7. Salir
                 ========================================
                 Elige una opción:\s"""); // El \s al final deja un espacio limpio para que el usuario escriba
    }
}
