package Dahsed_Vow;
import java.util.*;
public class Dashed_Vowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String dash="";
        for(int i=0;i<word.length();i++)
        {   
            if((""+word.charAt(i)).equalsIgnoreCase("a")||(""+word.charAt(i)).equalsIgnoreCase("e")||(""+word.charAt(i)).equalsIgnoreCase("i")||(""+word.charAt(i)).equalsIgnoreCase("o")||(""+word.charAt(i)).equalsIgnoreCase("u"))
            {
                dash=dash+"-"+word.charAt(i)+"-";
            }
            else
            {
                dash=dash+word.charAt(i);
            }
        }
        System.out.println(dash);
    }
}
