import java.util.Arrays;
import java.util.Scanner;

public class unique_char {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        String one=s.nextLine();
        String two=s.nextLine();
        String tot=one+two;
        tot=tot.toUpperCase();
        int t[]=new int[90];
        for(int i=0;i<90;i++)
        {
            t[i]=0;
        }
        
        for(int j=0;j<tot.length();j++)
        {
            
            
        for(int i=65;i<90;i++)
        {
            if((int)tot.charAt(j)==i)
            {
                
                if(t[(int)tot.charAt(j)]==0)
                {
                    t[i]=1;
                }
                else{
                    break;
                }
            }
        }
    }
    int ti=0;
    for(int i=65;i<90;i++)
    {
        ti+=t[i];

    }
    System.out.println(ti);


    }
    
}
