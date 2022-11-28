import java.util.Scanner;

public class TersUcgenYapimi
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Basamak sayısı:");
        int b=s.nextInt();
        for(int i=b;i>0;i--)
        {
            for(int k=0;k<(b-i);k++)
                System.out.print(" ");
            for(int j=2*i-1;j>0;j--)
                System.out.print("*");
            System.out.println("");
        }
    }
}
