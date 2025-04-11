package com.capStone.Niit.Repository;

import com.capStone.Niit.Entity.FavouriteRestaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavouriteRestaurantRepository extends MongoRepository<FavouriteRestaurant, Integer> {
    public abstract FavouriteRestaurant findByEmailIdAndRestaurantName(String emailId, String restaurantName);
    public abstract List<FavouriteRestaurant> findAllByEmailId(String emailId);

    @Query("{'emailId' :{$in:[?0]},'restaurantName' :{$in:[?1]}}")
    public abstract boolean deleteByEmailIdAndRestaurantName(String emailId , String restaurantName);
}
