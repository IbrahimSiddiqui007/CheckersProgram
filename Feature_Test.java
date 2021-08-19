//Basic Menu concept (By Taha and Julian)
//Within the main method we have added a switch statment with the options the usercan choose from
import java.util.Scanner;

public class  Main 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String option;

		System.out.println("Welcome to the Program \n");

		System.out.println("Please enter the appropriate number for the option that you want to select: \n" +
			"1 : Start a new Game \n" +
			"2 : Start a randomized game \n" +
			"3 : quit the program \n");
		option = input.nextLine();

		switch (option)
		{
		    case "1":
		    {
			System.out.println("You have chosen to start a New Game");
			System.out.println("Your New Game will start now \n");
			break;
		    }

		    case "2":
		    {
			System.out.println("You have chosen to start a Randomized Game");
			System.out.println("Your Randomized Game will start now \n");
			randomizedBoard();
			break;
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
