/*
 * Copyright (C) 2022 SD Demo. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package labs.pm.app;

import labs.pm.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

/**
 * @author sertacdemir
 * @version 1.0
 * {@code Shop} class represents an application that manages Products
 */

public class Shop {

    public static void main(String[] args) {

        ProductManager pm = new ProductManager(Locale.UK);

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport();
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        pm.printProductReport();
//        p1.setId(101);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));

//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);

//        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount()+ " "+p1.getRating().getStars());
//        System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPrice()+" "+p2.getDiscount()+ " "+p2.getRating().getStars());
//        System.out.println(p3.getId()+" "+p3.getName()+" "+p3.getPrice()+" "+p3.getDiscount()+ " "+p3.getRating().getStars());
//        System.out.println(p4.getId()+" "+p4.getName()+" "+p4.getPrice()+" "+p4.getDiscount()+ " "+p4.getRating().getStars());
//        System.out.println(p5.getId()+" "+p5.getName()+" "+p5.getPrice()+" "+p5.getDiscount()+ " "+p5.getRating().getStars());

//        Product p6 = pm.createProduct(104, "Chocolade", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolade", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.TWO_STAR);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
//
//        System.out.println(p6.equals(p7));

//        if (p3 instanceof Food){
//            LocalDate bestBefore = ((Food)p3).getBestBefore();
//            System.out.println("BestBefore:" + p3.getBestBefore());
//        }

//        System.out.println("BestBefore:" + p1.getBestBefore());
    }
}
