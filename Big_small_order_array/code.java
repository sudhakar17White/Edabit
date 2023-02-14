/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qus;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class small_big_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        
        int num[]={30,12,17,40};
        
        int size=num.length;
        int si=size/2;
        int sm[]=new int[si];
        int bi[]=new int[si];
        
        Arrays.sort(num);
        
        int ch=0;int in=0; 
        for(int i=0;i<size;i++)
        { 
        
           
            if(ch==si)
            { 
                bi[in]=num[i];
                in++;
            }
            else
            {
                sm[i]=num[i];
                ch++;
            }
        
        }
        
        
        int ans[]=new int[size];
        
        int is=0,ib=0;
        for(int i=0;i<size;i++)
        { 
            if(i%2==0)
            { 
            
                if(si==is)
                {
                    break;
                }
                else
                {
                    ans[i]=sm[is];
                    is++;
                }
            }
            else
            { 
            
                if(ib==si)
                { 
                    break;
                
                }
                else
                {
                    ans[i]=bi[ib];
                    ib++;
                }
            }
            
        
        }
        
        for(int i=0;i<size;i++)
        { 
        
            System.out.println(ans[i]);
            
        }
        
        
       
        
    }
    
}
