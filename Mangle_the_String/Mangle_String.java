package Mangle_the_String;
import java.util.*;
import java.util.regex.Pattern;

public class Mangle_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String ans="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==' ')
            {
                ans=ans+" ";
            }
            else
            {
                
                ans=ans+(char)(((int)word.charAt(i))+1);
                
            }
        }
        //System.out.println(ans);
        String up=""+ans.charAt(0);
        
        for(int j=1;j<ans.length();j++)
        {
            if(ans.charAt(j)=='a'||ans.charAt(j)=='e'||ans.charAt(j)=='i'||ans.charAt(j)=='o'||ans.charAt(j)=='u')
            {
                up=up+((""+ans.charAt(j)).toUpperCase());
            }
            else
            {
                up=up+ans.charAt(j);
            }
        }

        System.out.println(up);
    
    }
}
