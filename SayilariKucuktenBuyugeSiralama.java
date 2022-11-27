import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama
{
    public static void main(String[] args)
    {
        int n1,n2,n3;
        Scanner s=new Scanner(System.in);

        System.out.println("1.Sayı:");
        n1=s.nextInt();

        System.out.println("2.Sayı:");
        n2=s.nextInt();

        System.out.println("3.Sayı:");
        n3=s.nextInt();

        if(n1<n2 && n1<n3)
        {
            if(n2<n3)
                System.out.println("n1 < n2 < n3");
            else
                System.out.println("n1 < n3 < n2");
        }
        else if(n2<n1 && n2<n3)
        {
            if(n1<n3)
                System.out.println("n2 < n1 < n3");
            else
                System.out.println("n2 < n3 < n1");
        }
        if(n3<n1 && n3<n2)
        {
            if(n1<n2)
                System.out.println("n3 < n1 < n2");
            else
                System.out.println("n3 < n2 < n1");
        }
    }
}
