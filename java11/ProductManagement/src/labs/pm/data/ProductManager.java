/*
 * Copyright (C) 2023 SD Demo. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author sertacdemir
 * @version 1.0
 * @project ProductManagement
 */
public class ProductManager {
    public Product createProduct (int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        return new Food(id, name, price, rating, bestBefore);
    }
    public Product createProduct (int id, String name, BigDecimal price, Rating rating){
        return new Drink(id, name, price, rating);
    }
}
