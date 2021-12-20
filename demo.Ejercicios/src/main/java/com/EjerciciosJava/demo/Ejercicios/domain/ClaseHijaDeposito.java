package com.EjerciciosJava.demo.Ejercicios.domain;

public class ClaseHijaDeposito extends ClasePadreAbstracta{
    @Override
    public void transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        deposito();

        transacciones = getSaldo();
        setSaldo(transacciones+deposito);

        System.out.println("---------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
