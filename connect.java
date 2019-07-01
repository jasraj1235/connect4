import java.util.Scanner;
import java.util.*;

public class connect
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Scanner input= new Scanner(System.in);
        String [][] a= new String[7][6];
        ArrayList<Integer> x_moves=new ArrayList<Integer>();
        ArrayList<Integer> y_moves=new ArrayList<Integer>();
        initialize(a);
        print_matrix(a);
        boolean turn=true;
        boolean winner=true;
        while(winner)
        {
            if(turn==true)
            {
                System.out.println("enter the rows and column");
                int x=input.nextInt();
                int y=input.nextInt();
                if(0<=x && x<=7 && 0<=y && y<=6)
                {
                    a[x][y]="R  ";
                    x_moves.add(x);
                    y_moves.add(y);
                    print_matrix(a);
                    if((x_moves.get(0)>=3 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-1][y_moves.get(0)] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-2][y_moves.get(0)] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-3][y_moves.get(0)]) ||
                    (x_moves.get(0)<=3 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+1][y_moves.get(0)] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+2][y_moves.get(0)] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+3][y_moves.get(0)]) ||
                    (y_moves.get(0)>=3 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)][y_moves.get(0)-1] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)][y_moves.get(0)-2] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)][y_moves.get(0)-3]) ||
                    (y_moves.get(0)<=3 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)][y_moves.get(0)+1] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)][y_moves.get(0)+2] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)][y_moves.get(0)+3])||
                    (x_moves.get(0)<=3 && y_moves.get(0)<=2 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+1][y_moves.get(0)+1] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+2][y_moves.get(0)+2] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+3][y_moves.get(0)+3]) ||
                    (x_moves.get(0)>=3 && y_moves.get(0)>=3 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-1][y_moves.get(0)-1] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-2][y_moves.get(0)-2] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-3][y_moves.get(0)-3]) ||
                    (x_moves.get(0)<=3 && y_moves.get(0)>=3 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+1][y_moves.get(0)-1] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+2][y_moves.get(0)-2] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)+3][y_moves.get(0)-3]) ||
                    (x_moves.get(0)>=3 && y_moves.get(0)<=2 && a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-1][y_moves.get(0)+1] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-2][y_moves.get(0)+2] &&
                    a[x_moves.get(0)][y_moves.get(0)]==a[x_moves.get(0)-3][y_moves.get(0)+3]))
                    {
                        System.out.println("Game over");
                        System.out.println("winner is player red");
                        winner=false;
                        break;
                    }
                }
                else
                {
                    System.out.println("Out of range. please have coordinates in range of 7x6");
                    int c=input.nextInt();
                    int d=input.nextInt();
                    a[c][d]="R  ";
                    print_matrix(a);
                    
                }
                turn=false; 
            }
            
            if(turn==false)
            {
                System.out.println("enter the rows and column");
                int x=input.nextInt();
                int y=input.nextInt();
                if(0<=x && x<=7 && 0<=y && y<=6)
                {
                    a[x][y]="B  ";
                    print_matrix(a);
                }
                else
                {
                    System.out.println("Out of range. please have coordinates in range of 7x6");
                    int c=input.nextInt();
                    int d=input.nextInt();
                    a[c][d]="B  ";
                    print_matrix(a);
                    
                }
                turn=true; 
            }
            
        }
    }
    
    public static void print_matrix(String[][] a)
        {
            for(int i=0; i<7;i++)
                   {
                       for(int j=0; j<6; j++)
                       {
                
                           System.out.print(a[i][j]);
                        }
                        System.out.println();
                    }
        }
        
     public static void initialize(String[][] a)
        {
            for(int i=0; i<7;i++)
                   {
                       for(int j=0; j<6; j++)
                       {
                           String s="_ ";
                           s=s+" ";
                           a[i][j]=s;
                
                        }
                    }
        }
    
}
