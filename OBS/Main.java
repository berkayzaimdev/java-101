package OBS;

public class Main
{
    public static void main(String[] args)
    {
        Ogretmen o1 = new Ogretmen("Ayşe", "12345", "PYT");
        Ogretmen o2 = new Ogretmen("Emre", "67890", "JAVA");
        Ogretmen o3 = new Ogretmen("Bahar", "99999", "MAT");

        Ders pyt = new Ders("Python", "101", "PYT");
        pyt.ogretmenEkle(o1);

        Ders java = new Ders( "Java", "102", "JAVA");
        java.ogretmenEkle(o2);

        Ders mat = new Ders( "Matematik", "103", "MAT");
        mat.ogretmenEkle(o3);

        mat.ogretmenEkle(o1);
        java.ogretmenYazdir();

        Ogrenci s1=  new Ogrenci("Berkay",4,"123",pyt,java,mat);
        s1.notEkle(70,100,25,75,80,30,95,100,50);
        s1.gectiMiHesaplama();

        Ogrenci s2=  new Ogrenci("Murat",4,"1234",pyt,java,mat);
        s2.notEkle(90,85,35,90,75,25,90,90,40);
        s2.gectiMiHesaplama();

        Ogrenci s3=  new Ogrenci("Deneme",0,"000",pyt,java,mat);
        s3.notEkle(1,1,1,1,1,1,1,1,1);
        s3.gectiMiHesaplama();
    }
}
