package io.egen.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.app.entity.Employee;
import io.egen.app.entity.Movie;
import io.egen.app.exception.EntityAlreadyExistException;
import io.egen.app.exception.EntityNotFoundException;
import io.egen.app.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository repository;
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Movie findById(int movieId) {
		Movie movie = repository.findByID(movieId);
		if (movie == null) {
			throw new EntityNotFoundException("movie not found");
		}
		return movie;
	}
	
	@Transactional
	@Override
	public Movie create(Movie movie) {
//		Movie existing = repository.findByName(movie.getMovieTitle());
//		System.out.println("I am here"+ movie.getMovieTitle());
//		if (existing != null) {
//			throw new EntityAlreadyExistException("Movie already exists with this name");
//		}
		return repository.create(movie);
	}
	
	public Movie update(int movieId, Movie movie) {
		Movie existing = repository.findByID(movieId);
		if (existing == null) {
			throw new EntityNotFoundException("Movie not found");
		}
		return repository.update(movie);
	}
	@Transactional
	@Override
	public void remove(int movieId) {
		Movie existing = repository.findByID(movieId);
		if (existing == null) {
			throw new EntityNotFoundException("Movie not found");
		}
		repository.delete(existing);
	}

}
