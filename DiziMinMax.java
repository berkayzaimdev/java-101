import java.util.*;

public class DiziMinMax
{
    public static void main(String[] args)
    {
        int[] sayilar = new int[10];
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < sayilar.length; i++)
            sayilar[i] = r.nextInt(1,20);
        System.out.println("Dizi = "+Arrays.toString(sayilar));
        System.out.println("Girilen sayı:");
        int sayi=s.nextInt();
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i : sayilar)//girilen sayıdan büyük en küçük sayı
        {
            if(i>sayi && i<max)
                max=i;
            if(i<sayi && i>min)
                min=i;
        }
        System.out.println(max==Integer.MAX_VALUE
                ?"Girdiğiniz sayıdan daha büyük bir eleman bulunamadı.."
                :"Girdiğiniz sayıdan büyük, en küçük eleman:"+max);
        System.out.println(min==Integer.MIN_VALUE
                ?"Girdiğiniz sayıdan daha küçük bir eleman bulunamadı.."
                :"Girdiğiniz sayıdan küçük, en büyük eleman:"+min);
    }
}
