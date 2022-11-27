import java.util.Scanner;

public class UsHesaplama
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        int sayi=s.nextInt();
        System.out.println("Üs olacak sayı:");
        int us=s.nextInt();
        int sonuc=1;
        for(int i=0;i<us;i++)
        {
            sonuc*=sayi;
        }
        System.out.println(sayi+"^"+us+"="+sonuc);
    }
}
