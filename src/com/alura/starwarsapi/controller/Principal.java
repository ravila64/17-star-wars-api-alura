package com.alura.starwarsapi.controller;

import com.alura.starwarsapi.model.Pelicula;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarPelicula consulta = new ConsultarPelicula();
        System.out.print("Numero de pelicula a consultar ");
        try {
            var numeroPelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscarPelicula(numeroPelicula);
            System.out.println(pelicula.toString());
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            System.out.println("grabara :"+pelicula);
            generador.guardarJson(pelicula);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("fin del programa.");
        }
    }
}
