/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class odd_len {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Size:");
		int size=s.nextInt();
		
		String word[]=new String[size];
		
		for(int i=0;i<size;i++)
		{ 
		    
		    word[i]=s.next();
		    
		}
                
                System.out.println(Arrays.toString(word));
                       
		// odd num length to reverse the string 
                String w;
                        
                                        
                String nwword="";
                for(int i=0;i<size;i++)
                { 
                
                    
                    int len=word[i].length();
                    
                    if(len%2==1)
                    { 
                    
                        w=word[i];
                        
                        for(int j=0;j<w.length();j++)
                        { 
                             
                            char a=w.charAt(j);
                            nwword=a+nwword;
                            
                        
                        }
                       
                        word[i]=nwword;
                        nwword="";
                        w="";
                    
                    }
                    
                    
                
                }
                
                System.out.println(Arrays.toString(word));
                
		

        
    }
}
