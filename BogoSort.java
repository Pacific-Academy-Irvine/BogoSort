import java.util.Random;

public class BogoSort
{
    public static void bogoSort(int[][] arr)
    {
        int count = 0;
        Random rand = new Random();
        while(!isSorted(arr))
        {
            for(int i = 0; i < 10; i++)
            {
                int r1 = rand.nextInt(arr.length);
                int c1 = rand.nextInt(arr[r1].length);
                int r2 = rand.nextInt(arr.length);
                int c2 = rand.nextInt(arr[r1].length);
                
                int temp = arr[r1][c1];
                arr[r1][c1] = arr[r2][c2];
                arr[r2][c2] = temp;
                
            }
            count++;
            System.out.println();
            System.out.println("Attempt: " + count);
            print(arr);
        }
    }
    
    public static boolean isSorted(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(!isSorted(arr[i]))
            {
                return false;
            }
            
            if(i > 0 && arr[i-1][arr[i-1].length-1] > arr[i][0])
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isSorted(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    
    public static void print(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
