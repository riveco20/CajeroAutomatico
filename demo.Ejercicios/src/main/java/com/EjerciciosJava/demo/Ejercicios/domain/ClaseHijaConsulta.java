package com.EjerciciosJava.demo.Ejercicios.domain;

public class ClaseHijaConsulta extends  ClasePadreAbstracta{

    @Override
    public void Transacciones(){
        System.out.println("---------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }

}
