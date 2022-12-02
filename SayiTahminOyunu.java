import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunu
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int sayi=r.nextInt(1,100);
        int hak=5;
        int tahmin;
        int[] yanlislar = new int[hak];
        boolean yanlisMi=false,kazandiMi=false;
        while(hak>0)
        {
            System.out.println("Tahmin:");
            tahmin=s.nextInt();
            if(tahmin<1 || tahmin>99)
            {
                System.out.println("Lütfen 0-100 aralığında bir sayı tahmin edin.");
                if(yanlisMi)
                    System.out.println("Kalan hakkınız:"+--hak);
                else
                {
                    yanlisMi=true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınızdan düşülecektir.");
                }
            }
            else
            {
                if(tahmin==sayi)
                {
                    kazandiMi=true;
                    System.out.println("Tebrikler. Oyunu kazandınız!");
                    break;
                }
                else
                {
                    if(sayi>tahmin)
                        System.out.println("Girdiğiniz sayı gizli sayıdan küçük.");
                    else
                        System.out.println("Girdiğiniz sayı gizli sayıdan büyük.");
                    yanlislar[5-(hak--)]=tahmin;
                    System.out.println("Kalan hakkınız:"+hak);
                }
            }
        }
        if(!kazandiMi)
        {
            System.out.println("\n\nHakkınız tükendi ve oyunu kaybettiniz.");
            if(!yanlisMi)
            {
                System.out.print("Yaptığınız tahminler:");
                for (int i : yanlislar)
                    if (i != 0)
                        System.out.print(i + " ");
            }
            System.out.println("\nAranan sayı: "+sayi);
        }
    }
}
