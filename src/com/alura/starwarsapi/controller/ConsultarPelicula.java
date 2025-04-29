package com.alura.starwarsapi.controller;

import com.alura.starwarsapi.model.Pelicula;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarPelicula {
    public Pelicula buscarPelicula(int numeroPelicula) {
        URI direccion = URI.create("https://swapi.py4e.com/api/films/" + numeroPelicula + "/");
        //URI direccion = URI.create("https://run.mocky.io/v3/fb33145b-ea5e-42f5-84cf-6eb322ca6907");  // teacher
        System.out.println(direccion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        // buscar un httpResponse
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pelicula.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la pelicula :" + e.getMessage());
        }
    }
}

