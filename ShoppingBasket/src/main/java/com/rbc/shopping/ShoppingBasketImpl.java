package com.rbc.shopping;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by kumar on 19/10/2016.
 */
public class ShoppingBasketImpl implements ShoppingBasket {

    public double getTotalCost(List<Item> items) {

        if(items == null || items.isEmpty()){
            return 0.0;
        }

        return items.stream().mapToDouble(item -> item.getQuantity() * item.getPrice()).sum();
    }
}
