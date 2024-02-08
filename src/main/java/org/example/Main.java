package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cliente;
        String cantidad;
        int saborHelado;

        Scanner keyboard = new Scanner(System.in);

        Integer heladoSencillo =3000;
        Integer heladoDoble =6000;
        Integer heladoEspecial =9000;
        Integer tipodeHeladoSeleccionado;
        double cantidadHeladoSencillo = 0;
        double cantidadHeladoDoble = 0;
        double cantidadHeladoEspecial = 0;

        System.out.printf("Ingrese su nombre: ");
        cliente = keyboard.nextLine();

        System.out.println("Bienvenido, conoce nuestras opciones: ");
        System.out.println("1. Helado Sencillo ---> $3000");
        System.out.println("2. Helado Doble ---> $6000");
        System.out.println("3. Helado Especial ---> $9000");
        System.out.println("**********************");
        System.out.printf("Tipo de helado que desea: ");
        saborHelado = keyboard.nextInt();

        // Solicitar al usuario la cantidad de helado vendido
        System.out.print("Cantidad de Helado Sencillo vendido: ");
        cantidadHeladoSencillo = keyboard.nextDouble();

        System.out.print("Cantidad de Helado Doble vendido: ");
        cantidadHeladoDoble = keyboard.nextDouble();

        System.out.print("Cantidad de Helado Especial vendido: ");
        cantidadHeladoEspecial = keyboard.nextDouble();

        // Calcular los totales después de recibir las cantidades vendidas
        double totalVentasHeladoSencillo = heladoSencillo * cantidadHeladoSencillo;
        double totalVentasHeladoDoble = heladoDoble * cantidadHeladoDoble;
        double totalVentasHeladoEspecial = heladoEspecial * cantidadHeladoEspecial;
        double totalVentasDelDia = totalVentasHeladoDoble + totalVentasHeladoSencillo + totalVentasHeladoEspecial;

        // Imprimir los resultados
        System.out.printf("Ventas de Helado Sencillo: %.2f COP%n", totalVentasHeladoSencillo);
        System.out.printf("Ventas de Helado Doble: %.2f COP%n", totalVentasHeladoDoble);
        System.out.printf("Ventas de Helado Especial: %.2f COP%n", totalVentasHeladoEspecial);
        System.out.printf("Total general de ventas del día: %.2f COP%n", totalVentasDelDia);

        double totalCantidad = 0.0;
        double totalCantidadheladoSencillo = 0.0;
        double totalCantidadheladoDoble = 0.0;
        double totalCantidadHeladoEspecial = 0.0;


    }
}