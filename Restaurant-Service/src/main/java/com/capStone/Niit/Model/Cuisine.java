package com.capStone.Niit.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Cuisine {

    @Id
    private String cuisineName;
    private String cuisineImage;
    private double price;

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

    public String getCuisineImage() {
        return cuisineImage;
    }

    public void setCuisineImage(String cuisineImage) {
        this.cuisineImage = cuisineImage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}