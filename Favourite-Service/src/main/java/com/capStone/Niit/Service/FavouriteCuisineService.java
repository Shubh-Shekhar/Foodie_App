package com.capStone.Niit.Service;

import com.capStone.Niit.Entity.FavouriteCuisine;
import com.capStone.Niit.Exception.CuisineAlreadyExistException;

import java.util.List;

public interface FavouriteCuisineService {

    public abstract FavouriteCuisine addFavCuisine(FavouriteCuisine favouriteCuisine) throws CuisineAlreadyExistException;

    public abstract List<FavouriteCuisine> getAllCuisine();

    public abstract List<FavouriteCuisine> getAllFavCuisineByEmailId(String emailId);

    public abstract boolean deleteByCuisineId(int cuisineId);

    public abstract boolean deleteByEmailId(String emailId);
}