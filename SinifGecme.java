import java.util.Scanner;

public class SinifGecme
{
    public static void main(String[] args)
    {
        int mat,fizik,kimya,turkce,muzik;
        Scanner s = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat=s.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=s.nextInt();

        System.out.println("Kimya notunuz:");
        kimya=s.nextInt();

        System.out.println("Türkçe notunuz:");
        turkce=s.nextInt();


        System.out.println("Müzik notunuz:");
        muzik=s.nextInt();

        double ort=0;
        int count=5;
        if(mat<0||mat>100)
            count--;
        else
            ort+=mat;
        if(fizik<0||fizik>100)
            count--;
        else
            ort+=fizik;
        if(kimya<0||kimya>100)
            count--;
        else
            ort+=kimya;
        if(turkce<0||turkce>100)
            count--;
        else
            ort+=turkce;
        if(muzik<0||muzik>100)
            count--;
        else
            ort+=muzik;
        ort/=count;
        System.out.println("Ortalama:"+ort);
        System.out.println(ort>=55.0?"Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
