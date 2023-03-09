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
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Predicate;

/**
 * @author sertacdemir
 * @version 1.0
 * {@code Shop} class represents an application that manages Products
 */

public class Shop {

    public static void main(String[] args) {

        ProductManager pm = new ProductManager("en-GB");

        pm.printProductReport(101);

//        pm.parseProduct("F,103,cake,3.99,0,2023-02-24");
        pm.printProductReport(102);
        pm.createProduct(103, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.reviewProduct(103, Rating.THREE_STAR, "Coffee was OK");
        pm.reviewProduct(103, Rating.ONE_STAR, "Where is the milk?");
        pm.reviewProduct(103, Rating.FIVE_STAR, "It's perfect with ten spoons of sugar!");
//        pm.dumpData();
//        pm.restoreData();
        pm.printProductReport(103);

////        pm.changeLocale("fr-FR");

//        pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), Rating.NOT_RATED, LocalDate.now());
//        pm.reviewProduct(104, Rating.THREE_STAR, "Just another cookie");
//        pm.reviewProduct(104, Rating.THREE_STAR, "OK");
////        pm.printProductReport(104);
//
////        pm.changeLocale("tr-TR");
//
//        pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
//        pm.reviewProduct(105, Rating.FOUR_STAR, "Tasty!");
//        pm.reviewProduct(105, Rating.FOUR_STAR, "Not bad at all");
////        pm.printProductReport(105);
//        pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now().plusDays(3));
//        pm.reviewProduct(106, Rating.TWO_STAR, "Too sweat");
//        pm.reviewProduct(106, Rating.THREE_STAR, "Better than cookie");
//        pm.reviewProduct(106, Rating.TWO_STAR, "Too bitter");
//        pm.reviewProduct(106, Rating.ONE_STAR, "I don't get it!");
//        pm.printProductReport(106);
//
       pm.printProducts(p -> p.getPrice().floatValue() < 2, (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//       pm.printProducts((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));
//
//        Comparator<Product> ratingSorter = (p1,p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
//        Comparator<Product> priceSorter = (p1,p2) -> p2.getPrice().compareTo(p1.getPrice());
//
//        pm.printProducts(ratingSorter.thenComparing(priceSorter));
//        pm.printProducts(ratingSorter.thenComparing(priceSorter).reversed());

        pm.getDiscounts().forEach(
                (rating, discount) -> System.out.println(rating + "\t" + discount)
        );

    }
}
