import java.util.Scanner;

public class DordunKatlariToplami
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int toplam=0,sayi;
        do
        {
            System.out.println("Sayı giriniz:");
            sayi=s.nextInt();
            if(sayi%2==0&&sayi%4==0)
                toplam+=sayi;
        }
        while(sayi%2!=1);
        System.out.println("Toplam:"+toplam);
    }
}
