import java.util.Scanner;

public class VucutKitleEndeksiHesaplama
{
    public static void main(String[] args)
    {
        double boy,kilo,vki;
        Scanner s = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu(metre cinsinden) giriniz:");
        boy = s.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz:");
        kilo = s.nextDouble();

        vki=kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz:"+vki);
    }
}
