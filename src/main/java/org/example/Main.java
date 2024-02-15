package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean tipoDeCliente;
        String tipoDeConsola;
        Integer precioPs3=300000;
        Integer precioPs4=900000;
        Integer preciops5=2500000;
        Integer precioControl;
        double descuento=0.20;
        double totalSinDescuento=0.0;
        double totalConDescuento=0.0;
        boolean eleccionControl;
        String tipoControl;
        Integer controlPs3=80000;
        Integer controlPs4=200000;
        Integer controlPs5=350000;

        Scanner leer = new Scanner(System.in);

        System.out.println(" Bienvenido a la clinica del play");
        System.out.println(" usted es un cliente nuevo? :");
        tipoDeCliente=leer.nextBoolean();

        if (tipoDeCliente==true){
            System.out.println(" confirmamos que usted es un cliente nuevo");
            System.out.println("que consoa desea conmprar?: ");


            System.out.println("consola ps3: ");
            System.out.println("consola ps4: ");
            System.out.println("consola ps5: ");
            leer.nextLine();

            tipoDeConsola =leer.nextLine();


            if (tipoDeConsola.equals("ps3")){
                System.out.println("el precio de su consola es: " + precioPs3);
                totalSinDescuento=totalSinDescuento+precioPs3;

            } else if (tipoDeConsola.equals("ps4")) {
                System.out.println("el precio de su consola es: " + precioPs4);
                totalSinDescuento=totalSinDescuento+precioPs4;

            } else if (tipoDeConsola.equals("ps5")) {
                System.out.println("el precio de tu consola es: " +preciops5);
                totalSinDescuento=totalSinDescuento+preciops5;

            }else{
                System.out.println("opcion invalida");
            }

            System.out.println("Desea incluir un control adicional para su consola ?");
            eleccionControl=leer.nextBoolean();

            if (eleccionControl==true){

                System.out.println("seleccione para que consola desea su control: ");

                System.out.println("consola ps3: ");
                System.out.println("consola ps4: ");
                System.out.println("consola ps5: ");
                leer.nextLine();

                tipoControl=leer.nextLine();

                if (tipoControl.equals("ps3")){
                    System.out.println("el precio de su control es " + controlPs3 + "y se le obsequiara un video juego");
                    System.out.println("Su precio total a pagar es: " + (totalSinDescuento=totalSinDescuento+controlPs3));

                }else if (tipoControl.equals("ps4")){
                    System.out.println("el precio de su control es " + controlPs4 + "y se le obsequiara un video juego");
                    System.out.println("su precio total a pagar es: " + (totalSinDescuento=totalSinDescuento+controlPs4));

                }else if (tipoControl.equals("ps5")){
                    System.out.println(" el precio de su control es " + controlPs5 + "y se le obsequiara un video juego");
                    System.out.println("precio total a pagar" + (totalSinDescuento=totalSinDescuento+controlPs5));
                }



            }else{
                System.out.println("Dato invalido");
            }





        }else{
            System.out.println("opcion invalidad vuelva a intertar");

        }

    }
}