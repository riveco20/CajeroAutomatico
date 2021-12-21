package com.EjerciciosJava.demo.Ejercicios.domain;

public class ClaseHijaDeposito extends ClasePadreAbstracta{
    @Override
<<<<<<< HEAD
    public void transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        deposito();
=======
    public void Transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        Deposito();
>>>>>>> 65252804acecc22f3a58498fdd87f491c1bebc0d

        transacciones = getSaldo();
        setSaldo(transacciones+deposito);

        System.out.println("---------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
