import java.util.Scanner;
import java.util.Random;

public class BogoSortRunner
{
    private static int[][] nums = {{2, 3, 5, 6},
                                   {7, 1, 23, 6}};
    
    public static void main(String[] args)
    {
        BogoSort.bogoSort(nums);
    }
}
