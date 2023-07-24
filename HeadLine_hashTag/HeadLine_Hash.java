package HeadLine_hashTag;
import java.util.*;
public class HeadLine_Hash {

    static int maximum(String wr[])
    {
        int max=wr[0].length();
        for(int i=1;i<wr.length;i++)
        {
            if(max<wr[i].length())
            {
                max=wr[i].length();
                
            }
        }

        return max;
    }

    static void HeadLine_Hash(String wr[])
    {
        int max=maximum(wr);
        //System.out.println(max);
        int in=3;
        while(in!=0)
        {

            for(int i=0;i<wr.length;i++)
            {
                if(wr[i].length()==max)
                {
                    System.out.print("#"+wr[i].toLowerCase()+" ");
                    break;
                }
                
            }
            max-=1;
            in--;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String wr[]=word.split(" ");
        System.out.println(Arrays.toString(wr));
        HeadLine_Hash(wr);
    }
}
