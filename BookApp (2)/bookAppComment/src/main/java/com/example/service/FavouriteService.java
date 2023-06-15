package com.example.service;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;

import com.example.model.Favourite;


public interface FavouriteService {
	public Favourite saveFavourite(Favourite f);
	public List<Favourite> getAllFavourite (String username);
	
	@Query("from Favourite group by bookId")
    public List<Favourite> getAllRecommend();

	
	public Favourite deleteFromFavourite(String id, String username);
	
	public List<Favourite> getFavouriteBooksByIdAndUsername(String id, String username);
	
}
