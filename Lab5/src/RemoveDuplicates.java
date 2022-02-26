import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        int[] array1 = new int[7];
        array1[0] = 10;
        array1[1] = 10;
        array1[2] = 9;
        array1[3] = 8;
        array1[4] = 9;
        array1[5] = 5;
        array1[6] = 3;

        int runtime = removed(array1);

        //Not sure how else the array was supposed to be checked
        for (int i=0; i < runtime - 1; i++)
            System.out.print(array1[i] +" ");
    }
    public static int removed(int[] mainArray)
    {
        Arrays.sort(mainArray);
        int uniqueIndex = 0;
        int endNum = mainArray.length;

        for (int i = 0; i < endNum - 1; i++) {
            if (mainArray[i] != mainArray[i + 1]) {
                mainArray[uniqueIndex] = mainArray[i];
                uniqueIndex += 1;
            }
        }

        uniqueIndex += 1;
        mainArray[uniqueIndex] = mainArray[endNum - 1];

        return uniqueIndex;
    }
}
