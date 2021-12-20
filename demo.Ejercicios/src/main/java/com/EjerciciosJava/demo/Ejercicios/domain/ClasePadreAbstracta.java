package com.EjerciciosJava.demo.Ejercicios.domain;

import java.util.Scanner;

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

            if(seleccion==1){
                ClasePadreAbstracta mensajero = new ClaseHijaConsulta();
                mensajero.Transacciones();

            }else if(seleccion==2){
                ClasePadreAbstracta mensajero = new ClaseHijaRetiro();
                mensajero.Transacciones();

            }else if(seleccion==3){
                ClasePadreAbstracta mensajero = new ClaseHijaDeposito();
                mensajero.Transacciones();

            }else if(seleccion==4){
                System.out.println("------------------------");
                System.out.println("!Gracias!, vuelva pronto");
                System.out.println("------------------------");
                bandera =2;
            }

        }while (bandera!=2);

    }

    //Metodo para solicitar cantidad de retiro

    public void Retiro(){
        this.retiro= entrada.nextInt();

    }

    //Metodo para solicitar deposito

    public void Deposito(){
        this.deposito = entrada.nextInt();
    }

    //Metodo Abstracto

    public abstract  void Transacciones();

    //Metodos setter y getter


    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClasePadreAbstracta.saldo = saldo;
    }
}
