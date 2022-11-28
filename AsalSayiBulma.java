public class AsalSayiBulma
{
    public static void main(String[] args)
    {
        boolean asalmi;
        for(int i=2;i<100;i++)
        {
            asalmi=true;
            for(int j=2;j<i;j++)
                if(i%j==0)
                {
                    asalmi=false;
                    break;
                }
            if(asalmi)
                System.out.print(i+" ");
        }
    }
}
