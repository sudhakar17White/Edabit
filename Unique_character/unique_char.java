package Unique_character;
import java.util.*;

public class unique_char {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String uni="";
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            for(int j=i+1;j<word.length();j++)
            {
                if(word.charAt(i)==word.charAt(j))
                {
                    uni=uni+word.charAt(i);
                    break;
                    
                }
            }
            
        }
        System.out.println(word.length()-uni.length());
    }
}
