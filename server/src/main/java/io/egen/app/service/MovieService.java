package io.egen.app.service;

import java.util.List;

import io.egen.app.entity.Movie;

public interface MovieService {
	
	public List<Movie> findAll();
	
	public Movie findById(int movieId);

	public Movie create(Movie movie);

	public Movie update(int movieId, Movie movie);

	public void remove(int movieId);

}
