package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {

	private Long idLong;
	private String title;
	private Double score;
	private Integer count;
	private String image;

	public MovieDTO() {
	}

	public MovieDTO(Long idLong, String title, Double score, Integer count, String image) {
		this.idLong = idLong;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MovieDTO(Movie movie) {
		idLong = movie.getIdLong();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
