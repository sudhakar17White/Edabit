import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	String word[]={"s","t","r","i","n","g","w"};
	String text=s.nextLine();
	
	int size=word.length;
	int si=text.length();
	String com="";
	for(int i=0;i<size;i++)
	{ 
	    
	    for(int j=0;j<si;j++)
	    { 
	        com=""+text.charAt(j);
	        
	        if(word[i].equals(com))
	        { 
	            
	            word[i]="0";
	            com="";
	            
	        }
	        
	        
	    }
	    
	    
	}
	String ans="";
	
	for(int i=0;i<size;i++)
	{ 
	    
	    if(!word[i].equals("0"))
	    { 
	        ans=ans+word[i];
	        
	    }
	    
	}
	
	System.out.print(ans);
		
		
	}
}

