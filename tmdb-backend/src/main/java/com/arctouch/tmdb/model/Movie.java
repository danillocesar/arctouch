package com.arctouch.tmdb.model;

import java.util.List;

public class Movie {
	String posterPath;
	Boolean adult;
	String overview;
	String releaseDate;
	List<Integer> genreIds;
	Integer id;
	String originaTitle;
	String originalLanguage;
	String title;
	String backdropPath;
	Integer popularity;
	Integer voteCount;
	Boolean video;
	Integer voteAverage;
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public Boolean getAdult() {
		return adult;
	}
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<Integer> getGenreIds() {
		return genreIds;
	}
	public void setGenreIds(List<Integer> genreIds) {
		this.genreIds = genreIds;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOriginaTitle() {
		return originaTitle;
	}
	public void setOriginaTitle(String originaTitle) {
		this.originaTitle = originaTitle;
	}
	public String getOriginalLanguage() {
		return originalLanguage;
	}
	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBackdropPath() {
		return backdropPath;
	}
	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}
	public Integer getPopularity() {
		return popularity;
	}
	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}
	public Integer getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}
	public Boolean getVideo() {
		return video;
	}
	public void setVideo(Boolean video) {
		this.video = video;
	}
	public Integer getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(Integer voteAverage) {
		this.voteAverage = voteAverage;
	}
	
}
