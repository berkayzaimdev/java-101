public class HarfYazdirma
{
    public static void main(String[] args)
    {
        String[][] harf = new String[7][4];
        for(int i=0;i<harf.length;i++)
            for(int j=0;j<harf[i].length;j++)
            {
                if (j == 0 || (j == (harf[i].length - 1))||(i%3==0))
                    harf[i][j] = "*  ";
                else
                    harf[i][j] = "   ";
            }
        for(String[] satir : harf)
        {
            for (String sutun : satir)
                System.out.print(sutun);
            System.out.println();
        }
    }
}
