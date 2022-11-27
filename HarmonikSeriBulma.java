import java.util.Scanner;

public class HarmonikSeriBulma
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi=s.nextInt();
        double toplam=0;
        for(double i=1;i<=sayi;i++)
            toplam+=(1/i);
        System.out.println("Sonuç:"+toplam);
    }
}
