import java.util.Scanner;

public class AtmProjesi
{
    public static void main(String[] args)
    {
        String kullanici, sifre;
        Scanner s = new Scanner(System.in);
        int hak = 3;
        int kalan = 1500;
        int secim,tutar;
        while (hak > 0)
        {
            System.out.print("Kullanıcı Adınız :");
            kullanici = s.nextLine();
            System.out.print("Parolanız:");
            sifre = s.nextLine();

            if (kullanici.equals("patika") && sifre.equals("dev123"))
            {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do
                {
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    secim = s.nextInt();
                    switch(secim)
                    {
                        case 1:
                            System.out.print("Para miktarı : ");
                            tutar = s.nextInt();
                            kalan += tutar;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            tutar = s.nextInt();
                            if (tutar > kalan)
                                System.out.println("Bakiye yetersiz.");
                            else
                                kalan -= tutar;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + kalan);
                            break;
                    }
                }while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            else
            {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (hak == 0)
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                else
                    System.out.println("Kalan Hakkınız:"+hak);
            }
        }
    }
}