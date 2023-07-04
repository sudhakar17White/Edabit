import java.util.*;
class card
{

    static void star(String s,String p)
    {

        char mat=s.charAt(0);

        int m=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==mat)
            {
                m++;
            }
        }
        if(m==s.length())
        {
            System.out.println("'*' matches any sequence");
        }

    } 
    static void qus(String s,String p)
    {

        if(s.length()==p.length())
        {
            int mat=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==p.charAt(i))
                {
                    mat=1;
                    break;
                }
            }
            if(mat==1)
            {
                System.out.println("'?' Matches any single character");
            }
            else
            {
                System.out.println("Not Matches any single character");
            }
        }
        else
        {
            System.out.println("Not Matches any single character");
        }

    }
    static void conditon(String s,String p)
    {
        for(int i=0;i<p.length();i++)
        {
            if(p.charAt(i)=='*')
            {
                star(s,p);
                break;
            }
            else if(p.charAt(i)=='?')
            {
                qus(s, p);
                break;
            }
            else
            {
                System.out.println("Does not Match..");
                break;
            }
        }


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The S and P value:");
        conditon(s.nextLine(),s.nextLine());

    }

}