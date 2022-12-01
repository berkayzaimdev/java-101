import java.util.*;

public class DiziFrekans
{
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int[] control = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            arr[i]=r.nextInt(11);
        System.out.println(Arrays.toString(arr));
        int c,kontrol=0;
        for (int i = 0; i < arr.length; i++)
        {
                c = 1;
                for (int j = 0; j < arr.length; j++)
                    if (arr[i] == arr[j] && i != j)
                        c++;
                if (varMi(arr[i], control))
                {
                    System.out.println(arr[i] + " sayısı " + c + " kere tekrar edildi.");
                    control[kontrol++] = arr[i];
                }
        }
    }
    static boolean varMi(int value, int[] control)
    {
        for(int i : control)
            if (i == value)
                return false;
        return true;
    }
}
