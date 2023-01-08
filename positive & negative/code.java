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
		
		int c=0;
		
		for(int i=0;i<size;i++)
		{ 
		    
		    if(i%2==0)
		    { 
		        
		        if(num[i]<=-1)
		        { 
		            
		            c=c+1;
		            
		        }
		        else
		        { 
		            
		            break;
		            
		            
		        }
		        
		        
		    }
		    else
		    { 
		        
		        if(num[i]>=1)
		        { 
		          c=c+1;
		        
		        }
		        else
		        { 
		            
		            break;
		            
		        }
		        
		        
		        
		    }
		    
		    
		    
		}
		if(c==size)
		{ 
		    
		    System.out.println("TRUE");
		}
		else
		{ 
		    
		    System.out.println("FALSE");
		    
		}
	    
	}
}
