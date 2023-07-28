import java.util.*;
public class Histogram {
    static void Histogram(int ar[],String sy)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i];j++)
            {
                System.out.print(sy+"");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sy=s.nextLine();
        int l=s.nextInt();
        int ar[]=new int[l];

        for(int i=0;i<l;i++)
        {
            ar[i]=s.nextInt();
        }
        
        Histogram(ar, sy);

    }
}
