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
