import java.util.Scanner;

public class HipotenusHesaplama
{
    public static void main(String[] args)
    {
/*
รรง๐๐๐๐๐ รง๐๐ฃ๐๐๐ ๐ = 2๐ข

๐ข = (a+b+c) / 2

Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)
*/
        Scanner s = new Scanner(System.in);

        System.out.println("1.Kenar uzunluฤunu giriniz:");
        int k1=s.nextInt();

        System.out.println("2.Kenar uzunluฤunu giriniz:");
        int k2=s.nextInt();

        double hipo = Math.sqrt((k1*k1)+(k2*k2));
        System.out.println("Hipotenรผs:"+hipo);

        double u = (k1+k2+hipo)/2;
        double alan=Math.sqrt(u*(u-k1)*(u-k2)*(u-hipo));
        System.out.println("รรงgenin alanฤฑ:"+alan);
    }
}
