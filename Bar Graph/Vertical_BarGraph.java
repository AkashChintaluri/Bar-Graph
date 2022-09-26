import java.util.Scanner;
public class Vertical_BarGraph
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int x = sc.nextInt();
        String sub[] = new String[x];
        int marks[] = new int[x];
        for(int i = 0; i<x; i++)
        {
            System.out.println("Enter the subject");
            sub[i] = sc.next();
            System.out.println("Enter the marks obtained in "+sub[i]);
            marks[i] = sc.nextInt();
            sub[i] = sub[i].toUpperCase();
            sub[i] = sub[i].substring(0,3);
        }
        char box = (char)9608;
        System.out.println("\f");
        System.out.println("\t\t\t\t\t Bar Graph \n");
        for(int i = 101; i >= 0; i--)
        {
            System.out.print("\t");
            for(int j= 0; j<x; j++)
            {
                if(i-1==marks[j])
                    System.out.print("\t"+marks[j]);
                else if(i<=marks[j])
                    System.out.print("\t"+box);
                else
                    System.out.print("\t ");
            }
            System.out.println();
        }
        for(int i = 0; i<=x*28; i++)
        {
            System.out.print((char)9602);
        }
        System.out.println();
        System.out.print("\t");
        for(int i = 0; i<x; i++)
        {
            System.out.print("\t"+sub[i]);
        }
    }
}
