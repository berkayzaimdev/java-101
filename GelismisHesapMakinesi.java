import java.util.Scanner;

public class GelismisHesapMakinesi
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int secim;
        do
        {
            System.out.print("1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                    "0- Çıkış Yap\n" +
                    "Seçiniz : ");
            secim = s.nextInt();
            switch (secim) {
                case 1:
                    toplam();
                    break;
                case 2:
                    fark();
                    break;
                case 3:
                    carpim();
                    break;
                case 4:
                    bolum();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dortgen();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz. Lütfen tekrar deneyiniz.");
            }
        } while (secim != 0);

    }

    static void toplam()
    {
        Scanner s = new Scanner(System.in);
        int sayi, sum = 0;
        do {
            System.out.print("Sayı giriniz : ");
            sayi=s.nextInt();
            sum+=sayi;
        }while(sayi != 0);
        System.out.println("Sonuç:" +sum);
    }

    static void fark()
    {
        Scanner s = new Scanner(System.in);
        int sayi,sum=0;
        do
        {
            System.out.print("Sayı giriniz : ");
            sayi=s.nextInt();
            if (sum!=0)
                sum-=sayi;
            else
                sum=sayi;
        }while (sayi != 0);
        System.out.println("Sonuç:" + sum);
    }

    static void carpim()
    {
        Scanner input = new Scanner(System.in);
        int number, total = 1;
        do {
            System.out.print("Sayı giriniz : ");
            number = input.nextInt();

            total *= number;

        } while (number != 1);
        System.out.println("Sonuç : " + total);
    }

    static void bolum()
    {
        Scanner s = new Scanner(System.in);
        double sonuc = 0,sayi;
        System.out.println("Kaç tane sayı girmek istiyorsunuz?:");
        int c=s.nextInt();
        for(int i=1;i<=c;i++)
        {
            System.out.println(i+".sayıyı giriniz:");
            sayi=s.nextDouble();
            if(i!=1&&sayi==0)
            {
                System.out.println("Sayı sıfıra bölünemez!");
                continue;
            }
            if(i==1)
            {
                sonuc=sayi;
                continue;
            }
            sonuc/=sayi;
        }
        System.out.println("Sonuç:"+sonuc);
    }

    static void us()
    {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.print("Üssü alınacak sayı:");
        a = s.nextInt();

        System.out.print("Üs olacak sayı:");
        b = s.nextInt();
        System.out.println(a+"^"+b+"="+Math.pow(a, b));
    }

    static void faktoriyel()
    {
        Scanner s = new Scanner(System.in);
        int sayi, f = 1;
        System.out.print("Faktoriyeli alınacak sayı : ");
        sayi = s.nextInt();
        for (int i = 1; i <= sayi && sayi > 0; i++) {
            sayi *= i;
        }

        System.out.println(sayi+"!="+f);
    }

    static void mod()
    {
        Scanner s = new Scanner(System.in);
        int sayi, mod;
        System.out.print("Modu alınacak sayı:");
        sayi = s.nextInt();

        System.out.print("Mod:");
        mod = s.nextInt();

        System.out.println(sayi+"%"+mod+"="+(sayi%mod));
    }

    static void dortgen()
    {
        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.print("Dikdörtgenin kısa kenarı:");
        a = s.nextInt();

        System.out.print("Dikdörtgenin uzun kenarı:");
        b = s.nextInt();

        System.out.println("Çevre:"+(2*(a+b)));
        System.out.println("Alan:"+a*b);
    }
}