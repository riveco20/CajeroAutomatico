package com.EjerciciosJava.demo.Ejercicios.domain;

public class ClaseHijaConsulta extends  ClasePadreAbstracta{

    @Override
    public void transacciones(){
        System.out.println("---------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }

}
