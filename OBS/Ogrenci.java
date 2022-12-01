package OBS;

public class Ogrenci
{
    String isim,numara;
    int sinifi;
    Ders pyt;
    Ders java;
    Ders mat;
    double ort;
    boolean gectiMi;


    Ogrenci(String name, int sinifi, String stuNo, Ders pyt, Ders java, Ders mat) {
        this.isim = name;
        this.sinifi = sinifi;
        this.numara = numara;
        this.pyt=pyt;
        this.java=java;
        this.mat = mat;
        ortHesapla();
        this.gectiMi = false;
    }


    public void notEkle(int pytsinav,int pytquiz,int pytquizoran,int javasinav,int javaquiz,int javaquizoran,int matsinav,int matquiz,int matquizoran)
    {
        if ((pytsinav >= 0 && pytsinav <= 100)&&(pytquiz >= 0 && pytquiz <= 100))
        {
            this.pyt.sinav = pytsinav;
            this.pyt.quiz=pytquiz;
            this.pyt.quizoran=pytquizoran;
        }
        if ((javasinav >= 0 && javasinav <= 100)&&(javaquiz >= 0 && javaquiz <= 100))
        {
            this.java.sinav = javasinav;
            this.java.quiz=javaquiz;
            this.java.quizoran=javaquizoran;
        }
        if ((matsinav >= 0 && matsinav <= 100)&&(matquiz >= 0 && matquiz <= 100))
        {
            this.mat.sinav = matsinav;
            this.mat.quiz= matquiz;
            this.mat.quizoran=matquizoran;
        }
    }

    public void gectiMiHesaplama() {
        if(this.pyt.sinav == 0 || this.java.sinav == 0 || this.mat.sinav == 0|| this.pyt.quiz == 0|| this.java.quiz == 0|| this.mat.quiz == 0)
            System.out.println("Notlar tam olarak girilmemiş");
        else
        {
            this.gectiMi = gectiMiYazdir();
            notYazdir();
            System.out.println("Ortalama : " + this.ort);
            if(this.gectiMi)
                System.out.println(this.isim+" sınıfı geçti. ");
            else
                System.out.println(this.isim+" sınıfta kaldı..");
        }
    }

    public void ortHesapla()
    {
        this.ort = ((this.pyt.sinav*(100-this.pyt.quizoran)+(this.pyt.quiz*this.pyt.quizoran))
                + (this.java.sinav*(100-this.java.quizoran))+(this.java.quiz*this.java.quizoran)
                   + (this.mat.sinav*(100-this.mat.quizoran))+(this.mat.quiz*this.mat.quizoran)) / 300;
    }

    public boolean gectiMiYazdir()
    {
        ortHesapla();
        return this.ort > 55;
    }

    public void notYazdir()
    {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.isim);
        System.out.println("Python Sınav Notu : " + this.pyt.sinav);
        System.out.println("Python Quiz Notu : " + this.pyt.quiz);
        System.out.println("Python Başarı Notu : " + ((this.pyt.sinav*(100-this.pyt.quizoran)/100)+(this.pyt.quiz*this.pyt.quizoran/100)));
        System.out.println("Java Sınav Notu : " + this.java.sinav);
        System.out.println("Java Quiz Notu : " + this.java.quiz);
        System.out.println("Java Başarı Notu : " + ((this.java.sinav*(100-this.java.quizoran)/100)+(this.java.quiz*this.java.quizoran/100)));
        System.out.println("Matematik Sınav Notu : " + this.mat.sinav);
        System.out.println("Matematik Quiz Notu : " + this.mat.quiz);
        System.out.println("Matematik Başarı Notu : " + ((this.mat.sinav*(100-this.mat.quizoran)/100)+(this.mat.quiz*this.mat.quizoran/100)));
    }

}
