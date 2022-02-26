import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest
{
    @Test
    void main() // Testing the unique elements count
    {
        int[] testArray1 = {1, 2, 3, 4, 5, 3, 2, 1};
        int check = RemoveDuplicates.removed(testArray1);
        assertEquals(5, check);

        int[] testArray2 = {5, 5, 5, 6 ,4, 3};
        int check2 = RemoveDuplicates.removed(testArray2);
        assertEquals(4, check2);

        int[] testArray3 = {7,4,2,5,8,8,8};
        int check3 = RemoveDuplicates.removed(testArray3);
        assertNotEquals(7, check3);
    }
}