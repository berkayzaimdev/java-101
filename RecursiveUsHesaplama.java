import java.util.Scanner;

public class RecursiveUsHesaplama
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        int sayi=s.nextInt();
        System.out.println("Üs olacak sayı:");
        int us=s.nextInt();
        System.out.println(sayi+"^"+us+"="+usalma(sayi,us));
    }
    static int usalma(int sayi,int us)
    {
        if(us==0)
            return 1;
        else
            return sayi*usalma(sayi,--us);
    }
}
