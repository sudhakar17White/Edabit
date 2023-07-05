import java.util.Scanner;
class Main{

    static String alp="abcdefghijklmnopqrstuvwxyz";
    static void decodetwo(String s)
    {
        int dectwo=0;
        int i=0;
        while(dectwo!=2)
        {
            if(s.charAt(i)=='0')
            {
                System.out.println("zero not applicable");
                break;
            }
            else
            {
                String a=""+s.charAt(i);
                
                System.out.println(alp.charAt(Integer.parseInt(a)-1)+" "+a);
                i++;
                dectwo++;

            }
        }

        System.out.println(dectwo);

    }
    static void decodethree(String s)
    {
            int decthr=0;
            int r=0;
            
            int st=0,en=1;
            String fi=s.substring(st, en);
            String se=s.substring(st+=1, en+=2);
            
            if((Integer.parseInt(fi)>0 &&Integer.parseInt(fi)<=26)&&(Integer.parseInt(se)>0&&Integer.parseInt(se)<=26))
            {
                r++;
            }
            
            int st1=0,en1=1;
            String fi1=s.substring(st1, en1+=1);
            String se1=s.substring(st1+=2, en1+=1);
            
            if((Integer.parseInt(fi1)>0 &&Integer.parseInt(fi1)<=26)&&(Integer.parseInt(se1)>0&&Integer.parseInt(se1)<=26))
            {
                r++;
            }
            
            if(r==2)
            {
                System.out.println(r+=1);
            }
            else
            {
                System.out.println("Not Noting");
            }

            

    }

    static void decode(String s)
    {
        if(s.length()==2)
        {
            decodetwo(s);
        }
        else if(s.length()==3)
        {
            decodethree(s);
        }
        
        
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String m=s.nextLine();
        
        decode(m);



    }
}