/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Stock_span_problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        int size=s.nextInt();
        
        int ar[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
        
        
        int ans[]=new int[size];
        ans[0]=1;int ch=1,chk=0,high=0,len=size-1,r=0;
        for(int i=0;i<=size;i++)
        {
            chk=ar[i];
            r++;
            if(len>=r)
            {
            if(chk>=ar[i+1])
            {
                ans[ch]=1;
                ch++;
            }
            else
            { 
                high=high+2;
                
                ans[ch]=high;
                ch++;
            }
           }
            else
            { 
            
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
        
    }
}
