import java.util.Scanner;

public class CinZodyagiHesaplama
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int yil,sonuc;

        System.out.println("Doğum yılınızı giriniz:");
        yil=s.nextInt();
        sonuc=yil%12;

        if(yil<0||yil>2022)
        {
            System.out.println("Lütfen geçerli bir yıl giriniz.");
        }
        else
        {
            System.out.print("Çin zodyağı burcunuz:");
            switch(sonuc)
            {
                case 0:
                    System.out.println("Maymun");
                    break;
                case 1:
                    System.out.println("Horoz");
                    break;
                case 2:
                    System.out.println("Köpek");
                    break;
                case 3:
                    System.out.println("Domuz");
                    break;
                case 4:
                    System.out.println("Fare");
                    break;
                case 5:
                    System.out.println("Öküz");
                    break;
                case 6:
                    System.out.println("Kaplan");
                    break;
                case 7:
                    System.out.println("Tavşan");
                    break;
                case 8:
                    System.out.println("Ejderha");
                    break;
                case 9:
                    System.out.println("Yılan");
                    break;
                case 10:
                    System.out.println("At");
                    break;
                case 11:
                    System.out.println("Koyun");
                    break;
            }
        }
    }
}
