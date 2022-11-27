import java.util.Scanner;

public class Kombinasyon
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonunu hesaplamak için n ve r sayılarını giriniz.\nn:");
        int n=s.nextInt();
        System.out.println("r:");
        int r=s.nextInt();
        double c=1;
        for(int i=n;i>=1;i--)
        {
            c*=i;
        }
        for(int i=r;i>=1;i--)
        {
            c/=i;
        }
        for(int i=(n-r);i>=1;i--)
        {
            c/=i;
        }
        System.out.println("C("+n+","+r+")="+c);
    }
}
