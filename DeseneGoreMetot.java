import java.util.Scanner;

public class DeseneGoreMetot
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("N Sayısı:");
        int sayi=s.nextInt();
        desen(sayi,sayi,false);
    }
    static void desen(int sayi,int temp,boolean kontrol)
    {
        System.out.print(sayi+" ");
        if((sayi==temp)&&kontrol)//artış eğilimindeyken döngü bitmeli
            return;
        if(sayi<=0||kontrol)
            desen(sayi+5,temp,true);//Sayı<=0 olduktan sonra artış eğilimine geçecek
        else
            desen(sayi-5,temp,false);
    }
}
