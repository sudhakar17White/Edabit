/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package eaddabit;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Increment_row_col {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
		
		int row=s.nextInt();
		int col=s.nextInt();
		
		int mat[][]=new int[row][col];
		
		//intiale value zero
		for(int i=0;i<row;i++)
		{ 
		    for(int j=0;j<col;j++)
		    { 
		        
		        mat[i][j]=0;
		        
		    }
		    
		}
		s.nextLine();
        
        String input;
            
        
            do
            {
        
            
            input=s.nextLine();
            if(input.equals("bye"))
            { 
            
                break;
            
            }
            int val=Integer.parseInt(input.substring(0,1));
            //System.out.println(val);
            String wr=input.substring(1);
            //System.out.println(wr);
            
            if(wr.equals("r"))
            {
                   for(int i=0;i<col;i++)
                    {    
                          mat[val][i]=mat[val][i]+1;
                           
                    }
                 
            }
            else if(wr.equals("c"))
            { 
                
                   for(int i=0;i<row;i++)
                    {    
                          mat[i][val]=mat[i][val]+1;
                
                         
                    }
                    //break;
                
            
            }
        
    }while(!input.equals("bye"));
        
        for(int i=0;i<row;i++)
        { 
        
            for(int j=0;j<col;j++)
            { 
            
                System.out.print(mat[i][j]);
            
            }
            System.out.println("\n");
        
        }
        
    }
}
