import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the word:");
		String word=s.nextLine();
		
		int size=word.length();
		
		String ans="";
		if(size%2==0)
		{
		    for(int i=0;i<size;i++)
		    { 
		    
		        ans=ans+word.charAt(i+1);
		       // System.out.println(ans);
		        ans=ans+word.charAt(i);
		        //System.out.println(ans);
		        i=i+1;
		    
		    
		    }
		    System.out.println(ans);
		}
		else
		{ 
		    
		    size=size-1;
		    for(int i=0;i<size;i++)
		    { 
		    
		            ans=ans+word.charAt(i+1);
		            //System.out.println(ans);
		            ans=ans+word.charAt(i);
		            //System.out.println(ans);
		            
		            i=i+1;
		    }
		    System.out.println(ans+word.charAt(size));
	    
		}
		
	}
}
