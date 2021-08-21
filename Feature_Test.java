//Basic Menu concept (By Taha and Julian)
//Within the main method we have added a switch statment with the options the usercan choose from
import java.util.Scanner;

public class  Main 
{
	
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Program \n");

        System.out.println("Please enter the appropriate number for the option that you want to select: \n" +
                "1 : Start a new Game \n" +
                "2 : Start a randomized game \n" +
                "3 : quit the program");
        String option = input.nextLine();

        switch (option)
        {
            case "1":
            {
                System.out.println("You have chosen to start a New Game");
                System.out.println("Your New Game will start now \n");

                System.out.println("Please enter the color of the pieces that you would like to play with: \n" +
                        "B : Black pieces \n" +
                        "W : White pieces");
                String userColor = input.nextLine();

                String toLowerCase = userColor.toLowerCase();

                if (userColor.equals("B") || userColor.equals("b") || userColor.equals("W") || userColor.equals("w") || toLowerCase.contains("White") || toLowerCase.contains("Black"))
                {
                    System.out.println(userColor);
                    break;
                }
                else
                {
                    System.out.println("Sorry you have chosen a color that does not exist");
                    break;
                }
            }

            case "2":
            {
                System.out.println("You have chosen to start a Randomized Game");
                System.out.println("Your Randomized Game will start now \n");

                System.out.println("Please enter the color of the pieces that you would like to play with: \n" +
                        "B : Black pieces \n" +
                        "W : White pieces");
                String userColor = input.nextLine();

                if (userColor.equals("B") || userColor.equals("b") || userColor.equals("W") || userColor.equals("w") || userColor.contains("White") || userColor.contains("Black") || userColor.contains("white") || userColor.contains("black"))
                {
                   /* System.out.println("Would you like a reference board: \n" +
                            "Y : Yes \n" +
                            "N : No");
                    String refBoardChoice = input.nextLine();

                    if (refBoardChoice.contains("Y") || refBoardChoice.contains("y"))
                    {
                        String removingExtras = (Arrays.deepToString(referenceBoard).replaceAll("(^\\[|\\]$)", "").replace(",", ""));
                        System.out.println("You will continue with the game with a reference board");
                        System.out.println(removingExtras);
                        System.out.println("\n");
                    }
                    else if (refBoardChoice.contains("N") || refBoardChoice.contains("n"))
                    {
                        System.out.println("You will continue with the game without a reference board");
                    }
                    */
                    System.out.println("How many moves would you like to make in total ?");
                    int movesTotal = input.nextInt();

                    for (int i = 0; i < movesTotal; i++)
                    {
                        System.out.println("Please enter your move: ");
                        String move = input.nextLine();

                    }
                    randomizedBoard();
                    break;
                }
                else
                {
                    System.out.println("Sorry you have chosen a color that does not exist");
                    break;
                }
            }
            case "3":
            {
                System.out.println("You have chosen to Quit the Program");
                break;
            }
            default:
            {
                System.out.println("Sorry you have chosen an option that does not exist");
                break;
            }
        }
    }
}
//

// Reference Board (By Ibrahim)       
// This is used by the user as a reference so that they can make their moves
 String [] referenceBoard = {" -","01","-","02","-","03","-","04\n","05","-","06","-","07","-","08","-\n","-","09","-","10","-","11","-","12\n","13","-","14","-","15","-","16","-\n","-","17","-","18","-","19","-","20\n","21","-","22","-","23","-","24","-"};
        String removingExtras = (Arrays.deepToString(referenceBoard).replaceAll("(^\\[|\\]$)", "").replace(",", ""));
        System.out.println(removingExtras);
//

// Plain Board (By Akshita)
// This is a plain board, It is used so that we can create a randomized and a new game board on top of it.
String [][] board = new String [8][8];
  for (int row = 0; row < 8; row++)
  {
    for (int column = 0; column < 8; column++)
    {
      board[row][column] = (row + column) % 2 ==0 ? "-" : ".";
    }
  }
  for (int row = 0; row < 8; row++)
  {
    for (int column = 0; column < 8; column++)
    {
      System.out.print(board[row][column] + " ")
    }
    System.out.println(); 
  }
//

// Randomized board (By Ibrahim)
// This is a board that going to be used for the Randomized board option. It uses the original 2d Array 

