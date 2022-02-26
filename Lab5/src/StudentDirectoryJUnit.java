import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDirectoryJUnit
{
    @Test
    void main()
    {
        int[][] arrayTest1 = {{0,22,12,33}};
        boolean check = StudentDirectory.FilterByMinimumAge(arrayTest1, 10, 0);
        assertEquals(true, check);

        int[][] arrayTest2 = {{0,32,14,80}};
        boolean check2 = StudentDirectory.FilterByMinimumYear(arrayTest1, 16, 0);
        assertEquals(false, check2);
    }
}