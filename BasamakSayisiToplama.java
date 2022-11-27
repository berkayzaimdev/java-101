import java.util.Scanner;

public class BasamakSayisiToplama
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi=s.nextInt();
        int basamaksayisi=0,toplam=0,tempsayi=sayi;
        while(tempsayi!=0)
        {
            tempsayi/=10;
            basamaksayisi++;
        }
        tempsayi=sayi;
        for(int i=0;i<basamaksayisi;i++)
        {
            toplam+=tempsayi%10;
            tempsayi/=10;
        }
        System.out.println(sayi+" sayısının basamakları toplamı="+toplam);
    }
}
