import java.util.*;
class Pilish
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String pi="3.14159265358979";
        int plen=pi.length();
        System.out.print("String:");
        String word=s.nextLine();
        String ans="";
        int ch=0;
        int br=0;

        for(int i=0;i<plen-1;i++)
        {
           
            if(pi.charAt(i)!='.')
            {
                int val=Integer.parseInt(pi.charAt(i)+"");
               // System.out.println(val);
                for(int j=0;j<val;j++)
                {
                    
                    ans=ans+word.charAt(ch);
                    ch++;
                    if(ch==word.length())
                    {
                        br=1;
                    }
                    
                }
                ans=ans+" ";
                //System.out.println(ans);
            }
            if(br==1)
            {
                break;
            }
          
          
        }
        System.out.println("String pi:"+ans);

    }

}