import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListJUnit
{
    @Test
    public static void main(String[] args)
    {
        //test constructor 2, other tests will test its validity
        int[] tempArr = {1,2,3,4};
        MyArrayList arr = new MyArrayList(tempArr);

        //Test add()
        arr.add(5); //element not index
        int[] check = {1,2,3,4,5};
        assertArrayEquals(check, arr.data);
        System.out.println(arr.toString()); // Test to string

        //Test remove()
        arr.remove(4); //index not element
        int[] check2 = {1,2,3,4};
        assertArrayEquals(check2, arr.data);
        System.out.println(arr.toString()); //Test to string

        //Test getSize()
        System.out.println("Size is: " + arr.getSize());

        //Test constructor 1
        MyArrayList arr2 = new MyArrayList();

        //Test isEmpty()
        assertFalse(arr.isEmpty());
        assertTrue(arr2.isEmpty());

        //Test indexOf()
        assertEquals(1, arr.indexOf(2));
    }
}