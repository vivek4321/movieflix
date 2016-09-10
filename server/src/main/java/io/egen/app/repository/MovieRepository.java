package io.egen.app.repository;

import java.util.List;

import io.egen.app.entity.Employee;
import io.egen.app.entity.Movie;

public interface MovieRepository {
	public List<Movie> findAll();
	
	public Movie findByID(int id);

	public Movie create(Movie movie);

	public Movie update(Movie movie);

	public void delete(Movie movie);

	public Movie findByName(String movieTitle);

}
