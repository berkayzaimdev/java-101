import java.util.*;

public class TekrarEdenSayi
{
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int[] control = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=r.nextInt(11);
            control[i]=1;//Kontrol dizisinin sıfırlar ile dolu olmaması için 1 atadık
        }
        System.out.println(Arrays.toString(arr));
        int c,kontrol=0;
        for (int i = 0; i < arr.length; i++)
            if(arr[i]%2==0)
            {
                c = 1;
                for (int j = 0; j < arr.length; j++)
                    if (arr[i] == arr[j] && i != j)
                        c++;
                if (varMi(arr[i], control))
                {
                    System.out.println(arr[i] + " sayısı dizide " + c + " kere tekrar etti.");
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