import java.util.Scanner;

public class KullaniciGirisi
{
    public static void main(String[] args)
    {
        String kullaniciadi,sifre;
        Scanner s = new Scanner(System.in);

        System.out.println("Kullanıcı adınız:");
        kullaniciadi = s.nextLine();

        System.out.println("Şifreniz:");
        sifre = s.nextLine();

        if(kullaniciadi.equals("patika") && sifre.equals("java123"))
        {
            System.out.println("Giriş yaptınız !");
        }
        else if(!sifre.equals("java123"))
        {
            System.out.println("Şifrenizi yanlış girdiniz.\nŞifrenizi sıfırlamak istiyor musunuz? E/H");
            String secim = s.nextLine();
            if(secim.equals("E"))
            {
                System.out.println("Yeni şifrenizi giriniz:");
                String yenisifre = s.nextLine();
                if(yenisifre.equals(sifre)||yenisifre.equals("java123"))
                {
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                }
                else
                    System.out.println("Şifre oluşturuldu.");
            }
            else if(secim.equals("H"))
            {
                System.out.println("Şifreniz değişmedi.");
            }
            else
                System.out.println("Geçersiz değer girdiniz. Giriş başarısız.");
        }
        else
            System.out.println("Giriş başarısız.");
    }
}
