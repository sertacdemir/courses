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
public class Review implements Comparable<Review>{
    private Rating rating;
    private String comments;

    public Review(Rating rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

    public Rating getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", comments='" + comments + '\'' +
                '}';
    }

    @Override
    public int compareTo(Review o) {
        return o.rating.ordinal() - this.rating.ordinal();
    }
}
