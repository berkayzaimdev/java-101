import java.util.Scanner;

public class DaireAlanCevreHesaplama
{
    public static void main(String[] args)
    {
        int r;
        final double PI = 3.14;
        double alan,cevre,arc;
        Scanner s = new Scanner(System.in);

        System.out.println("Yarıçap uzunluğunu girin:");
        r=s.nextInt();

        System.out.println("Daire diliminin açısını girin:");
        arc=s.nextDouble();
        arc=arc>360?arc-360:arc;

        cevre=2*r*PI;
        alan=r*r*PI;
        System.out.println("Yarıçapı "+r+" olan dairenin alanı:"+alan+"\nÇevresi:"+cevre);

        alan*=arc/360;
        System.out.println("\nYarıçapı "+r+" ve merkez açısı "+arc+" olan daire diliminin alanı:"+alan);
    }
}
