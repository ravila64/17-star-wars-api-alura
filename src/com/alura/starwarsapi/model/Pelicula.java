package com.alura.starwarsapi.model;

public record Pelicula(String title,
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       String release_date) {
    @Override
    public String toString() {
        return "Pelicula{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", episode_id=" + episode_id +
                ", producer='" + producer + '\'' +
                ", release_date='" + release_date + '\'' +
//              ", opening_crawl='" + opening_crawl + '\'' +
                '}';
    }
}
