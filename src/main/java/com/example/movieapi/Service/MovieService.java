package com.example.movieapi.Service;

import com.example.movieapi.Entity.Movie;
import com.example.movieapi.Exception.MovieNotFoundException;
import com.example.movieapi.Repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Movie singleMovie(ObjectId id){
        return movieRepository.findById(id).orElseThrow(()-> new MovieNotFoundException("Movie with id "+id+" not found"));
    }
}
