import java.util.Scanner;

public class UcVeDordeBolunebilme
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi = s.nextInt(),count=0;
        double ort=0;
        for(int i=1;i<=sayi;i++)
        {
            if(i%3==0&&i%4==0)
            {
                ort += i;
                count++;
                System.out.println("3'e ve 4'e tam bölünebilen "+count+".sayı = "+i);
            }
        }
        System.out.println("Sayıların ortalaması="+ort/count);
    }
}
