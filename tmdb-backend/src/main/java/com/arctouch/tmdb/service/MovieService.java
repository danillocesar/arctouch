package com.arctouch.tmdb.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.arctouch.tmdb.model.ResponseModel;
import com.arctouch.tmdb.service.rest.TmdbRestService;

@Service
public class MovieService extends TmdbRestService {
	@Autowired
	TmdbRestService restService;
	@Value("${tmdb.api.upcoming-path}")
	private String upComingMoviesPath;
	
	public ResponseModel getUpComingMovies(Integer page) {
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("page", page.toString());
		return get(upComingMoviesPath, params);
	}
	
}
