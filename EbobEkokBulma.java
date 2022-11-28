import java.util.Scanner;

public class EbobEkokBulma
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("EBOB(x,y) ve EKOK(x,y) için sayıları giriniz.\nx:");
        int x=s.nextInt();
        System.out.println("y:");
        int y=s.nextInt();
        int i=1,ebob=i;
        while(i<x||i<y)
        {
            if((x%i==0)&&(y%i==0))
                ebob=i;
            i++;
        }
        System.out.println("EBOB("+x+","+y+")="+ebob);
        int ekok=(x*y)/ebob;
        System.out.println("EKOK("+x+","+y+")="+ekok);
    }
}
