import java.util.Scanner;

public class HipotenusHesaplama
{
    public static void main(String[] args)
    {
/*
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
        Scanner s = new Scanner(System.in);

        System.out.println("1.Kenar uzunluğunu giriniz:");
        int k1=s.nextInt();

        System.out.println("2.Kenar uzunluğunu giriniz:");
        int k2=s.nextInt();

        double hipo = Math.sqrt((k1*k1)+(k2*k2));
        System.out.println("Hipotenüs:"+hipo);
    }
}
