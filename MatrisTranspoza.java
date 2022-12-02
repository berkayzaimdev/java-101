import java.util.Scanner;
import java.util.Random;

public class MatrisTranspoza
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Satır sayısı:");
        int satir=s.nextInt();
        System.out.println("Sütun sayısı:");
        int sutun=s.nextInt();
        int[][] dizi = new int[satir][sutun];
        int[][] tdizi = new int[sutun][satir];
        System.out.println("Matris:");
        for(int i=0;i<satir;i++)
        {
            for(int j=0;j<sutun;j++)
            {
                dizi[i][j]=r.nextInt(0,10);
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nTranspozası:");
        for(int i=0;i<sutun;i++)
        {
            for(int j=0;j<satir;j++)
            {
                tdizi[i][j]=dizi[j][i];
                System.out.print(tdizi[i][j]+" ");
            }
            System.out.println();
        }
    }
}
