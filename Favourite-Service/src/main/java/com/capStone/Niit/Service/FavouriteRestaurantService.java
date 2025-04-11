package com.capStone.Niit.Service;

import com.capStone.Niit.Entity.FavouriteRestaurant;
import com.capStone.Niit.Exception.RestaurantAlreadyExistException;

import java.util.List;

public interface FavouriteRestaurantService {
    public abstract FavouriteRestaurant addFavRestaurant(FavouriteRestaurant favouriteRestaurant) throws RestaurantAlreadyExistException;

    public abstract List<FavouriteRestaurant> getAllFavRestaurant();

    public abstract List<FavouriteRestaurant> getAllFavRestaurantByEmailId(String emailId);

    //public abstract boolean deleteFavRestaurantByEmailIdAndRestaurantName(String emailId , String restaurantName);

    public abstract boolean deleteByRestaurantId(int restaurantId);
}