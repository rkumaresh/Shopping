import com.rbc.shopping.Item;
import com.rbc.shopping.ShoppingBasket;
import com.rbc.shopping.ShoppingBasketImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kumar on 19/10/2016.
 */
@RunWith(JUnit4.class)
public class ShoppingBasketTest {


    /*

    Please write a program that takes a basket of items and outputs its total cost.

    The basket can contain one or more of the following items: Bananas, Oranges, Apples, Lemons, Peaches


     */

    @Test
    public void testReturnsCorrectTotalCostOfTheShoppingBasket(){
        ShoppingBasket shoppingBasket = new ShoppingBasketImpl();
        List<Item> items = new ArrayList<Item>();
        double totalCost = shoppingBasket.getTotalCost(items);
        Double expected = 0.0;
        assertEquals(expected, Double.valueOf(totalCost));

        double orangePrice = .50;
        double applePrice = .25;
        double lemonPrice = .10;

        items.add(createItem(1, "Orange", 1, orangePrice));
        items.add(createItem(2, "Apple", 1, applePrice));
        totalCost = shoppingBasket.getTotalCost(items);
        expected = orangePrice + applePrice;
        assertEquals(expected, Double.valueOf(totalCost));


        items.clear();
        items.add(createItem(1, "Orange", 1, orangePrice));
        items.add(createItem(2, "Apple", 2, applePrice));
        items.add(createItem(3, "Lemons", 5, lemonPrice));
        totalCost = shoppingBasket.getTotalCost(items);
        expected = orangePrice + (2 * applePrice) + (5 * lemonPrice);
        assertEquals(expected, Double.valueOf(totalCost));

    }

    private static Item createItem(int id, String name, int quantity, double price) {
        Item item = new Item();
        item.setId(id);
        item.setName(name);
        item.setQuantity(quantity);
        item.setPrice(price);
        return item;
    }

}
