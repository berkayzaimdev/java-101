package MayinTarlasi;
import java.util.Scanner;
import java.util.Random;

public class MineSweeper
{
    int row,col,mayinsayisi;
    char[][] arr;
    char[][] mayinlar;
    MineSweeper(int row,int col)
    {
        this.row=row;
        this.col=col;
        arr = new char[row][col];
        mayinlar = new char[row][col];
        mayinsayisi = (row*col)/4;
    }
    void mayinUret()
    {
        Random r=new Random();
        int c=0;
        do
        {
            int satir = r.nextInt(0,arr.length);
            int sutun = r.nextInt(0,arr[0].length);
            if(mayinlar[satir][sutun]!='*')//aynı sayıların gelmesi durumunda mayınlar dizisine eleman atanmayacak
            {
                mayinlar[satir][sutun]='*';
                c++;
            }
        }while(c<mayinsayisi);
        for(int i=0;i<arr.length;i++)//mayınlar dizisini ekrana yazdırır
        {
            for(int j=0;j<arr[0].length;j++)
                System.out.print(mayinlar[i][j]=='*'?"* ":"- ");
            System.out.println();
        }
    }
    void yazdir()
    {
        for(char[] sh : arr)
        {
            for(char ch : sh)
                System.out.print(ch+" ");
            System.out.println();
        }
    }
    void run()
    {
        mayinUret();
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                arr[i][j]='-';
        System.out.println("\nMayın Tarlası Oyununa Hoşgeldiniz !");
        Scanner s=new Scanner(System.in);
        int c=0;
        do
        {
            System.out.println("===========================");
            yazdir();
            System.out.print("Satır Giriniz : ");
            int x=s.nextInt();
            System.out.print("Sütun Giriniz : ");
            int y=s.nextInt();
            if (x<0||y<0||x>=arr.length||y>=arr[0].length||arr[x][y]!='-')
            {
                System.out.println("Geçersiz koordinat!");
                continue;
            }
            if(mayinlar[x][y]=='*')
            {
                arr[x][y]='*';
                break;
            }
            else
            {
                int deger = 0;
                for (int i = -1; i < 2; i++)
                    for (int j = -1; j < 2; j++)
                    {
                        if (x+i<0||y+j<0||x+i>=arr.length||y+j>=arr[0].length)
                            continue;//Dizinin alt veya üst sınırını aşıyorsa adımı atla
                        else
                        {
                            if((x==i)&&(y==j)&&(x==y))
                                continue;//Seçtiğimiz konumdaki elemana tekrar bakmaması için adımı atladık
                            else if (mayinlar[x+i][y+j] == '*')
                                deger++;
                        }
                    }
                arr[x][y]=(char)(deger+48);//ASCII koda göre sayılara 48 eklersek char karşılığını elde ederiz
            }
            c++;
        }
        while(c<(arr.length*arr[0].length)-mayinsayisi);
        System.out.println(c<(arr.length*arr[0].length)-mayinsayisi
                ?"Oyunu kaybettiniz.."
                :"Tebrikler, oyunu kazandınız!");
        yazdir();
    }
}