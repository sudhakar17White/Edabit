import java.util.*;

class Balanced_word {

    static int word(String sr)
    {
        String alp="abcdefghijklmnopqrstuvwxyz";
        int ans=0;

        for(int i=0;i<sr.length();i++)
        {
            for(int j=0;j<alp.length();j++)
            {
                if(sr.charAt(i)==alp.charAt(j))
                {
                    ans=ans+j+1;
                    
                }
            }
        }
       
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();

        //String will seperate into two

        String fi=word.substring(0,2);
       
        String sec=word.substring(word.length()-2,word.length());
       
        //To pass the letter into the mothed and chechk the condition .
       
        if(word(fi)==word(sec))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        

        
    }
}