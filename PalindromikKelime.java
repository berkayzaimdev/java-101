import java.util.Scanner;

public class PalindromikKelime
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Lütfen kontrol etmek istediğiniz kelimeyi girin:");
        String k=s.nextLine();
        System.out.println(palindromMu(k)
                ?"Seçtiğiniz kelime palindromdur."
                :"Seçtiğiniz kelime palindrom değildir.");
    }
    static boolean palindromMu(String k)
    {
        String ters=ters(k);
        for(int i=0;i<k.length();i++)
        {
            if(k.charAt(i)!=ters.charAt(i))
                return false;
        }
        return true;
    }
    static String ters(String k)
    {
        String ters="";
        for(int i=k.length()-1;i>=0;i--)
        {
            ters+=k.charAt(i);
        }
        System.out.println(ters);
        return ters;
    }
}