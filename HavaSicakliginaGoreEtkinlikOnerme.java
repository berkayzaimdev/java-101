import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme
{
    public static void main(String[] args)
    {
        int hava;
        Scanner s = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz:");
        hava=s.nextInt();
        System.out.println(hava<5?"Kayak yapabilirsiniz.":hava<15?"Sinemaya gidebilirsiniz.":hava<25?"Piknik yapabilirsiniz.":"Yüzmeye gidebilirsiniz.");

        /*
        if(hava<5)
            System.out.println("Kayak yapabilirsiniz.");

        else if(hava>=5 && hava<15)
            System.out.println("Sinemaya gidebilirsiniz.");

        else if(hava>=15 && hava<25)
            System.out.println("Piknik yapabilirsiniz.");

        else
            System.out.println("Yüzmeye gidebilirsiniz.");
        */
    }
}
