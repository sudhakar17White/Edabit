import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Word:");
		
		String word=s.nextLine();
		
		int size=word.length();
		
		int st=0;
		
		String com="";
		String out="";
		char a=0;
		for(int i=0;i<size;i++)
		{ 
		    
		    
		    a=word.charAt(i);
		    
		   int comp=Character.compare(a,' ');
		    
		    if(comp==0)
		    { 
		        
		        a=word.charAt(i+1);
		        com="";
		        //System.out.println(a);
		        
		    }
		    else
            {		    	    
		    com=com+a;
		    
		    //System.out.println(com);
		    if(com.equals("zero"))
		    { 
		        
		        out=out+"0";
		        com="";
		    }
		    else if(com.equals("one"))
		    { 
		        
		        out=out+"1";
		        com="";
		        
		    }
		    
		    
            }
		    
	    
		}
		
		if(out.length()==8)
		{ 
		    
		    
		System.out.println(out);
	    
		    
		}
		else
		{ 
		    
		    System.out.println("\"\"");
		    
		}
		
	    
	}
}
