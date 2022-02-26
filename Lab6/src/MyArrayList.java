public class MyArrayList
{
    // Instance Variables
    int[] data;
    int size;

    //Methods
    public MyArrayList()
    {
        data = new int[4];
        size = 0;
    }

    public MyArrayList(int[] arr)
    {
        data = arr.clone();
        size = data.length;
    }

    public void add(int n)
    {
        boolean fullCheck = false;
        for(int i: data)
        {
            if(i == 0)
            {
                fullCheck = true;
            }
        }
        if(fullCheck == false)
        {
            int[] tempArray = new int[data.length+1];
            int lastElementIndex = 0;
            for(int i = 0; i < data.length; i++)
            {
                tempArray[i] = data[i];
                lastElementIndex += 1;
            }
            data = tempArray.clone();
            data[lastElementIndex] = n; // Made new array, add n to new array after making room for it
        }
        else
        {
            boolean emptyPlaceCheck = false;
            int i = 0;
            while (emptyPlaceCheck == false)
            {
                if(data[i] == 0)
                {
                    data[i] = n;
                    emptyPlaceCheck = true;
                }
                else
                {
                    i++;
                }
            }
        }
        size += 1;
    }

    public boolean remove(int n)
    {
        boolean nisPresent;

        if(data[n] != 0)
        {
            nisPresent = true;
        }
        else
        {
            nisPresent = false;
        }
        if(nisPresent)
        {
            int[] tempArray = new int[data.length-1];
            data[n] = -1000;
            for(int i = 0; i < data.length - 1; i++)
            {
                if(tempArray[i] != -1000)
                {
                    tempArray[i] = data[i];
                }
            }
            data = tempArray.clone();
            size -= 1;
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public String toString() // Name of a built-in method :/
    {
        String tempString = new String();
        for(int i = 0; i < size; i++)
        {
            tempString += data[i] + " ";
        }
        return tempString;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int indexOf(int n)
    {
        int index = -1;
        for(int i = 0; i < data.length; i++)
        {
            if (data[i] == n)
            {
                index = i;
            }
        }

        return index;
    }
}
