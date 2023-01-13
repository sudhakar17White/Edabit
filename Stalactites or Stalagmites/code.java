import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the Row and col size:");
		int row=s.nextInt();
		int col=s.nextInt();
	
	    int num[][]=new int[row][col];
	
	    for(int i=0;i<row;i++)
	    { 
	        
	        for(int j=0;j<col;j++)
	        { 
	            
	            
	          num[i][j]=s.nextInt();
	            
	          
	            
	        }
	        
	        
	        
	    }
	    
	    //conditon for statlactices
	    
	    int statlactices=0;
	    
	    for(int i=0;i<1;i++)
	    { 
	        
	        for(int j=0;j<col;j++)
	        { 
	            
	            if(num[i][j]==1)
	            {
	                statlactices++;
	                break;
	            
	            }
	            
	        }
	        for(int k=0;k<row;k++)
	        { 
	            
	            int cl=0;
	            if(statlactices==1)
	            {
	                
	                break;
	            
	            }
	            else if(num[k][cl]==1)
	            { 
	                
	                statlactices++;
	                break;
	                
	            }
	           
	            
	            
	        }
	        
	        
	        
	    }
	    
	   
	    
	    //condition for statlagmites
	    int statlagmites=0;
	    
	    for(int i=0;i<col;i++)
	    { 
	        
	        if(num[row-1][i]==1)
	        {
	            statlagmites++;
    	        break;
	        }
	        
	    }
	    
	    
	    for(int i=0;i<row;i++)
	    { 
	        if(statlagmites==1)
	        {
    	        System.out.println(num[i][col-1]);
	            break;      
	        }
	        else if(num[i][col-1]==1)
	        { 
	            statlagmites++;
	            break;
	            
	        }
	        
	    }
	    
	    
	   
	    
	    if(statlactices==1&&statlagmites==1)
	    { 
	        System.out.println("both");
	        
	    }
	    else if(statlactices==1)
	    { 
	        
	          System.out.println("statlactices");
	        
	        
	    }
	    else if(statlagmites==1)
	    { 
	        
	          System.out.println("statlagmites");
	        
	        
	    }
	    else
	    { 
	        
	        
	          System.out.println("Not in the list");
	        
	        
	    }
	   
	    
	    
	    
	    
	}
}
