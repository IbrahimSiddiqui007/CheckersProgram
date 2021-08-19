//Basic Menu concept (By Taha and Julian)
//Within the main method we have added a switch statment with the options the usercan choose from
import java.util.Scanner;

public class  Main {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in); 
    String option; 
    String randomgame;
    String playagain;

    System.out.println("Welcome \n"); 

    System.out.println("Please select how you would like the game to start: \n");
    
    System.out.println("Enter 1 to start a 'New Game'\nEnter 2 to play a 'Randomized Game' \n");
    option = input.nextLine();
  
   switch (option)
   {
     case "1": 
     {
     System.out.println("Your New Game will start now"); 
     break;
     }

     case "2":
     {
     System.out.println("Enter A to resume a midway game\nEnter B to resume a midway finished game\n");
     randomgame = input.nextLine();
     
     }
     //This is a another switch statemnet added into the original one, for the user to select what randomized game they would like to choose
        switch (randomgame)
   {
     case "A": 
     {
       System.out.println("Your mid game will start now");
       break;
     }
     case "B": 
     {
       System.out.println("Your mid end game will start now");
       break;
     }
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

// Plain Board V2 (By Ibrahim)
// This is a different way of making the Plain Board
String [] referenceBoard = {" -",".","-",".","-",".","-",".\n",".","-",".","-",".","-",".","-\n","-",".","-",".","-",".","-",".\n",".","-",".","-",".","-",".","-\n","-",".","-",".","-",".","-",".\n",".","-",".","-",".","-",".","-"};
        String removingExtras = (Arrays.deepToString(referenceBoard).replaceAll("(^\\[|\\]$)", "").replace(",", ""));
        System.out.println(removingExtras);

// Randomized board v2 (By Ibrahim)
// This is a board that going to be used for the Randomized board option
 String [] plainBoard = {" -",".","-",".","-",".","-",".\n",".","-",".","-",".","-",".","-\n","-",".","-",".","-",".","-",".\n",".","-",".","-",".","-",".","-\n","-",".","-",".","-",".","-",".\n",".","-",".","-",".","-",".","-\n","-",".","-",".","-",".","-",".\n",".","-",".","-",".","-",".","-",""};
       String removingExtras = (Arrays.toString(plainBoard).replaceAll("(^\\[|\\]$)", "").replace(",", ""));
       int smallWhiteRandom = (int) (Math.random()*9);

        for (int i = 0; i < smallWhiteRandom; i++)
        {
            int smallWhitePosition = (int) (Math.random()*65);
            if (plainBoard[smallWhitePosition].equals("."))
            {
                plainBoard[smallWhitePosition] = "w";
            }
            else if (plainBoard[smallWhitePosition].equals("-"))
            {
                    plainBoard[smallWhitePosition+1] = "w";
            }
            else if (plainBoard[smallWhitePosition].contains("-") && (smallWhitePosition == 15 || smallWhitePosition == 31 || smallWhitePosition == 47 || smallWhitePosition == 63))
            {
                plainBoard[smallWhitePosition+1] = "w\n";
            }
            else if (plainBoard[smallWhitePosition].contains(".") && (smallWhitePosition == 7 || smallWhitePosition == 23 || smallWhitePosition == 39 || smallWhitePosition == 55))
            {
                plainBoard[smallWhitePosition] = "w\n";
            }
        }
        String removingExtras = (Arrays.toString(plainBoard).replaceAll("(^\\[|\\]$)", "").replace(",", ""));
        System.out.println(removingExtras);
//
