package OBS;

public class Ders
{
    Ogretmen dersOgretmen;
    String dersadi;
    String derskodu;
    String bolum;
    int sinav,quiz,quizoran;

    public Ders(String dersadi, String derskodu, String bolum) {
        this.dersadi = dersadi;
        this.derskodu = derskodu;
        this.bolum = bolum;
        this.sinav = 0;
        this.quiz=0;
        this.quizoran=0;
    }

    public void ogretmenEkle(Ogretmen t)
    {
        if (this.bolum.equals(t.bolum)) {
            this.dersOgretmen = t;
            System.out.println("Derse başarıyla öğretmen atandı.");
        } else {
            System.out.println(t.isim + " isimli öğretmen bu dersi veremez!");
        }
    }

    public void ogretmenYazdir()
    {
        if (dersOgretmen != null)
        {
            System.out.println(this.dersadi + " dersinin öğretmeni : " + dersOgretmen.isim);
        } else
        {
            System.out.println(this.dersadi + " dersine öğretmen atanmamıştır.");
        }
    }
}