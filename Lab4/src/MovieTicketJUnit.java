import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTicketJUnit
{

    @Test
    void Main()
    {
        boolean check = MovieTicket.ageRestricted(19, "R");
        assertEquals(false, check);

        boolean check2 = MovieTicket.ageRestricted(2, "R");
        assertEquals(true, check2);

        boolean check3 = MovieTicket.ageRestricted(13, "PG13");
        assertEquals(false, check3);

        int price1 = MovieTicket.getPrice(7);
        assertEquals(5, price1);
        int price2 = MovieTicket.getPrice(15);
        assertEquals(9, price2);
        int price3 = MovieTicket.getPrice(31);
        assertEquals(12, price3);
    }
}