/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package eaddabit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Post_fix_notation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String action=s.nextLine();
        String act[]=action.split(" ");
        System.out.println(Arrays.toString(act));
        int tot=0;
        int a=0,b=0;
        String ans[]=new String[act.length];
        
        for(int i=0;i<act.length;i++)
        { 
            if(!(act[i].equals("*"))&&!(act.equals("+"))&&!(act[i].equals("-"))&&!(act[i].equals("/")))
            { 
            
                ans[i]=act[i];
                
            }
            else
            { 
            
               String temp=ans[i-1];
               ans[i-1]=act[i];
               ans[i]=temp;
            
            }
            
        }
        System.out.println(Arrays.toString(ans));
        String af="";
        for(int i=0;i<ans.length;i++)
        { 
        
            af=af+ans[i];
        
        }
        System.out.println(af);
        tot=Integer.parseInt(""+af.charAt(0));
        
        for(int i=1;i<af.length();i++)
        { 
            if(af.charAt(i)=='*')
            { 
                tot=tot*Integer.parseInt(""+af.charAt(i+1));
            }
            else if(af.charAt(i)=='+')
            { 
                tot=tot+Integer.parseInt(""+af.charAt(i+1));
            }
            else if(af.charAt(i)=='/')
            { 
                tot=tot/Integer.parseInt(""+af.charAt(i+1));
            }
            else if(af.charAt(i)=='-')
            {
                tot=tot-Integer.parseInt(""+af.charAt(i+1));
            
            }
        
        }
        System.out.println(tot);
    }
}
