package com.EjerciciosJava.demo.Ejercicios.domain;

import java.util.Scanner;
import java.util.logging.Logger;

public abstract class ClasePadreAbstracta {
    protected int transacciones;
    protected int retiro;
    protected int deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void operaciones(){
        int bandera = 0;
        int seleccion = 0;
        do {
            do {

                System.out.println("Por favor seleciones una opcion:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");
                seleccion = this.entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println("Opcion no disponible, vuelva intentarlo");
                    System.out.println("---------------------------------------");
                }
            } while (bandera == 0);

            bandera = getBandera(bandera, seleccion);

        }while (bandera!=2);

    }

    //Metodo para solicitar cantidad de retiro

    public void retiro(){
        this.retiro= entrada.nextInt();
    }

    //Metodo para solicitar deposito

    public void deposito(){
        this.deposito = entrada.nextInt();
    }

    //Metodo Abstracto

    public abstract  void transacciones();

    //Metodos setter y getter


    private int getBandera(int bandera, int seleccion) {
        ClasePadreAbstracta mensajero;
        switch (seleccion){
            case 1:mensajero = new ClaseHijaConsulta();
                mensajero.transacciones();
                break;
            case 2: mensajero = new ClaseHijaRetiro();
                mensajero.transacciones();
                break;
            case 3:mensajero = new ClaseHijaDeposito();
                mensajero.transacciones();
                break;
            case 4:
                System.out.println("-------------------------");
                System.out.println("!Gracias??, vuelva pronto");
                System.out.println("-------------------------");
                bandera =2;
                break;
            default:
                System.out.println("Ingresaste una opcion no valida");
                    break;
        }
        return bandera;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClasePadreAbstracta.saldo = saldo;
    }
}
