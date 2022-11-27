import java.util.Scanner;

public class NotOrtalamasiHesaplama
{
    public static void main(String[] args)
    {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner s = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat=s.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=s.nextInt();

        System.out.println("Kimya notunuz:");
        kimya=s.nextInt();

        System.out.println("Türkçe notunuz:");
        turkce=s.nextInt();

        System.out.println("Tarih notunuz:");
        tarih=s.nextInt();

        System.out.println("Müzik notunuz:");
        muzik=s.nextInt();

        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalama:"+ort);
        System.out.println(ort>60.0?"Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
