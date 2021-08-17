// Reference Board        
// This is used by the user as a reference so that they can make their moves
String [] test = {"-1-2-3-4\n5-6-7-8-\n-9-10-11-12\n13-14-15-16-\n-17-18-19-20\n21-22-23-24-\n-25-26-27-28\n29-30-31-32-"};
        System.out.println(Arrays.deepToString(test).replaceAll("(^\\[|\\]$)", ""));

// Plain Board
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
    System.out.println("hey");
    System.out.println("yo");      //Akshi here
       
  }
//
