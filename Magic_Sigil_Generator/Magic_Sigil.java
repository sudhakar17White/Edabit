package Magic_Sigil_Generator;
import java.util.*;
public class Magic_Sigil {
    static String remove_vovewols(String word)
    {
        word=word.toLowerCase();
        String w="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
            {
                w=w+"";
            }
            else
            {
                w=w+word.charAt(i);
            }
        }
        return w;
    }
    static String duplicate(String word)
    {
        System.out.println(word);
        String dup="";
        int rm=0;
        for(int i=0;i<word.length();i++)
        {
            for(int j=i+1;j<word.length();j++)
            {
                if(word.charAt(i)==word.charAt(j))
                {
                    rm=1;
                    break;
                }
            }
            if(rm==1)
            {
                dup=dup+"";
                rm=0;
            }
            else
            {
                dup=dup+word.charAt(i);
            }

        }
        
        return dup;
    }
    static void magic_sigil(String word)
    {
        String rm=remove_vovewols(word);
        System.out.println(rm);
        String dup=duplicate(rm);
        System.out.println(dup.replace(" ","").toUpperCase());

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        magic_sigil(s.nextLine());
    }
}
