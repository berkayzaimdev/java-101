import java.util.Scanner;

public class TaksimetreHesaplama
{
    public static void main(String[] args)
    {
        int km;
        double kmBasi=2.2,ucret=10;
        Scanner s = new Scanner(System.in);

        System.out.println("Mesafeyi Km cinsinden giriniz:");
        km=s.nextInt();

        ucret+=km*kmBasi;
        ucret=ucret>=20?ucret:20;
        System.out.println("Ücret:"+ucret);
    }
}
