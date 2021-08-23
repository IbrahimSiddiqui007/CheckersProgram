/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_PROJECT_BHATIA;
import java.util.Scanner;

/**
 *
 * @author sushil
 */
public class newgame {
    
        
    public static int i;
    public static int j ;
    
    public static void main(String[] args)
    {
        
        // Plain Board || total 'squares' is 64 || total black squares / '.'s is 32
        String [][] board = new String [8][8];
        for (i =0; i < 8; i++) // i is row 0 to 7
        {
            for(j = 0; j < 8; j++) // j is column 0 to 7
            {
                //board[i][j] = (i + j)% 2 == 0? "-" : ".";
                //if(i%2==0){ go row by row}
                board[0][j] = (i + j)% 2 == 0? "B" : "-";
                board[1][j] = (i + j)% 2 == 0? "-" : "b";
                board[2][j] = (i + j)% 2 == 0? "b" : "-";
                board[3][j] = (i + j)% 2 == 0? "-" : ".";
                board[4][j] = (i + j)% 2 == 0? "." : "-";
                board[5][j] = (i + j)% 2 == 0? "-" : "w";
                board[6][j] = (i + j)% 2 == 0? "w" : "-";
                board[7][j] = (i + j)% 2 == 0? "-" : "W";
            }
        }
      
        for( i = 0; i <8; i++)
        {
            for( j = 0; j <8; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
//////////////////////////////////////INPUT TIME////////////////////////////////////
        
        String colour;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter colour you want represent : W? / B?");
        colour = input.nextLine();
        
        if(colour.toUpperCase().contains("W")) //WHITE
        {
            System.out.println("NOTE: that you can only start with pieces from 21 to 24!");
            System.out.println("NOTE: that 'w' pieces can only move diagonally!");
            int moves;
            Scanner move = new Scanner(System.in);
            System.out.println("Enter the total number of moves you want to make: ");
            moves = move.nextInt();
            
            System.out.println("NOTE: that your first move should be a simple move!");
            System.out.println("NOTE: that in order to execute a simple move, ensure you put '-' between your 2 coordinates!");
            System.out.println("NOTE: that a jump move can only be used when you are diagonally next to your opponent and there is a free space after it!");
            System.out.println("NOTE: that in order to execute a jump move, ensure you put 'x' between your 2 coordinates!");
            System.out.println("Enter the coordinates of move you want to make: ");
            
            for(int muvs = 0; muvs<moves; muvs++)
            {
                String mover;
                Scanner movers = new Scanner(System.in);
                mover = movers.nextLine();
                
                if(mover.contains("-")) //SIMPLE MOVE 
                {
                    if(mover.contains("21"))
                    {
                        if(mover.contains("17"))
                        {
                            board[5][0]=".";
                            board[4][1]="w"; //17

                            for( i = 0; i <8; i++)
                            {
                                for( j = 0; j <8; j++)
                                {
                                    System.out.print(board[i][j]+" ");
                                }
                                System.out.println();
                            }
                        
                            //COUNTER MOVE
                            System.out.println("COUNTER MOVE!");
                            int randomove = (int)(Math.random()*8); //odd
                            randomove+=(randomove%2==0?1:0);

                            board[2][randomove] = ".";

                            if(randomove==1)
                            {
                                int randomove1 = (int)(Math.random()*2); //even 0 to 2
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==3)
                            {
                                int randomove1 = 2+(int)(Math.random()*2); //even 2 to 4
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==5)
                            {
                                int randomove1 = 4+(int)(Math.random()*2); //even 4 to 6
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==7)
                            {
                                board[3][6] = "b"; // 6
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    else if(mover.contains("22"))
                    {
                        if(mover.contains("17"))
                        {
                            if(board[4][1].contains("."))
                            {
                                board[5][2]=".";
                                board[4][1]="w"; //17

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove = (int)(Math.random()*8); //odd
                                randomove+=(randomove%2==0?1:0);

                                board[2][randomove] = ".";

                                if(randomove==1)
                                {
                                    int randomove1 = (int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==3)
                                {
                                    int randomove1 = 2+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==5)
                                {
                                    int randomove1 = 4+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==7)
                                {
                                    board[3][6] = "b"; // 6
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("18"))
                                {
                                    board[5][2]=".";
                                    board[4][3]="w"; //18

                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove = (int)(Math.random()*8); //odd
                                randomove+=(randomove%2==0?1:0);

                                board[2][randomove] = ".";

                                if(randomove==1)
                                {
                                    int randomove1 = (int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==3)
                                {
                                    int randomove1 = 2+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==5)
                                {
                                    int randomove1 = 4+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==7)
                                {
                                    board[3][6] = "b"; // 6
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                            }
                        }
                        else if(mover.contains("18"))
                        {
                            board[5][2]=".";
                            board[4][3]="w"; //18

                            for( i = 0; i <8; i++)
                            {
                                for( j = 0; j <8; j++)
                                {
                                    System.out.print(board[i][j]+" ");
                                }
                                System.out.println();
                            }
                            
                            //COUNTER MOVE
                            System.out.println("COUNTER MOVE!");
                            int randomove = (int)(Math.random()*8); //odd
                            randomove+=(randomove%2==0?1:0);

                            board[2][randomove] = ".";

                            if(randomove==1)
                            {
                                int randomove1 = (int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==3)
                            {
                                int randomove1 = 2+(int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==5)
                            {
                                int randomove1 = 4+(int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==7)
                            {
                                board[3][6] = "b"; // 6
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    else if(mover.contains("23"))
                    {
                        if(mover.contains("18"))
                        {
                            if(board[4][3].contains("."))
                            {
                                board[5][4]=".";
                                board[4][3]="w"; //18

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove = (int)(Math.random()*8); //odd
                                randomove+=(randomove%2==0?1:0);

                                board[2][randomove] = ".";

                                if(randomove==1)
                                {
                                    int randomove1 = (int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==3)
                                {
                                    int randomove1 = 2+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==5)
                                {
                                    int randomove1 = 4+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==7)
                                {
                                    board[3][6] = "b"; // 6
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("19"))
                                {
                                    board[5][4]=".";
                                    board[4][5]="w"; //19

                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                    
                                    //COUNTER MOVE
                                    System.out.println("COUNTER MOVE!");
                                    int randomove = (int)(Math.random()*8); //odd
                                    randomove+=(randomove%2==0?1:0);

                                    board[2][randomove] = ".";

                                    if(randomove==1)
                                    {
                                        int randomove1 = (int)(Math.random()*2); //even
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else
                                        {
                                            randomove1 = randomove1+1;
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove1] = "b";
                                                 for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                    else if(randomove==3)
                                    {
                                        int randomove1 = 2+(int)(Math.random()*2); //even
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else
                                        {
                                            randomove1 = randomove1+1;
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove1] = "b";
                                                 for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                    else if(randomove==5)
                                    {
                                        int randomove1 = 4+(int)(Math.random()*2); //even
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else
                                        {
                                            randomove1 = randomove1+1;
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove1] = "b";
                                                 for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                    else if(randomove==7)
                                    {
                                        board[3][6] = "b"; // 6
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        }
                        if(mover.contains("19"))
                        {
                            board[5][4]=".";
                            board[4][5]="w"; //19

                            for( i = 0; i <8; i++)
                            {
                                for( j = 0; j <8; j++)
                                {
                                    System.out.print(board[i][j]+" ");
                                }
                                System.out.println();
                            }
                            
                            //COUNTER MOVE
                            System.out.println("COUNTER MOVE!");
                            int randomove = (int)(Math.random()*8); //odd
                            randomove+=(randomove%2==0?1:0);

                            board[2][randomove] = ".";

                            if(randomove==1)
                            {
                                int randomove1 = (int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==3)
                            {
                                int randomove1 = 2+(int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==5)
                            {
                                int randomove1 = 4+(int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==7)
                            {
                                board[3][6] = "b"; // 6
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    else if(mover.contains("24"))
                    {
                        if(mover.contains("19"))
                        {
                            if(board[4][5].contains("."))
                            {
                                board[5][6]=".";
                                board[4][5]="w"; //18

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }

                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove = (int)(Math.random()*8); //odd
                                randomove+=(randomove%2==0?1:0);

                                board[2][randomove] = ".";

                                if(randomove==1)
                                {
                                    int randomove1 = (int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==3)
                                {
                                    int randomove1 = 2+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==5)
                                {
                                    int randomove1 = 4+(int)(Math.random()*2); //even
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        randomove1 = randomove1+1;
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                             for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else if(randomove==7)
                                {
                                    board[3][6] = "b"; // 6
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("19"))
                                {
                                    board[5][6]=".";
                                    board[4][5]="w"; //19

                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                    
                                    //COUNTER MOVE
                                    System.out.println("COUNTER MOVE!");
                                    int randomove = (int)(Math.random()*8); //odd
                                    randomove+=(randomove%2==0?1:0);

                                    board[2][randomove] = ".";

                                    if(randomove==1)
                                    {
                                        int randomove1 = (int)(Math.random()*2); //even
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else
                                        {
                                            randomove1 = randomove1+1;
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove1] = "b";
                                                 for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                    else if(randomove==3)
                                    {
                                        int randomove1 = 2+(int)(Math.random()*2); //even
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else
                                        {
                                            randomove1 = randomove1+1;
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove1] = "b";
                                                 for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                    else if(randomove==5)
                                    {
                                        int randomove1 = 4+(int)(Math.random()*2); //even
                                        if(randomove1%2==0)
                                        {
                                            board[3][randomove1] = "b";
                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else
                                        {
                                            randomove1 = randomove1+1;
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove1] = "b";
                                                 for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                    else if(randomove==7)
                                    {
                                        board[3][6] = "b"; // 6
                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        }
                        else if(mover.contains("20"))
                        {
                            board[5][6]=".";
                            board[4][7]="w"; //20

                            for( i = 0; i <8; i++)
                            {
                                for( j = 0; j <8; j++)
                                {
                                    System.out.print(board[i][j]+" ");
                                }
                                System.out.println();
                            }
                            
                            //COUNTER MOVE
                            System.out.println("COUNTER MOVE!");
                            int randomove = (int)(Math.random()*8); //odd
                            randomove+=(randomove%2==0?1:0);

                            board[2][randomove] = ".";

                            if(randomove==1)
                            {
                                int randomove1 = (int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==3)
                            {
                                int randomove1 = 2+(int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==5)
                            {
                                int randomove1 = 4+(int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    board[3][randomove1] = "b";
                                    for( i = 0; i <8; i++)
                                    {
                                        for( j = 0; j <8; j++)
                                        {
                                            System.out.print(board[i][j]+" ");
                                        }
                                        System.out.println();
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        board[3][randomove1] = "b";
                                         for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            else if(randomove==7)
                            {
                                board[3][6] = "b"; // 6
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        } 
                    }
                    if(mover.contains("25"))
                    {
                        if(mover.contains("21"))
                        {
                            if(board[5][0].contains("."))
                            {
                                board[6][1]=".";
                                board[5][0]="w"; //21

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }                               
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("22"))
                                {
                                    if(board[5][2].contains("."))
                                    {
                                        board[6][1]=".";
                                        board[5][2]="w"; //22

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
//                                        System.out.println("Sorry! Location occupied!");
//                                        String newmove1;
//                                        Scanner movers2 = new Scanner(System.in);
//                                        System.out.println("Enter the new coordinates of the move you want to make: ");
//                                        newmove1 = movers2.nextLine();
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
                                    }
                                }
                            }
                        }
                        else if(mover.contains("22"))
                        {
                            if(board[5][2].contains("."))
                            {
                                board[6][1]=".";
                                board[5][2]="w"; //22

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
//                                String newmove1;
//                                Scanner movers2 = new Scanner(System.in);
//                                System.out.println("Enter the new coordinates of the move you want to make: ");
//                                newmove1 = movers2.nextLine();
//
//                                for( i = 0; i <8; i++)
//                                {
//                                    for( j = 0; j <8; j++)
//                                    {
//                                        System.out.print(board[i][j]+" ");
//                                    }
//                                    System.out.println();
//                                }
                            }
                        }
                    }
                    if(mover.contains("26"))
                    {
                        if(mover.contains("22"))
                        {
                            if(board[5][2].contains("."))
                            {
                                board[6][3]=".";
                                board[5][2]="w"; //22

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("23"))
                                {
                                    if(board[5][4].contains("."))
                                    {
                                        board[6][3]=".";
                                        board[5][4]="w"; //23

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Sorry! Location occupied!");
//                                        String newmove1;
//                                        Scanner movers2 = new Scanner(System.in);
//                                        System.out.println("Enter the new coordinates of the move you want to make: ");
//                                        newmove1 = movers2.nextLine();
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
                                    }
                                }
                            }
                        }
                        else if(mover.contains("23"))
                        {
                            if(board[5][4].contains("."))
                            {
                                board[6][3]=".";
                                board[5][4]="w"; //23

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    if(mover.contains("27"))
                    {
                        if(mover.contains("23"))
                        {
                            if(board[5][4].contains("."))
                            {
                                board[6][5]=".";
                                board[5][4]="w"; //23

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();

                                if(newmove.contains("24"))
                                {
                                    if(board[5][6].contains("."))
                                    {
                                        board[6][5]=".";
                                        board[5][6]="w"; //24

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Sorry! Location occupied!");
//                                        String newmove1;
//                                        Scanner movers2 = new Scanner(System.in);
//                                        System.out.println("Enter the new coordinates of the move you want to make: ");
//                                        newmove1 = movers2.nextLine();
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
                                    }
                                }
                            }
                        }
                        else if(mover.contains("24"))
                        {
                            if(board[5][6].contains("."))
                            {
                                board[6][5]=".";
                                board[5][6]="w"; //24

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    if(mover.contains("28"))
                    {
                        if(mover.contains("24"))
                        {
                            if(board[5][6].contains("."))
                            {
                                board[6][7]=".";
                                board[5][6]="w"; //24

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
//                                String newmove;
//                                Scanner movers1 = new Scanner(System.in);
//                                System.out.println("Enter the new coordinates of the move you want to make: ");
//                                newmove = movers1.nextLine();
//                                
//                                for( i = 0; i <8; i++)
//                                {
//                                    for( j = 0; j <8; j++)
//                                    {
//                                        System.out.print(board[i][j]+" ");
//                                    }
//                                    System.out.println();
//                                }
                            }
                        }
                    }
                    if(mover.contains("29"))
                    {
                        if(mover.contains("25"))
                        {
                            if(board[6][1].contains("."))
                            {   
                                board[7][0]=".";
                                board[4][1]="W"; //25

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*2); //even
                                if(randomove1%2==0)
                                {
                                    if(board[1][randomove1].contains("."))
                                    {
                                        board[1][randomove1] = ".";
                                        if(randomove1 == 0)
                                        {
                                            int randomove = (int)(Math.random()*8); //odd
                                            randomove+=(randomove%2==0?1:0);

                                            board[2][randomove] = "b";

                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else if(randomove1 == 2)
                                        {
                                            int randomove = (int)(Math.random()*8); //odd
                                            randomove+=(randomove%2==0?1:0);

                                            board[2][randomove] = "b";

                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else if(randomove1 == 4)
                                        {
                                            int randomove = (int)(Math.random()*8); //odd
                                            randomove+=(randomove%2==0?1:0);

                                            board[2][randomove] = "b";

                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                        else if(randomove1 == 6)
                                        {
                                            int randomove = (int)(Math.random()*8); //odd
                                            randomove+=(randomove%2==0?1:0);

                                            board[2][randomove] = "b";

                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                    else
                                    {
                                        //COUNTER MOVE for 2nd row of 'b'
                                        System.out.println("COUNTER MOVE!");
                                        int randomove = (int)(Math.random()*8); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[2][randomove] = ".";

                                        if(randomove==1)
                                        {
                                            int randomove2 = (int)(Math.random()*2); //even
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove2] = "b";
                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                            else
                                            {
                                                randomove2 = randomove2+2;
                                                if(randomove2%2==0)
                                                {
                                                    board[3][randomove2] = "b";
                                                     for( i = 0; i <8; i++)
                                                    {
                                                        for( j = 0; j <8; j++)
                                                        {
                                                            System.out.print(board[i][j]+" ");
                                                        }
                                                        System.out.println();
                                                    }
                                                }
                                            }
                                        }
                                        else if(randomove==3)
                                        {
                                            int randomove2 = 2+(int)(Math.random()*2); //even
                                            if(randomove1%2==0)
                                            {
                                                board[3][randomove2] = "b";
                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                            else
                                            {
                                                randomove2 = randomove2+1;
                                                if(randomove1%2==0)
                                                {
                                                    board[3][randomove2] = "b";
                                                     for( i = 0; i <8; i++)
                                                    {
                                                        for( j = 0; j <8; j++)
                                                        {
                                                            System.out.print(board[i][j]+" ");
                                                        }
                                                        System.out.println();
                                                    }
                                                }
                                            }
                                        }
                                        else if(randomove==5)
                                        {
                                            int randomove2 = 4+(int)(Math.random()*2); //even
                                            if(randomove2%2==0)
                                            {
                                                board[3][randomove2] = "b";
                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                            else
                                            {
                                                randomove2 = randomove2+1;
                                                if(randomove2%2==0)
                                                {
                                                    board[3][randomove2] = "b";
                                                     for( i = 0; i <8; i++)
                                                    {
                                                        for( j = 0; j <8; j++)
                                                        {
                                                            System.out.print(board[i][j]+" ");
                                                        }
                                                        System.out.println();
                                                    }
                                                }
                                            }
                                        }
                                        else if(randomove==7)
                                        {
                                            board[3][6] = "b"; // 6
                                            for( i = 0; i <8; i++)
                                            {
                                                for( j = 0; j <8; j++)
                                                {
                                                    System.out.print(board[i][j]+" ");
                                                }
                                                System.out.println();
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    randomove1 = randomove1+1;
                                    if(randomove1%2==0)
                                    {
                                        if(board[1][randomove1].contains("."))
                                        {
                                            board[1][randomove1] = ".";
                                            if(randomove1 == 0)
                                            {
                                                int randomove = (int)(Math.random()*8); //odd
                                                randomove+=(randomove%2==0?1:0);

                                                board[2][randomove] = "b";

                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                            else if(randomove1 == 2)
                                            {
                                                int randomove = (int)(Math.random()*8); //odd
                                                randomove+=(randomove%2==0?1:0);

                                                board[2][randomove] = "b";

                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                            else if(randomove1 == 4)
                                            {
                                                int randomove = (int)(Math.random()*8); //odd
                                                randomove+=(randomove%2==0?1:0);

                                                board[2][randomove] = "b";

                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                            else if(randomove1 == 6)
                                            {
                                                int randomove = (int)(Math.random()*8); //odd
                                                randomove+=(randomove%2==0?1:0);

                                                board[2][randomove] = "b";

                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                        else
                                        {
                                            //COUNTER MOVE for 2nd row of 'b'
                                            System.out.println("COUNTER MOVE!");
                                            int randomove = (int)(Math.random()*8); //odd
                                            randomove+=(randomove%2==0?1:0);

                                            board[2][randomove] = ".";

                                            if(randomove==1)
                                            {
                                                int randomove2 = (int)(Math.random()*2); //even
                                                if(randomove1%2==0)
                                                {
                                                    board[3][randomove2] = "b";
                                                    for( i = 0; i <8; i++)
                                                    {
                                                        for( j = 0; j <8; j++)
                                                        {
                                                            System.out.print(board[i][j]+" ");
                                                        }
                                                        System.out.println();
                                                    }
                                                }
                                                else
                                                {
                                                    randomove2 = randomove2+2;
                                                    if(randomove2%2==0)
                                                    {
                                                        board[3][randomove2] = "b";
                                                         for( i = 0; i <8; i++)
                                                        {
                                                            for( j = 0; j <8; j++)
                                                            {
                                                                System.out.print(board[i][j]+" ");
                                                            }
                                                            System.out.println();
                                                        }
                                                    }
                                                }
                                            }
                                            else if(randomove==3)
                                            {
                                                int randomove2 = 2+(int)(Math.random()*2); //even
                                                if(randomove1%2==0)
                                                {
                                                    board[3][randomove2] = "b";
                                                    for( i = 0; i <8; i++)
                                                    {
                                                        for( j = 0; j <8; j++)
                                                        {
                                                            System.out.print(board[i][j]+" ");
                                                        }
                                                        System.out.println();
                                                    }
                                                }
                                                else
                                                {
                                                    randomove2 = randomove2+1;
                                                    if(randomove1%2==0)
                                                    {
                                                        board[3][randomove2] = "b";
                                                         for( i = 0; i <8; i++)
                                                        {
                                                            for( j = 0; j <8; j++)
                                                            {
                                                                System.out.print(board[i][j]+" ");
                                                            }
                                                            System.out.println();
                                                        }
                                                    }
                                                }
                                            }
                                            else if(randomove==5)
                                            {
                                                int randomove2 = 4+(int)(Math.random()*2); //even
                                                if(randomove2%2==0)
                                                {
                                                    board[3][randomove2] = "b";
                                                    for( i = 0; i <8; i++)
                                                    {
                                                        for( j = 0; j <8; j++)
                                                        {
                                                            System.out.print(board[i][j]+" ");
                                                        }
                                                        System.out.println();
                                                    }
                                                }
                                                else
                                                {
                                                    randomove2 = randomove2+1;
                                                    if(randomove2%2==0)
                                                    {
                                                        board[3][randomove2] = "b";
                                                         for( i = 0; i <8; i++)
                                                        {
                                                            for( j = 0; j <8; j++)
                                                            {
                                                                System.out.print(board[i][j]+" ");
                                                            }
                                                            System.out.println();
                                                        }
                                                    }
                                                }
                                            }
                                            else if(randomove==7)
                                            {
                                                board[3][6] = "b"; // 6
                                                for( i = 0; i <8; i++)
                                                {
                                                    for( j = 0; j <8; j++)
                                                    {
                                                        System.out.print(board[i][j]+" ");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
//                                String newmove1;
//                                Scanner movers2 = new Scanner(System.in);
//                                System.out.println("Enter the new coordinates of the move you want to make: ");
//                                newmove1 = movers2.nextLine();
//
//                                for( i = 0; i <8; i++)
//                                {
//                                    for( j = 0; j <8; j++)
//                                    {
//                                        System.out.print(board[i][j]+" ");
//                                    }
//                                    System.out.println();
//                                }
                            }
                        }
                    }
                    if(mover.contains("30"))
                    {
                        if(mover.contains("25"))
                        {
                            if(board[6][1].contains("."))
                            {
                                board[7][2]=".";
                                board[6][1]="W"; //25

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("26"))
                                {
                                    if(board[6][3].contains("."))
                                    {
                                        board[7][2]=".";
                                        board[6][3]="W"; //26

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Sorry! Location occupied!");
//                                        String newmove1;
//                                        Scanner movers2 = new Scanner(System.in);
//                                        System.out.println("Enter the new coordinates of the move you want to make: ");
//                                        newmove1 = movers2.nextLine();
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
                                    }
                                }
                            }
                        }
                        else if(mover.contains("26"))
                        {
                            if(board[6][3].contains("."))
                            {
                                board[7][2]=".";
                                board[6][3]="W"; //26

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    if(mover.contains("31"))
                    {
                        if(mover.contains("26"))
                        {
                            if(board[6][3].contains("."))
                            {
                                board[7][4]=".";
                                board[6][3]="W"; //26

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("27"))
                                {
                                    if(board[6][5].contains("."))
                                    {
                                        board[7][4]=".";
                                        board[6][5]="W"; //27

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Sorry! Location occupied!");
//                                        String newmove1;
//                                        Scanner movers2 = new Scanner(System.in);
//                                        System.out.println("Enter the new coordinates of the move you want to make: ");
//                                        newmove1 = movers2.nextLine();
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
                                    }
                                }
                            }
                        }
                        else if(mover.contains("27"))
                        {
                            if(board[6][5].contains("."))
                            {
                                board[7][4]=".";
                                board[6][5]="W"; //23

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    if(mover.contains("32"))
                    {
                        if(mover.contains("27"))
                        {
                            if(board[6][5].contains("."))
                            {
                                board[7][6]=".";
                                board[6][5]="W"; //27

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Sorry! Location occupied!");
                                String newmove;
                                Scanner movers1 = new Scanner(System.in);
                                System.out.println("Enter the new coordinates of the move you want to make: ");
                                newmove = movers1.nextLine();
                                
                                if(newmove.contains("28"))
                                {
                                    if(board[6][7].contains("."))
                                    {
                                        board[7][6]=".";
                                        board[6][7]="W"; //28

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Sorry! Location occupied!");
//                                        String newmove1;
//                                        Scanner movers2 = new Scanner(System.in);
//                                        System.out.println("Enter the new coordinates of the move you want to make: ");
//                                        newmove1 = movers2.nextLine();
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
                                    }
                                }
                            }
                        }
                        else if(mover.contains("28"))
                        {
                            if(board[6][7].contains("."))
                            {
                                board[7][6]=".";
                                board[6][7]="W"; //28

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
                else if(mover.contains("x")) //JUMP MOVES 
                {
                    if(mover.contains("17"))
                    {
                        if(board[3][2].contains("b"))//14
                        {
                            if(board[2][3].contains("."))//10
                            {
                                board[4][1]=".";
                                board[3][2]=".";
                                board[2][3]="w";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                    if(mover.contains("18"))
                    {
                        if(board[3][2].contains("b"))//14
                        {
                            if(board[2][1].contains("."))//9
                            {
                                board[4][3]=".";
                                board[3][2]=".";
                                board[2][1]="w";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else if(board[3][4].contains("b"))//15
                        {
                            if(board[2][5].contains("."))//11
                            {
                                board[4][3]=".";
                                board[3][4]=".";
                                board[2][5]="w";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                    if(mover.contains("19"))
                    {
                        if(board[3][4].contains("b"))//15
                        {
                            if(board[2][3].contains("."))//10
                            {
                                board[4][5]=".";
                                board[3][4]=".";
                                board[2][3]="w";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else if(board[3][6].contains("b"))//16
                        {
                            if(board[2][7].contains("."))//12
                            {
                                board[4][5]=".";
                                board[3][6]=".";
                                board[2][7]="w";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                    if(mover.contains("20"))
                    {
                        if(board[3][6].contains("b"))//16
                        {
                            if(board[2][5].contains("."))//11
                            {
                                board[4][7]=".";
                                board[3][6]=".";
                                board[2][5]="w";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                }
            }
        }
        
        //////////////////Black Side//////////////////////
        if(colour.toUpperCase().contains("B"))
        {
            System.out.println("NOTE: that you can only start with pieces from 9 to 12!");
            System.out.println("NOTE: that 'b' pieces can only move diagonally!");
            int moves;
            Scanner move = new Scanner(System.in);
            System.out.println("Enter the total number of moves you want to make: ");
            moves = move.nextInt();
            
            System.out.println("NOTE: that your first move should be a simple move!");
            System.out.println("NOTE: that in order to execute a simple move, ensure you put '-' between your 2 coordinates!");
            System.out.println("NOTE: that a jump move can only be used when you are diagonally next to your opponent and there is a free space after it!");
            System.out.println("NOTE: that in order to execute a jump move, ensure you put 'x' between your 2 coordinates!");
            System.out.println("Enter the coordinates of move you want to make: ");
            
            for(int muvs = 0; muvs<moves; muvs++)
            {
                String mover;
                Scanner movers = new Scanner(System.in);
                mover = movers.nextLine();
                
                if(mover.contains("-")) //SIMPLE MOVE 
                {
                    if(mover.contains("9"))
                    {
                        if(mover.contains("13"))
                        {
                            if(board[3][0].contains("."))
                            {
                                board[2][1]=".";
                                board[3][0]="b"; //13

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*8); //even
                                if(randomove1%2==0)
                                {           
                                    board[5][randomove1] = ".";
                                    if(randomove1 == 0)
                                    {
                                        int randomove = (int)(Math.random()*2); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 2)
                                    {
                                        int randomove = (int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 4)
                                    {
                                        int randomove = 2+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 6)
                                    {
                                        int randomove = 4+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }   
//                            else
//                            {
//                                System.out.println("Sorry! Location occupied!");
//                                String newmove;
//                                Scanner movers1 = new Scanner(System.in);
//                                System.out.println("Enter the new coordinates of the move you want to make: ");
//                                newmove = movers1.nextLine();
//
//                                if(newmove.contains("14"))
//                                {
//                                    board[2][1]=".";
//                                    board[3][2]="b"; //14
//
//                                    for( i = 0; i <8; i++)
//                                    {
//                                        for( j = 0; j <8; j++)
//                                        {
//                                            System.out.print(board[i][j]+" ");
//                                        }
//                                        System.out.println();
//                                    }
//                                }
//                                else
//                                {
//                                    System.out.println("Sorry! Location occupied!");
//                                }
//                            }
                        }
                        if(mover.contains("14"))
                        {
                            if(board[3][2].contains("."))
                            {
                                board[2][1]=".";
                                board[3][2]="b"; //14

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*8); //even
                                if(randomove1%2==0)
                                {           
                                    board[5][randomove1] = ".";
                                    if(randomove1 == 0)
                                    {
                                        int randomove = (int)(Math.random()*2); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 2)
                                    {
                                        int randomove = (int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 4)
                                    {
                                        int randomove = 2+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 6)
                                    {
                                        int randomove = 4+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }                           
                            }
                        }
//                        else
//                        {
//                            System.out.println("Sorry! Location occupied!");
//                        }
                    }
                    if(mover.contains("10"))
                    {
                        if(mover.contains("14"))
                        {
                            if(board[3][2].contains("."))
                            {
                                board[2][3]=".";
                                board[3][2]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*8); //even
                                if(randomove1%2==0)
                                {           
                                    board[5][randomove1] = ".";
                                    if(randomove1 == 0)
                                    {
                                        int randomove = (int)(Math.random()*2); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 2)
                                    {
                                        int randomove = (int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 4)
                                    {
                                        int randomove = 2+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 6)
                                    {
                                        int randomove = 4+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
//                            else
//                            {
//                                System.out.println("Sorry! Location occupied!");
//                                String newmove;
//                                Scanner movers1 = new Scanner(System.in);
//                                System.out.println("Enter the new coordinates of the move you want to make: ");
//                                newmove = movers1.nextLine();
//                                
//                                if(newmove.contains("15"))
//                                {
//                                    if(board[3][4].contains("."))
//                                    {
//                                        board[2][3]=".";
//                                        board[3][4]="b"; //15
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
//                                        break;
//                                    }
//                                    else
//                                    {
//                                        System.out.println("Sorry! Location occupied!");
//                                    }
//                                }
//                            }
                        }
                        else if(mover.contains("15"))
                        {
                            if(board[3][4].contains("."))
                            {
                                board[2][3]=".";
                                board[3][4]="b"; //15

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*8); //even
                                if(randomove1%2==0)
                                {           
                                    board[5][randomove1] = ".";
                                    if(randomove1 == 0)
                                    {
                                        int randomove = (int)(Math.random()*2); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 2)
                                    {
                                        int randomove = (int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 4)
                                    {
                                        int randomove = 2+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 6)
                                    {
                                        int randomove = 4+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            } 
                        }
                    }
                    else if(mover.contains("11"))
                    {
                        if(mover.contains("15"))
                        {
                            if(board[3][4].contains("."))
                            {
                                board[2][5]=".";
                                board[3][4]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*8); //even
                                if(randomove1%2==0)
                                {           
                                    board[5][randomove1] = ".";
                                    if(randomove1 == 0)
                                    {
                                        int randomove = (int)(Math.random()*2); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 2)
                                    {
                                        int randomove = (int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 4)
                                    {
                                        int randomove = 2+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 6)
                                    {
                                        int randomove = 4+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
//                            else
//                            {
//                                System.out.println("Sorry! Location occupied!");
//                                String newmove;
//                                Scanner movers1 = new Scanner(System.in);
//                                System.out.println("Enter the new coordinates of the move you want to make: ");
//                                newmove = movers1.nextLine();
//                                
//                                if(newmove.contains("16"))
//                                {
//                                    if(board[3][6].contains("."))
//                                    {
//                                        board[2][5]=".";
//                                        board[3][6]="b"; //16
//
//                                        for( i = 0; i <8; i++)
//                                        {
//                                            for( j = 0; j <8; j++)
//                                            {
//                                                System.out.print(board[i][j]+" ");
//                                            }
//                                            System.out.println();
//                                        }
//                                    }
//                                    else
//                                    {
//                                        System.out.println("Sorry! Location occupied!");
//                                    }
//                                }
//                            }
                        }
                        else if(mover.contains("16"))
                        {
                            if(board[3][4].contains("."))
                            {
                                board[2][5]=".";
                                board[3][6]="b"; //16

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*8); //even
                                if(randomove1%2==0)
                                {           
                                    board[5][randomove1] = ".";
                                    if(randomove1 == 0)
                                    {
                                        int randomove = (int)(Math.random()*2); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 2)
                                    {
                                        int randomove = (int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 4)
                                    {
                                        int randomove = 2+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 6)
                                    {
                                        int randomove = 4+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            } 
                        }
                    }
                    else if(mover.contains("12"))
                    {
                        if(mover.contains("16"))
                        {
                            if(board[3][6].contains("."))
                            {
                                board[2][7]=".";
                                board[3][6]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                                
                                //COUNTER MOVE
                                System.out.println("COUNTER MOVE!");
                                int randomove1 = (int)(Math.random()*8); //even
                                if(randomove1%2==0)
                                {           
                                    board[5][randomove1] = ".";
                                    if(randomove1 == 0)
                                    {
                                        int randomove = (int)(Math.random()*2); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 2)
                                    {
                                        int randomove = (int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 4)
                                    {
                                        int randomove = 2+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else if(randomove1 == 6)
                                    {
                                        int randomove = 4+(int)(Math.random()*4); //odd
                                        randomove+=(randomove%2==0?1:0);

                                        board[4][randomove] = "w";

                                        for( i = 0; i <8; i++)
                                        {
                                            for( j = 0; j <8; j++)
                                            {
                                                System.out.print(board[i][j]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
//                            else
//                            {
//                                System.out.println("Sorry! Location occupied!");
//                                
//                            }
                        }
                    }
                    if(mover.contains("5"))
                    {
                        if(mover.contains("9"))
                        {
                            if(board[2][1].contains("."))
                            {
                                board[1][0]=".";
                                board[2][1]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
//                            else
//                            {
//                                System.out.println("Sorry! Location occupied!");
//                            }
                        }
                    }
                    if(mover.contains("6"))
                    {
                        if(mover.contains("9"))
                        {
                            if(board[2][1].contains("."))
                            {
                                board[1][2]=".";
                                board[2][1]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                        if(mover.contains("10"))
                        {
                            if(board[2][3].contains("."))
                            {
                                board[1][2]=".";
                                board[2][3]="b"; //10

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
//                        else
//                        {
//                            System.out.println("Sorry! Location occupied!");
//                            String newmove;
//                            Scanner movers1 = new Scanner(System.in);
//                            System.out.println("Enter the new coordinates of the move you want to make: ");
//                            newmove = movers1.nextLine();
//
//                            if(newmove.contains("10"))
//                            {
//                                if(board[2][3].contains("."))
//                                {
//                                    board[1][2]=".";
//                                    board[2][3]="b"; //10
//
//                                    for( i = 0; i <8; i++)
//                                    {
//                                        for( j = 0; j <8; j++)
//                                        {
//                                            System.out.print(board[i][j]+" ");
//                                        }
//                                        System.out.println();
//                                    }
//                                }
//                                else
//                                {
//                                    System.out.println("Sorry! Location occupied!");
//                                }
//                            }
//                        }
                    }
                    if(mover.contains("7"))
                    {
                        if(mover.contains("10"))
                        {
                            if(board[2][3].contains("."))
                            {
                                board[1][4]=".";
                                board[2][3]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                        if(mover.contains("11"))
                        {
                            if(board[2][5].contains("."))
                            {
                                board[1][4]=".";
                                board[2][5]="b"; //10

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
//                        else
//                        {
//                            System.out.println("Sorry! Location occupied!");
//                            String newmove;
//                            Scanner movers1 = new Scanner(System.in);
//                            System.out.println("Enter the new coordinates of the move you want to make: ");
//                            newmove = movers1.nextLine();
//
//                            if(newmove.contains("11"))
//                            {
//                                if(board[2][5].contains("."))
//                                {
//                                    board[1][4]=".";
//                                    board[2][5]="b"; //10
//
//                                    for( i = 0; i <8; i++)
//                                    {
//                                        for( j = 0; j <8; j++)
//                                        {
//                                            System.out.print(board[i][j]+" ");
//                                        }
//                                        System.out.println();
//                                    }
//                                }
//                                else
//                                {
//                                    System.out.println("Sorry! Location occupied!");
//                                }
//                            }
//                        }
                    }
                    if(mover.contains("8"))
                    {
                        if(mover.contains("11"))
                        {
                            if(board[2][5].contains("."))
                            {
                                board[1][6]=".";
                                board[2][5]="b";//11
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                        if(mover.contains("12"))
                        {
                            if(board[2][7].contains("."))
                            {
                                board[1][6]=".";
                                board[2][7]="b"; //12

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
//                        else
//                        {
//                            System.out.println("Sorry! Location occupied!");
//                            String newmove;
//                            Scanner movers1 = new Scanner(System.in);
//                            System.out.println("Enter the new coordinates of the move you want to make: ");
//                            newmove = movers1.nextLine();
//
//                            if(newmove.contains("12"))
//                            {
//                                if(board[2][7].contains("."))
//                                {
//                                    board[1][6]=".";
//                                    board[2][7]="b"; //12
//
//                                    for( i = 0; i <8; i++)
//                                    {
//                                        for( j = 0; j <8; j++)
//                                        {
//                                            System.out.print(board[i][j]+" ");
//                                        }
//                                        System.out.println();
//                                    }
//                                }
//                                else
//                                {
//                                    System.out.println("Sorry! Location occupied!");
//                                }
//                            }
//                        }
                    }
                    if(mover.contains("1"))
                    {
                        if(mover.contains("5"))
                        {
                            if(board[1][0].contains("."))
                            {
                                board[0][1]=".";
                                board[1][0]="B";//5
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                        if(mover.contains("6"))
                        {
                            if(board[1][2].contains("."))
                            {
                                board[0][1]=".";
                                board[1][2]="B"; //6

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
////                        else
////                        {
////                            System.out.println("Sorry! Location occupied!");
////                            String newmove;
////                            Scanner movers1 = new Scanner(System.in);
////                            System.out.println("Enter the new coordinates of the move you want to make: ");
////                            newmove = movers1.nextLine();
////
////                            if(newmove.contains("6"))
////                            {
////                                if(board[1][2].contains("."))
////                                {
////                                    board[0][1]=".";
////                                    board[1][2]="B"; //6
////
////                                    for( i = 0; i <8; i++)
////                                    {
////                                        for( j = 0; j <8; j++)
////                                        {
////                                            System.out.print(board[i][j]+" ");
////                                        }
////                                        System.out.println();
////                                    }
////                                }
////                                else
////                                {
////                                    System.out.println("Sorry! Location occupied!");
////                                }
////                            }
////                        }
                    }
                    if(mover.contains("2"))
                    {
                        if(mover.contains("6"))
                        {
                            if(board[1][2].contains("."))
                            {
                                board[0][3]=".";
                                board[1][2]="B";//6
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                        if(mover.contains("7"))
                        {
                            if(board[1][4].contains("."))
                            {
                                board[0][3]=".";
                                board[1][4]="B"; //7

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
//                        else
//                        {
//                            System.out.println("Sorry! Location occupied!");
//                            String newmove;
//                            Scanner movers1 = new Scanner(System.in);
//                            System.out.println("Enter the new coordinates of the move you want to make: ");
//                            newmove = movers1.nextLine();
//
//                            if(newmove.contains("7"))
//                            {
//                                if(board[1][4].contains("."))
//                                {
//                                    board[0][3]=".";
//                                    board[1][4]="B"; //7
//
//                                    for( i = 0; i <8; i++)
//                                    {
//                                        for( j = 0; j <8; j++)
//                                        {
//                                            System.out.print(board[i][j]+" ");
//                                        }
//                                        System.out.println();
//                                    }
//                                }
//                                else
//                                {
//                                    System.out.println("Sorry! Location occupied!");
//                                }
//                            }
//                        }
                    }
                    if(mover.contains("3"))
                    {
                        if(mover.contains("7"))
                        {
                            if(board[1][4].contains("."))
                            {
                                board[0][5]=".";
                                board[1][4]="B";//7
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                        if(mover.contains("8"))
                        {
                            if(board[1][6].contains("."))
                            {
                                board[0][5]=".";
                                board[1][6]="B"; //8

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                        }
//                        else
//                        {
//                            System.out.println("Sorry! Location occupied!");
//                            String newmove;
//                            Scanner movers1 = new Scanner(System.in);
//                            System.out.println("Enter the new coordinates of the move you want to make: ");
//                            newmove = movers1.nextLine();
//
//                            if(newmove.contains("8"))
//                            {
//                                if(board[1][6].contains("."))
//                                {
//                                    board[0][5]=".";
//                                    board[1][6]="B"; //8
//
//                                    for( i = 0; i <8; i++)
//                                    {
//                                        for( j = 0; j <8; j++)
//                                        {
//                                            System.out.print(board[i][j]+" ");
//                                        }
//                                        System.out.println();
//                                    }
//                                }
//                                else
//                                {
//                                    System.out.println("Sorry! Location occupied!");
//                                }
//                            }
//                        }
                    }
                    if(mover.contains("4"))
                    {
                        if(mover.contains("8"))
                        {
                            if(board[1][6].contains("."))
                            {
                                board[0][7]=".";
                                board[1][6]="B"; //8

                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
//                            else
//                            {
//                                System.out.println("Sorry! Location occupied!");
//                            }
                        }
                    }
                }
                else if(mover.contains("x")) //JUMP MOVES 
                {
                    if(mover.contains("13"))
                    {
                        if(board[4][1].contains("w"))//17
                        {
                            if(board[5][2].contains("."))//22
                            {
                                board[3][0]=".";
                                board[4][1]=".";
                                board[5][2]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                    if(mover.contains("14"))
                    {
                        if(board[4][1].contains("w"))//17
                        {
                            if(board[5][0].contains("."))//21
                            {
                                board[3][2]=".";
                                board[4][1]=".";
                                board[5][0]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else if(board[4][3].contains("w"))//18
                        {
                            if(board[5][3].contains("."))//23
                            {
                                board[3][2]=".";
                                board[4][3]=".";
                                board[5][3]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                    if(mover.contains("15"))
                    {
                        if(board[4][3].contains("w"))//18
                        {
                            if(board[5][2].contains("."))//22
                            {
                                board[3][4]=".";
                                board[4][3]=".";
                                board[5][2]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else if(board[4][5].contains("w"))//19
                        {
                            if(board[5][6].contains("."))//24
                            {
                                board[3][4]=".";
                                board[4][5]=".";
                                board[5][6]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                    if(mover.contains("16"))
                    {
                        if(board[4][5].contains("w"))//19
                        {
                            if(board[5][4].contains("."))//23
                            {
                                board[3][6]=".";
                                board[4][5]=".";
                                board[5][4]="b";
                                
                                for( i = 0; i <8; i++)
                                {
                                    for( j = 0; j <8; j++)
                                    {
                                        System.out.print(board[i][j]+" ");
                                    }
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Location Occupied!");
                                System.out.println("Jump move can not be executed!");
                            }
                        }
                        else
                        {
                            System.out.println("No Opponents To Kill!");
                            System.out.println("Jump move can not be executed!");
                        }
                    }
                }
            }
        }// Black
    }
}
