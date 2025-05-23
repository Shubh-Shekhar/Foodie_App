package com.capStone.Niit.Repository;

import com.capStone.Niit.Exception.RestaurantNotFoundException;
import com.capStone.Niit.Model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, Integer> {
    public abstract List<Restaurant> findByLocation(String location) throws RestaurantNotFoundException;

    @Query("{'cuisine.cuisineName' :{$in:[?0]}}")
    public abstract List<Restaurant> findByCuisineName(String cuisineName);

    public abstract List<Restaurant> findByRestaurantName(String restaurantName);

    @Query("{'location' :{$in:[?0]},'cuisine.cuisineName' :{$in:[?1]}}")
    public abstract List<Restaurant> findByLocationAndCuisineName(String location, String cuisineName);
    public abstract List<Restaurant> findByLocationAndRestaurantName(String location, String restaurantName);
}
