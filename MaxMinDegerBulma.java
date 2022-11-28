import java.util.Scanner;

public class MaxMinDegerBulma
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz?:");
        int len=s.nextInt();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=1;i<=len;i++)
        {
            System.out.println(i+". Sayıyı giriniz:");
            int sayi=s.nextInt();
            if(sayi>max)
                max=sayi;
            if(sayi<min)
                min=sayi;
        }
        System.out.println("En büyük sayı:"+max+"\nEn küçük sayı:"+min);
    }
}
