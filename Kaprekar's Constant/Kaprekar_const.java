import java.util.*;

class Karprekar_const{

    static int revsresnumber(int num)
    {
        int res=0;
        while(num!=0)
        {
            int a=num%10;
            res=(res*10)+a;
            num=num/10;
        }

        
        return res;
    }
    static int lsswap(int ans)
    {
        int re=ans%2;
         String fans="";
        if(re>=1)
        {
            String an=String.valueOf(ans);

            fans=fans+an.charAt(2)+an.charAt(3)+an.charAt(0)+an.charAt(1);
            //System.out.println(fans);
            re=1;
        }
        else
        {
            String an=String.valueOf(ans);
            fans=fans+an.charAt(0)+an.charAt(2)+an.charAt(1)+an.charAt(3);
            //System.out.println(fans);
            re=0;

        }
        
        return Integer.parseInt(fans);
    }
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        int num=s.nextInt();
        int count=0;
        int ans=0;
        while(num!=6174)
        {     
            int res=revsresnumber(num);
            ans=num-res;
            System.out.println(num+" "+" - "+res+" = "+ans);
            if(ans==6174)
            {
                count++;
                break;
            }
            num=lsswap(ans);   
            count++;
            
        }
        System.out.println(count);
    }
}