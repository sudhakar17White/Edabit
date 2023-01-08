import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    
	    Scanner s=new Scanner(System.in);
	    
	    System.out.println("Enter a Line of word:");
	    
	    String line=s.nextLine();
	    
	    int len=line.length();
	    
	    String change="";
		for(int i=0;i<len;i++)
		{ 
		    
		    char a=line.charAt(i);
		    
		    int comp=Character.compare(a,' ');
		    
		    if(comp==0)
		    { 
		        
		        char b=line.charAt(i+1);
		        
		        char d=line.charAt(i+2);
		        
		        int c=Character.compare(d,' ');
		        
		        if(c==0)
		        {
		            
		            
		            change=change+" ecks"+line.substring(i+2,len);
		            break;
		            
		        }
		        
		        
		    }
		    else
		    { 
		        
		        char b=line.charAt(i);
		        
		        int c=Character.compare(b,'x');
		        
		        if(c==0)
		        {
		            
		            
		            change=change+"z"+line.substring(i+1,len);
		            break;
		            
		        }
		        
		        
		        
		    }
		    
		    change=change+a;
		    
		    
		    
		}
		
	    System.out.println(change);
	}
}
