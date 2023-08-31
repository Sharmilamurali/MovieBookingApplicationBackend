package com.moviebooking.service;


import com.moviebooking.entity.Movie;
import com.moviebooking.entity.MovieId;

import java.util.List;

public interface MovieService {
    Movie addMovie(Movie movie);

    Movie updateMovie(Movie movie);

    Movie updateTicketStatus(MovieId movieId);
   
    List<Movie> getAllMovies();
    List<Movie> searchByMovieOrTheatreNames(String searchKeyword);
    List<Movie> searchMoviesByMovieName(String movieName);
    List<Movie> searchMoviesByTheatreName(String theatreName);
    public Movie searchByMovieId(String movieName,String theatreName);
    void deleteMovieById(MovieId movieId);
}
