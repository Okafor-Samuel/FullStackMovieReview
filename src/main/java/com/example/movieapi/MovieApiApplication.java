package com.example.movieapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.mapping.Document;

@SpringBootApplication
public class MovieApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApiApplication.class, args);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Document(collection = "reviews")
    public static class Review {
        private ObjectId id;
        private String reviewBody;
    }
}
