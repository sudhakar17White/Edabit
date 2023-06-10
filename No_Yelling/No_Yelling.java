import java.util.*;

class No_Yelling {

    static String correct(String word)
    {
      
        int last=0;
       
        for(int i=word.length()-1;i>=0;i--)
        {
            if(word.charAt(i)!='?'&&word.charAt(i)!='!')
            {
                last=i;
                break;
            }
        }
        if(last==0)
        {
            return word;
        }
        else
        {
            return word.substring(0,last+1)+word.charAt(word.length()-1);
        }
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        
        System.out.println("Correct Word is:"+correct(word));

    }
}