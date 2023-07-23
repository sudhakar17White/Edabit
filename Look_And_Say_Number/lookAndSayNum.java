import java.util.*;
class lookAndSayNum
{
    static int digit(int num)
    {
        int di=0;
        while(num!=0)
        {
            num=num/10;
            di++;
        }
        return di;
    }
    static int revesre(int num)
    {
        int res=1;
        while(num!=0)
        {
            int a=num%10;
            res=(10*res)+a;
            num=num/10;
        }
        return res;
    }
    static void lookandsay(int rnum,int d)
    {
        d=d/2;
        while(rnum!=0)
        {
            int loop=rnum%10;
            rnum=rnum/10;
            int n=rnum%10;
            if(rnum!=0)
            {
                for(int i=0;i<loop;i++)
                {
                System.out.print(n+" ");
                }
            }
            rnum=rnum/10;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int d=digit(num);
        int rnum=revesre(num);
        lookandsay(rnum,d);


    }
}