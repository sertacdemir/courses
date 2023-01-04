/*
 * Copyright (C) 2022 SD Demo. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author sertacdemir
 * @version 1.0
 * {@code Product} class represents properties and behaviours of product objects in the Product Management System
 * <br>
 * Each Product has an id, name and price and calculated discount
 */
public abstract class Product {
    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value of the discount rate
     * <br>
     * Discount Rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    Product(){
        this(0,"no name", BigDecimal.ZERO);
    }

    public int getId() {
        return id;
    }

    // to make object immutable
//    public void setId(final int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(final String name) {
//        this.name = name;
//    }

    public BigDecimal getPrice() {
        return price;
    }

//    public void setPrice(final BigDecimal price) {
//        this.price = price;
//    }

    public Rating getRating() {
        return rating;
    }

    /**
     * Calculates discount based on a product price and {@link BigDecimal discount rate}
     * @return a {@link java.math.BigDecimal BigDecimal} value of the discount
     */
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Get the value of the best before date
     * @return the value of bestBefore
     */
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    public abstract Product applyRating(Rating newRating);
//    {
//        return new Product(this.id, this.name, this.price, newRating);
//    }

    @Override
    public String toString() {
        return "id="+ id + ", name=" + name + ", price=" + price+ ", discount=" + getDiscount() + ", rating= " + rating.getStars() + ", best before=" + getBestBefore();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
//        if (obj != null && getClass() == obj.getClass()) {
        if(obj instanceof Product){
            final Product other = (Product) obj;
            return this.id == other.id && Objects.equals(this.name, other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash * this.id;
        return hash;
    }
}
