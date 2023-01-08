import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the size:");
		int size=s.nextInt();
		
		String num[]=new String[size];
		 int m=0;
		for(int i=0;i<size;i++)
		{ 
		    
		    num[i]=s.nextLine();
		    
		    
		}
		
		//condition for boom check 7
		
		outer: //break leabel
		for(int i=0;i<size;i++)
		{ 
		    
		    if((num[i].length())==1)
		    { 
		        
		        if(num[i].equals("7"))
		        { 
		            
		            System.out.println("BOOM");
		            break;
		        }
		        
		        
		    }
		    else
		    { 
		         
		        String ni=num[i];
		        
		        int si=ni.length();
		       
		        for(i=0;i<si;i++)
		        { 
		            char a=ni.charAt(i);
		            
		            int com=Character.compare(a,'7');
		            
		            if(com==0)
		            { 
		               m=1;
		               
		               break outer;
		                
		            }
		            
		        }
		        
		        
		        
		    }
		    
		  
		    
		}
		if(m==1)
		{ 
		    
		    System.out.println("BOOM");
		    
		}
		
		
		
	}
}
