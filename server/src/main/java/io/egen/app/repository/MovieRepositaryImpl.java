package io.egen.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.app.entity.Employee;
import io.egen.app.entity.Movie;

@Repository

public class MovieRepositaryImpl implements MovieRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findAll", Movie.class);
		return query.getResultList();
	}

	@Override
	public Movie findByID(int id) {
		// TODO Auto-generated method stub
		return em.find(Movie.class, id);
	}

	@Override
	public Movie create(Movie movie) {
		em.persist(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie) {
		return em.merge(movie);
	}

	@Override
	public void delete(Movie movie) {
		em.remove(movie);
	}

	@Override
	public Movie findByName(String movieTitle) {	
		return em.find(Movie.class, movieTitle);
	}

}
