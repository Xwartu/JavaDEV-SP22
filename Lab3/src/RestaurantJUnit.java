import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantJUnit {

    @Test
    void Main()
    {
        // Make an object of restaurant, set its balance and check it
        Restaurant rest = new Restaurant();
        rest.setBalance(1000);
        assertEquals(rest.getBalance(), 1000);

        // Show balance doesn't have to be reinitialized each time
        rest.itemPurchase(400);
        assertEquals(rest.getBalance(), 600);

        // Set the balance equal to the int in assert statement, prove they are different objects
        rest.itemPurchase(400);
        assertNotSame(rest.getBalance(), 800);
    }
}