import java.util.Scanner;

class amateur_hour {
    
    static int indexof(String st)
    {   int fr=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)==':')
            {
                fr=i;
                break;
                
            }
           
        }
        return fr;
    }
    static String Ampm(String st,String en)
    {
        String c1=st.substring(st.length()-2,st.length());
        String c2=en.substring(en.length()-2,en.length());
        if(c1.equals(c2))
        {
            return "same";
        }
        else
        {
            return "not";
        }
    }

    static void hoursPassed(String st,String en)
    {
        int fi=Integer.parseInt(st.substring(0,indexof(st)));   
        int si=Integer.parseInt(en.substring(0,indexof(en)));
        System.out.println(fi+" "+si);
        String ch=Ampm(st,en);
        int tot=0;
        if(ch.equals("same"))
        {
            if(fi>si)
            {
                tot=fi-si;
            }
            else
            {
                tot=si-fi;
            }
            
        }
        else if(ch.equals("not"))
        {

            tot=(12-fi)+si;

            

        }
        System.out.println(tot+" Hours");
    
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter start Time:");
        String st=s.nextLine();
        System.out.println("Enter end Time:");
        String en=s.nextLine();

        hoursPassed(st,en);
    }
}