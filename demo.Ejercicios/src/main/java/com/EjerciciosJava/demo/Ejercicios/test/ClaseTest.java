package com.EjerciciosJava.demo.Ejercicios.test;

import com.EjerciciosJava.demo.Ejercicios.domain.ClaseHijaConsulta;
import com.EjerciciosJava.demo.Ejercicios.domain.ClasePadreAbstracta;

public class ClaseTest {

    public static void main(String[] args) {
        ClasePadreAbstracta mensajero = new ClaseHijaConsulta();
        mensajero.setSaldo(500);
        mensajero.operaciones();
    }

}
