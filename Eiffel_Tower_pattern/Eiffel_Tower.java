package Eiffel_Tower_pattern;

import java.util.*;
class Eiffel_Tower {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int si=s.nextInt();
        int odd=3;
        for(int i=1;i<=si;i++)
        {
            for(int j=i;j<=4;j++)
            {
                
                
                if(i>=2)
                {
                    for(int k=1;k<odd-1;k++)
                    {
                        System.out.print(i);
                    }
                    System.out.println("");
                    
                }
                else
                {
                    System.out.println(i);
                }  
                System.out.println("");
                
                
            }
            odd+=2;
            
            
        }

    }
}