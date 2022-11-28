import java.util.Scanner;

public class MukemmelSayiBulma
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int sum;
        System.out.println("Döngüyü sonlandırmak için '0' giriniz.");
        while(true)
        {
            System.out.println("Bir sayı giriniz.");
            int sayi=s.nextInt();
            if(sayi<0)
                System.out.println("Lütfen bir pozitif sayı giriniz.");
            else if(sayi==0)
                break;
            else
            {
                sum=0;
                for(int i=sayi-1;i>=1;i--)
                    if(sayi%i==0)
                        sum+=i;
                if(sum==sayi)
                    System.out.println(sayi+" mükemmel sayıdır.");
                else
                    System.out.println(sayi+" mükemmel sayı değildir.");

            }
        }
        System.out.println("Döngü sonlandı.");
    }
}
