import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		
		String a[]=new String[size];
	    
	    int val[]=new int[size];
	    
	    for(int i=0;i<size;i++)
	    { 
	        
	        
	        a[i]=s.next();
	        char ch=a[i].charAt(0);
	        
	        val[i]=ch;
	        
	    }
	    
	  
	    
	    Arrays.sort(val);
	    
	    
	    System.out.println(Arrays.toString(val));
	    
	    char ans[]=new char[size];
	    
	    for(int i=0;i<size;i++)
	    { 
	        
	        
	        char as=(char)val[i];
	        
	        ans[i]=as;
	        
	        
	    }
	    
	     
	    System.out.println(Arrays.toString(ans));
	    
	}
}
