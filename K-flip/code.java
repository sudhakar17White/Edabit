import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    
	    int size=s.nextInt();
	    
	    int num[]=new int[size];
	    
	    for(int i=0;i<size;i++)
	    { 
	        
	        num[i]=s.nextInt();
	        
	        
	    }
		
		//condition for 0 1
		for(int i=0;i<size;i++)
		{ 
		    
		    if(num[i]==0)
		    { 
		        
		        int temp=num[i];
		        
		        num[i]=1;
		        
		        num[i+1]=temp;
		        break;
		        
		    }
		    
		    
		    
		}
		
	
		//condition for 1 1
		for(int i=0;i<size;i++)
		{ 
		    
		    if(num[i]==1)
		    { 
		        
		        
		        
		        num[i]=0;
		        
		        num[i+1]=0;
		        break;
		        
		    }
		    
		    
		    
		}
		
		
		for(int i=0;i<size;i++)
		{ 
	
	       System.out.print(num[i]+" ");
		 
		}
		
	    
	}
}
