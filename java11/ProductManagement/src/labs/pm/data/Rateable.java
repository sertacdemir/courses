/*
 * Copyright (C) 2023 SD Demo. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package labs.pm.data;

/**
 * @author sertacdemir
 * @version 1.0
 * @project ProductManagement
 */
@FunctionalInterface
public interface Rateable<T> {
    public static final Rating DEFAULT_RATING  = Rating.NOT_RATED;

    //default is already public abstract
    T applyRating (Rating rating);

    public default T applyRating (int stars){
        return applyRating(convert(stars));
    }

    public default Rating getRating(){
        return DEFAULT_RATING;
    }

    public static Rating convert (int stars){
        return (stars >=0 && stars <= 5) ? Rating.values()[stars] : DEFAULT_RATING;
    }

}
