import java.util.Scanner;

public class HesapMakinesi
{
    public static void main(String[] args)
    {
        int n1,n2,secim;
        Scanner s = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz:");
        n1=s.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        n2=s.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz:");
        secim=s.nextInt();

        switch(secim)
        {
            case 1:
                System.out.println(n1+"+"+n2+" = "+(n1+n2));
                break;
            case 2:
                System.out.println(n1+"-"+n2+" = "+(n1-n2));
                break;
            case 3:
                System.out.println(n1+"*"+n2+" = "+(n1*n2));
                break;
            case 4:
                System.out.println(n1+"/"+n2+" = "+(n1/n2));
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                break;
        }
    }
}
