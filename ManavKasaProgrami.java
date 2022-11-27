import java.util.Scanner;

public class ManavKasaProgrami
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        final double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double tutar=0;
        int sayi;

        System.out.println("Armut kaç kilo? :");
        sayi=s.nextInt();
        tutar+=sayi*armut;

        System.out.println("Elma kaç kilo? :");
        sayi=s.nextInt();
        tutar+=sayi*elma;

        System.out.println("Domates kaç kilo? :");
        sayi=s.nextInt();
        tutar+=sayi*domates;

        System.out.println("Muz kaç kilo? :");
        sayi=s.nextInt();
        tutar+=sayi*muz;

        System.out.println("Patlıcan kaç kilo? :");
        sayi=s.nextInt();
        tutar+=sayi*patlican;

        System.out.println("Toplam tutar:"+tutar+" TL");
    }
}
