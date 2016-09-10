package io.egen.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestAttribute;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name = "Movie.findAll", query = "SELECT e from Movie e ORDER BY e.movieID"),	
})
public class Movie {
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int movieID;
	
	private String movieTitle;
	private String movieYear;
	private String movieRated;
	private String movieReleased;
	private String Runtime;
	private String Genre;
	private String Director;
	private String Writer;
	private String Actors;
	private String Plot;
	private String Language;
	private String Country;
	private String Awards;
	private String Poster;
	private String Metascore;
	private String imdbRating;
	private String imdbVotes;
	private String imdbID;
	private String Type;
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}
	public String getMovieRated() {
		return movieRated;
	}
	public void setMovieRated(String movieRated) {
		this.movieRated = movieRated;
	}
	public String getMovieReleased() {
		return movieReleased;
	}
	public void setMovieReleased(String movieReleased) {
		this.movieReleased = movieReleased;
	}
	public String getRuntime() {
		return Runtime;
	}
	public void setRuntime(String runtime) {
		Runtime = runtime;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getActors() {
		return Actors;
	}
	public void setActors(String actors) {
		Actors = actors;
	}
	public String getPlot() {
		return Plot;
	}
	public void setPlot(String plot) {
		Plot = plot;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getAwards() {
		return Awards;
	}
	public void setAwards(String awards) {
		Awards = awards;
	}
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String poster) {
		Poster = poster;
	}
	public String getMetascore() {
		return Metascore;
	}
	public void setMetascore(String metascore) {
		Metascore = metascore;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	
	
}
