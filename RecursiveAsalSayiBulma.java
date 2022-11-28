import java.util.Scanner;

public class RecursiveAsalSayiBulma
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi=s.nextInt();
        System.out.print(sayi+" sayısı ");
        System.out.println(asalmi(sayi,sayi-1)?"ASALDIR !":"ASAL değildir !");
    }
    static boolean asalmi(int sayi,int bolen)
    {
        if(bolen==1)
            return true;
        if(sayi%bolen==0||sayi<=1)
            return false;
        else
            return asalmi(sayi,bolen-1);
    }
}
