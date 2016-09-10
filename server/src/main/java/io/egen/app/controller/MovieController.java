package io.egen.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.app.entity.Employee;
import io.egen.app.entity.Movie;
import io.egen.app.service.MovieService;

@RestController
@RequestMapping(value = "/movies", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)


public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	public List<Movie> findAll() {
		return service.findAll();
	}
	@RequestMapping( method = RequestMethod.GET, value = "getByID/{id}")
	public Movie findById(@PathVariable("id") String id) {
		return service.findById(Integer.parseInt(id));
	}

	@RequestMapping(value="create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie create(@RequestBody Movie movie) {
		return service.create(movie);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "update/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie update(@PathVariable("id") String movieId, @RequestBody Movie movie) {
		return service.update(Integer.parseInt(movieId), movie);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable("id") String movieId) {
		service.remove(Integer.parseInt(movieId));
	}

}
