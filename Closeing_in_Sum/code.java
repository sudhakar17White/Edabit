/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Closing_in_Sum {

    /**
     * @param args the command line arguments
     */
    static int digit(int num)
    { 
        int count=0;
        
        while(num!=0)
        {
        
            num=num/10;
            count++;
        
        }
    
    
        return count;
    }
    
    
    static int Reverse(int num)
    { 
        int res=0;
        
        while(num!=0)
        { 
            int a=num%10;
            res=(res*10)+a;
            num=num/10;
        
        }
    
    
    
        return res;
    }
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int di=digit(num);
        int res=Reverse(num);
        
        int len=di/2;
        
        int add=0,sum=0;
        for(int i=0;i<len;i++)
        { 
        
            int a=num%10;
            int b=res%10;
            
            add=(b*10)+a;
            sum=sum+add;
            num=num/10;
            res=res/10;
        
        
        }
        
        System.out.println(sum);
        
    }
}
