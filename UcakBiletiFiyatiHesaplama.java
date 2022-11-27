import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        final double kmBasi=0.1,yasindirim1=0.5,yasindirim2=0.1,yasindirim3=0.3,yolindirim1=0.2;
        double tutar=0,yasindirim=0,yolindirim=0;
        int yas,mesafe,yolculuk,carpan=1;

        System.out.println("Mesafeyi km türünden giriniz:");
        mesafe=s.nextInt();

        System.out.println("Yaşınızı giriniz:");
        yas=s.nextInt();

        System.out.println("Yolculuk tipinizi giriniz(1 -> Tek Yön, 2 -> Gidiş Dönüş):");
        yolculuk=s.nextInt();

        if(mesafe<=0||yas<=0||yolculuk>2||yolculuk<1)
        {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        else
        {
            tutar=mesafe*kmBasi;
            if(yas<12)
                yasindirim=tutar*yasindirim1;
            else if(yas>=12 && yas<=24)
                yasindirim=tutar*yasindirim2;
            else if(yas>65)
                yasindirim=tutar*yasindirim3;
            tutar-=yasindirim;
            if(yolculuk==2)
            {
                yolindirim=tutar*yolindirim1;
                carpan=2;
            }
            tutar-=yolindirim;
            System.out.println("Toplam tutar:"+tutar*carpan+" TL");
        }
    }
}
