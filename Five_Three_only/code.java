/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edabit;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Five_And_Three_Only {
    static int even(int num)
    {
            int re=3;
            int r=0;
            //int ma=num;
            while(num!=0)
            {
                num=num/3;
               
                if(num==1||num==0)
                {
                 break;   
                }
                 re=re*3;
                
                
            }
            //System.out.println(re);
            return re;
    }
    static int odd(int num)
    {
        int re=num/5;
        
        return re;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        int num=s.nextInt();
        
        if(num%2==0)
        {
            int ch2=odd(num);
            int ch=even(num);
              if(ch+5==num||ch+5==num)
               {
                   System.out.println("yes"); 
               }
              else if(ch==num||ch2==num)
              {
                   System.out.println("yes"); 
              }
              else
              {
                  System.out.println("No"); 
               
              }
           
        }
        else
        {  int ch2=even(num);
           int ch=odd(num);
           if(ch==num||ch2==num)
           {
               System.out.println("yes");
           }
           else if(ch*5==num||ch*5==num)
           {
               System.out.println("yes"); 
           
           }
           else
           {
               System.out.println("No"); 
           
           }
        }  
        
    }
    
}

