import java.util.Scanner;

public class PalindromSayilar
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Palindrom olup olmadığını kontrol etmek istediğiniz sayıyı girin:");
        int sayi=s.nextInt();
        System.out.println(palindromMu(sayi)?"Girdiğiniz sayı palindromdur.":"Girdiğiniz sayı palindrom değildir.");
    }
    static boolean palindromMu(int sayi)
    {
        int terssayi=0,temp=sayi;
        while(temp!=0)
        {
            terssayi=terssayi*10+temp%10;
            temp/=10;
        }
        if(sayi==terssayi)
            return true;
        else
            return false;
    }
}