import java.util.Scanner;

public class YildizlarlaElmasYapma
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = s.nextInt();

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = (n - i); j >= 0; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i + 1); k++)
                System.out.print("*");
            System.out.println("");
        }

        int m = 2 * n - 1;

        for (int i = 0; i < n; i++)
        {
            for (int k = 0; k <= i + 1; k++)
                System.out.print(" ");
            for (int j = m; j >= 1; j--)
                System.out.print("*");
            System.out.println("");
            m-=2;
        }
    }
}
