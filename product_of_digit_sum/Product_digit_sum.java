package product_of_digit_sum;

import java.util.Scanner;
public class Product_digit_sum {
    static int digit(int sum)
    {
        int di=0;
        while(sum!=0)
        {
            sum=sum/10;
            di++;
        }
        return di;
    }

    static int singledigit(int sum)
    {
        while(digit(sum)!=1)
        {
            int l=sum%10;
            sum=sum/10;
            int f=sum%10;
            sum=sum/10;
            sum=f*l;

        }

        return sum;
    }
    static void productDigit(int ar[])
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println(singledigit(sum));

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
        productDigit(ar);

    }
}
