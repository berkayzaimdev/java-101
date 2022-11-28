import java.util.Scanner;

public class FibonacciSerisi
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Fibonacci serisi için eleman sayısı girin:");
        int e=s.nextInt();
        int s1=1,s2=0,temp;
        for(int i=0;i<e;i++)
        {
            System.out.print(s2+" ");
            temp=s2;
            s2=s1+s2;
            s1=temp;
        }
    }
}
