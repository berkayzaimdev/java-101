import java.util.*;

public class DiziHarmonikOrtalama
{
    public static void main(String[] args)
    {
        int[] sayilar = new int[10];
        double sum = 0;
        Random r = new Random();
        for (int i = 0; i < sayilar.length; i++)
        {
            sayilar[i] = r.nextInt(1,20);
            sum+=1/(float)sayilar[i];
        }
        System.out.println("Dizi = "+Arrays.toString(sayilar));
        System.out.println("Dizinin Harmonik Ortalaması = "+sayilar.length/sum);
    }
}
