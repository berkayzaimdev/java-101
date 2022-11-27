import java.util.Scanner;

public class ArtikYilHesaplama
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Yıl giriniz:");
        int yil=s.nextInt();
        System.out.print(yil+" ");
        if(yil%4==0)
        {
            if(yil%100==0)
                if(yil%400==0)
                    System.out.println("bir artık yıldır.");
                else
                    System.out.println("bir artık yıl değildir.");
            else
                System.out.println("bir artık yıldır.");
        }
        else
            System.out.println("bir artık yıl değildir.");
    }
}
