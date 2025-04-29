package com.alura.starwarsapi.controller;

import com.alura.starwarsapi.model.Pelicula;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String nameFile = pelicula.title().replace(" ","_").trim()+".json";
        FileWriter file =  new FileWriter(nameFile);
        file.write(gson.toJson(pelicula));
        file.close();
    }
}
