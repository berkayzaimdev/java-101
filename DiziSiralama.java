import java.util.Scanner;
import java.util.Arrays;

public class DiziSiralama
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Dizinin boyutu n : ");
        int n=s.nextInt(),dizi[] = new int[n],temp;
        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i=0;i<n;i++)
        {
            System.out.println(i+1+". Elemanı : ");
            dizi[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(dizi));
        for(int i=0;i<n;i++)
            for(int j=1;j<n;j++)
                if(dizi[j]<dizi[j-1])
                {
                    temp=dizi[j-1];
                    dizi[j-1]=dizi[j];
                    dizi[j]=temp;
                }
        System.out.println(Arrays.toString(dizi));
    }
}
