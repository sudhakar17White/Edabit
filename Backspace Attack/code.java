import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	
	    Scanner s=new Scanner(System.in);
	    
	    System.out.println("Enter the letter:");
	    String letter=s.nextLine();
	    
	    
	    int size=letter.length();
	    
	    
	    String ans="";
	    
	    
	    int count=0;
	    int i=0;
        
        String check="";
        
        for(i=0;i<size;i++)
        { 
            
            check=check+"#";
            
        }
    
	    if(letter.equals(check))
	    {
	    
	    
	        System.out.println("\" \" ");
	    
	    
	    }
	    else
	    {
	    for(i=0;i<size;i++)
	    { 
	        
	       
	       char a=letter.charAt(i);
	       
	       int comp=Character.compare(a,'#');
	       
	       if(comp==0)
	       { 
	           
	            ans=letter.substring(i-1,i-1);
	            
	           
	           
	       }
	       else
           {	       
	            ans=ans+a;
           }
	       
	        
	     }
	     
	      System.out.println(ans);
	     
	    }
	   
	  
	
		
	}
}
