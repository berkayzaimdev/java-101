package MaasHesaplayici;

public class Main
{
    public static void main(String[] args)
    {
        Employee p1 = new Employee("Kemal", 2000, 45, 1985);
        System.out.println(p1.toString());
        Employee p2 = new Employee("Berkay", 3500, 35, 2011);
        System.out.println(p2.toString());
        Employee p3 = new Employee("Deneme", 2000, 15, 2016);
        System.out.println(p3.toString());
    }
}
