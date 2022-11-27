import java.util.Scanner;

public class UcVeDordunKuvvetleri
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int sayi;
        System.out.println("Sayı giriniz:");
        sayi=s.nextInt();
        System.out.print("Dördün kuvvetleri:");
        for(int i=1;i<=sayi;i*=4)
        {
            System.out.print(i+" ");
        }
        System.out.print("\nBeşin kuvvetleri:");
        for(int i=1;i<=sayi;i*=5)
        {
            System.out.print(i+" ");
        }
    }
}
