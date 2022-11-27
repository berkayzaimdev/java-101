import java.util.Scanner;

public class KdvHesaplama
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double tutar;

        System.out.println("Lütfen ücret tutarını giriniz:");
        tutar=s.nextDouble();

        double kdvoran = tutar > 1000 ? 0.08 : 0.18;

        double kdvTutar = tutar * kdvoran;

        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'li tutar:"+kdvliTutar);
    }
}
