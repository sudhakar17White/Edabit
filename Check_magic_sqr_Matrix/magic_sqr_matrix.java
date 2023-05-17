import java.util.Scanner;

class magic_sqr_matrix {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int row=s.nextInt();
        int col=s.nextInt();
        int ar[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }

        //number adding
        int ch=0;
        for(int i=0;i<col;i++)
        {
            ch=ch+ar[0][i];
        }
        //row check
        int ro=0;
        int rcont=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ro=ro+ar[i][j];

            }
            if(ch==ro)
            {
                rcont++;
            }
            ro=0;
            
        }
        System.out.println("Row conunt: "+rcont);
        
        int ic=0,ir=0;
        int ccout=0,cot=0;
        for(int i=0;i<col;i++)
        {
            
                for(int j=0;j<row;j++)
                {
                    cot=cot+ar[j][ir];
                    if(cot==ch)
                    {
                        ccout++;

                        cot=0;
                        ir++;
                    }

            }
           
            
        }

        System.out.println("colunm count: "+ccout);

        //Diaginal calucaltion
        int ldig=0;
        int rdig=0;
        int x=0,y=0;
        for(int i=0;i<row;i++)
        {
            ldig=ldig+ar[x][y];
            x++;
            y++;
        }
        x=0;y=row-1;
        for(int j=0;j<row;j++)
        {
            rdig=rdig+ar[x][y];
            x+=1;
            y-=1;
        }
        int ans=0;
        if(ldig==ch&&rdig==ch&&rcont==row&&ccout==col)
        {
            System.out.println("Magic Square Matrix");
        }
        else
        {
            System.out.println("Not a Magic Square Matrix");
        }

        
    }
}