import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
	    
	    String ar[]=new String[size];
	    
	    for(int i=0;i<size;i++)
	    { 
	        
	        ar[i]=s.next();
	        
	        
	    }
	    
	    System.out.print("[");
	    for(int i=0;i<size;i++)
	    { 
	        
	        String n=ar[i];
	        
	        char a=n.charAt(0);
	        
	        int comp=Character.compare(a,'"');
	        
	        if(comp==0)
	        { 
	            
	            //System.out.println(ar[i]);
	            
	        }
	        else
	        { 
	            
	            System.out.print(ar[i]+" ");
	            
	        }
	        
	        
	    }
	     System.out.print("]");
	    
	    
	    
	    
	    
	   
	    
	    
	}
}
