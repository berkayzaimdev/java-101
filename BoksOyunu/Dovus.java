package BoksOyunu;

import java.util.Random;

public class Dovus
{
    Dovuscu d1;
    Dovuscu d2;
    int minAgirlik;
    int maxAgirlik;

    public Dovus(Dovuscu d1, Dovuscu d2, int minAgirlik, int maxAgirlik) {
        this.d1 = d1;
        this.d2 = d2;
        this.minAgirlik = minAgirlik;
        this.maxAgirlik = maxAgirlik;
    }

    public void basla() {

        if (agirlikKontrol()) {
            while (d1.hp > 0 && d2.hp > 0)
            {
                System.out.println("======== YENİ ROUND ===========");
                if(vuran())
                {
                    System.out.println("Raunda başlayan dövüşçü:"+d1.isim);
                    d2.hp = d1.vur(d2);
                    if (kazandiMi())
                        break;
                    d1.hp = d2.vur(d1);
                    if (kazandiMi())
                        break;
                    skor();
                }
                else
                {
                    System.out.println("Raunda başlayan dövüşçü:"+d2.isim);
                    d1.hp = d2.vur(d1);
                    if (kazandiMi())
                        break;
                    d2.hp = d1.vur(d2);
                    if (kazandiMi())
                        break;
                    skor();
                }
            }

        }
        else
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
    }

    public boolean agirlikKontrol() {
        return (d1.agirlik >= minAgirlik && d1.agirlik <= maxAgirlik) && (d2.agirlik >= minAgirlik && d2.agirlik <= maxAgirlik);
    }
    public boolean kazandiMi() {
        if (d1.hp == 0)
        {
            System.out.println("Maçı Kazanan : " + d2.isim);
            return true;
        }
        else if (d2.hp == 0)
        {
            System.out.println("Maçı Kazanan : " + d1.isim);
            return true;
        }
        return false;
    }
    public void skor()
    {
        System.out.println("------------");
        System.out.println(d1.isim + " Kalan Can \t:" + d1.hp);
        System.out.println(d2.isim + " Kalan Can \t:" + d2.hp);
    }

    public boolean vuran()
    {
        Random r = new Random();
        return r.nextBoolean();
    }
}