public static void randomizedBoard()
    {
        ThreadLocalRandom random = ThreadLocalRandom.current();
	
	int row;
	int column;
        int randomRow = (int)(Math.random()*8);
        int randomColumn = (int)(Math.random()*8);

        String [][] board = new String [8][8];
        for (row = 0; row < 8; row++)
        {
            for (column = 0; column < 8; column++)
            {
                board[row][column] = (row + column) % 2 ==0 ? "-" : ".";
            }
        }

        for (int i = 0; i < 8; i++)
        {
            randomRow = random.nextInt(1, 6);
            randomColumn = (int)(Math.random()*8);
            if (board[randomRow][randomColumn].equals("."))
            {
                board[randomRow][randomColumn] = "w";
            }
        }

        for (int i = 0; i < 8; i++)
        {
            randomRow = random.nextInt(1, 6);
            randomColumn = (int)(Math.random()*8);
            if (board[randomRow][randomColumn].equals("."))
            {
                board[randomRow][randomColumn] = "b";
            }
        }

        for (int i = 0; i < 4; i++)
        {
            randomRow = random.nextInt(0, 6);
            randomColumn = (int)(Math.random()*8);
            if (board[randomRow][randomColumn].equals("."))
            {
                board[randomRow][randomColumn] = "W";
            }
        }
        for (int i = 0; i < 4; i++)
        {
            randomRow = random.nextInt(1, 7);
            randomColumn = (int)(Math.random()*8);
            if (board[randomRow][randomColumn].equals("."))
            {
                board[randomRow][randomColumn] = "B";
            }
        }
        for (row = 0; row < 8; row++)
        {
            for (column = 0; column < 8; column++)
            {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }
//


// The main program (By Ibrahim, Akshita, Julien and Taha)
// This is the main program with everything that we have done up until now
package checkerProgram;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Feature_Test {
    public static int row;
    public static int column;
    public static int randomRow;
    public static int randomColumn;
    public static String move;
    public static String [][] board = new String[8][8];

    public static void workedBoard()
    {
        System.out.println("This the board before doing any moves ");
        randomizedBoard(board);

    }

    public static void randomizedBoard(String [][] board)
    {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        randomRow = (int) (Math.random() * 8);
        randomColumn = (int) (Math.random() * 8);

        for (row = 0; row < 8; row++)
        {
            for (column = 0; column < 8; column++)
            {
                board[row][column] = (row + column) % 2 == 0 ? "-" : ".";
            }
        }

        for (int i = 0; i < 8; i++)
        {
            randomRow = random.nextInt(1, 6);
            randomColumn = (int) (Math.random() * 8);
		
            if (board[randomRow][randomColumn].equals("."))
            {
                board[randomRow][randomColumn] = "w";
            }
        }

        for (int i = 0; i < 8; i++) 
	{
            randomRow = random.nextInt(1, 6);
            randomColumn = (int) (Math.random() * 8);
		
            if (board[randomRow][randomColumn].equals(".")) 
	    {
                board[randomRow][randomColumn] = "b";
            }
        }

        for (int i = 0; i < 4; i++) 
	{
            randomRow = random.nextInt(0, 6);
            randomColumn = (int) (Math.random() * 8);
		
            if (board[randomRow][randomColumn].equals(".")) 
	    {
                board[randomRow][randomColumn] = "W";
            }
        }
        for (int i = 0; i < 4; i++) 
	{
            randomRow = random.nextInt(1, 7);
            randomColumn = (int) (Math.random() * 8);
		
            if (board[randomRow][randomColumn].equals(".")) 
	    {
                board[randomRow][randomColumn] = "B";
            }
        }

        for (row = 0; row < 8; row++) 
	{
            for (column = 0; column < 8; column++) 
	    {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Program \n");

        System.out.println("Please enter the appropriate number for the option that you want to select: \n" +
                "1 : Start a new Game \n" +
                "2 : Start a randomized game \n" +
                "3 : quit the program");
        String option = input.nextLine();

        switch (option)
        {
            case "1":
            {
                System.out.println("You have chosen to start a New Game");
                System.out.println("Your New Game will start now \n");

                System.out.println("Please enter the color of the pieces that you would like to play with: \n" +
                        "B : Black pieces \n" +
                        "W : White pieces");
                String userColor = input.nextLine();

                String toLowerCase = userColor.toLowerCase();

                if (userColor.equals("B") || userColor.equals("b") || userColor.equals("W") || userColor.equals("w") || toLowerCase.contains("White") || toLowerCase.contains("Black"))
                {
                    System.out.println("How many moves would you like to make in total ?");
                    int movesTotal = input.nextInt();

                    for (int i = 0; i < movesTotal; i++)
                    {
                        System.out.println("Please enter your move: ");
                        move = input.nextLine();

                        if (move.contains("-"))
                        {
                            System.out.println("You have chosen to make a standard move");
                            workedBoard();
                        }
                        else if (move.contains("x"))
                        {
                            System.out.println("You have chosen to make a jump move");

                        }
                    }
                    break;
                }
                else
                {
                    System.out.println("Sorry you have chosen a color that does not exist");
                    break;
                }
            }

            case "2":
            {
                System.out.println("You have chosen to start a Randomized Game");
                System.out.println("Your Randomized Game will start now \n");

                System.out.println("Please enter the color of the pieces that you would like to play with: \n" +
                        "B : Black pieces \n" +
                        "W : White pieces");
                String userColor = input.nextLine();

                if (userColor.equals("B") || userColor.equals("b") || userColor.equals("W") || userColor.equals("w") || userColor.contains("White") || userColor.contains("Black") || userColor.contains("white") || userColor.contains("black"))
                {
                   /* System.out.println("Would you like a reference board: \n" +
                            "Y : Yes \n" +
                            "N : No");
                    String refBoardChoice = input.nextLine();

                    if (refBoardChoice.contains("Y") || refBoardChoice.contains("y"))
                    {
                        String removingExtras = (Arrays.deepToString(referenceBoard).replaceAll("(^\\[|\\]$)", "").replace(",", ""));
                        System.out.println("You will continue with the game with a reference board");
                        System.out.println(removingExtras);
                        System.out.println("\n");
                    }
                    else if (refBoardChoice.contains("N") || refBoardChoice.contains("n"))
                    {
                        System.out.println("You will continue with the game without a reference board");
                    }
                    */
                    System.out.println("How many moves would you like to make in total ?");
                    int movesTotal = input.nextInt();

                    for (int i = 0; i < movesTotal; i++)
                    {
                        System.out.println("Please enter your move: ");
                        move = input.nextLine();

                        if (move.contains("-"))
                        {
                            System.out.println("You have chosen to make a standard move");
                            workedBoard();
                        }
                        else if (move.contains("x"))
                        {
                            System.out.println("You have chosen to make a jump move");

                        }
                    }
                    break;
                }
                else
                {
                    System.out.println("Sorry you have chosen a color that does not exist");
                    break;
                }
            }
            case "3":
            {
                System.out.println("You have chosen to Quit the Program");
                break;
            }
            default:
            {
                System.out.println("Sorry you have chosen an option that does not exist");
                break;
            }
        }
    }
}
//
