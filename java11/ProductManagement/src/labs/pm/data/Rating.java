/*
 * Copyright (C) 2022 SD Demo. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package labs.pm.data;

/**
 * @author sertacdemir
 * @version 1.0
 */
public enum Rating {
    NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
    ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
    TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
    THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");

    private String stars;

    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }

}
