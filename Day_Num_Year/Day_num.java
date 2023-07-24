package Day_Num_Year;
import java.util.Scanner;

public class Day_num {
    static void dayofYear(int fi,int se,int day)
    {
        fi=fi*31;
        se=se*30;
        System.out.println((fi+se)+day);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        int month=Integer.parseInt(input.substring(0, 2))-1;
        int day=Integer.parseInt(input.substring(3,5));
        int first=month/2;
        int second=month-first;
        dayofYear(first,second,day);

    }
}
