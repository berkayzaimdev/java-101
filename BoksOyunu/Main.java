package BoksOyunu;

public class Main
{
    public static void main(String[] args)
    {
        Dovuscu d1 = new Dovuscu("Mike Tyson" , 30 , 100, 90, 5);
        Dovuscu d2 = new Dovuscu("Muhammed Ali" , 10 , 120, 100, 50);
        Dovus d = new Dovus(d1,d2 , 90 , 100);
        d.basla();
    }
}
