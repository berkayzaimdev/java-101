package BoksOyunu;

public class Dovuscu
{
    String isim;
    int hasar;
    int hp;
    int agirlik;
    double kac;

    public Dovuscu(String isim, int hasar, int hp, int agirlik, double kac) {
        this.isim = isim;
        this.hasar = hasar;
        this.hp = hp;
        this.agirlik = agirlik;
        this.kac = kac;
    }

    public int vur(Dovuscu dovuscu) {
        System.out.println("------------");
        System.out.println(this.isim + " => " + dovuscu.isim + " " +  this.hasar + " hasar vurdu.");
        if (dovuscu.dodge())
        {
            System.out.println(dovuscu.isim + " gelen hasardan kaçındı.");
            return dovuscu.hp;
        }

        if (dovuscu.hp - this.hasar < 0)
            return 0;
        return dovuscu.hp - this.hasar;
    }
    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.kac;
    }
}
