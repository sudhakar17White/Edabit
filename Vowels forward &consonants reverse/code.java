import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner s=new Scanner(System.in);
		
		String word=s.nextLine();
		
		int size=word.length();
		
		String ans="";
		
		for(int i=0;i<size;i++)
		{ 
		    char a=word.charAt(i);
		    String ar=""+a;
		   
		    
		    if(ar.equals("a")||ar.equals("e")||ar.equals("i")||ar.equals("o")||ar.equals("u"))
		    { 
		        
		        ans=ans+ar;
		       
		    }
		    
		}
	
	    String res="";
	
	    for(int i=0;i<size;i++)
	    { 
	        
	        char a=word.charAt(i);
	        for(int j=0;j<=ans.length();j++)
	        { 
	            char b=ans.charAt(j);
	            
	            int com=Character.compare(a,b);
	            
	            if(com==0)
	            { 
	                
	                res=""+res; 
	                break;
	                
	            }
	            else
	            { 
	                
	                 res=""+a+res;
	                 break;
	            }
	            
	        }
	        
	    }
	    System.out.println(ans+res);
	}
}

