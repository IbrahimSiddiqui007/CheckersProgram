package checkerProgram;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Feature_Test {
    public static int row;
    public static int column;
    public static int randomRow;
    public static int randomColumn;
    public static String [][] board = new String[8][8];
    public static String temp;
    public static String [][] randomBoard;
    public static String [][] plainStandardBoard;
    public static Scanner input = new Scanner(System.in);
    public static String [][] randomJumpBoard;

    public static void finalStandardRandomBoard(String move)
    {
        int cut = move.indexOf("-");
        String originalLocation = move.substring(0, cut);
        String endLocation = move.substring(cut+1);

        if (originalLocation.equals("1"))
        {
            if (endLocation.equals("5"))
            {
                temp = randomBoard[1][0];
                randomBoard[1][0] = randomBoard[0][1];
                randomBoard[0][1] = temp;
            }
            else if (endLocation.equals("6"))
            {
                temp = randomBoard[1][2];
                randomBoard[1][2] = randomBoard[0][1];
                randomBoard[0][1] = temp;
            }
        }

        if (originalLocation.equals("2"))
        {
            if (endLocation.equals("6"))
            {
                temp = randomBoard[1][2];
                randomBoard[1][2] = randomBoard[0][3];
                randomBoard[0][3] = temp;
            }
            else if (endLocation.equals("7"))
            {
                temp = randomBoard[1][4];
                randomBoard[1][4] = randomBoard[0][3];
                randomBoard[0][3] = temp;
            }
        }
        
        if (originalLocation.equals("3"))
        {
            if (endLocation.equals("7"))
            {
                temp = randomBoard[1][4];
                randomBoard[1][4] = randomBoard[0][5];
                randomBoard[0][5] = temp;
            }
            else if (endLocation.equals("8"))
            {
                temp = randomBoard[1][6];
                randomBoard[1][6] = randomBoard[0][5];
                randomBoard[0][5] = temp;
            }
        }

        if (originalLocation.equals("4") && endLocation.equals("8"))
        {
                temp = randomBoard[1][6];
                randomBoard[1][6] = randomBoard[0][7];
                randomBoard[0][7] = temp;
        }

        if (originalLocation.equals("5"))
        {
            if (endLocation.equals("9"))
            {
                temp = randomBoard[2][1];
                randomBoard[2][1] = randomBoard[1][0];
                randomBoard[1][0] = temp;
            }
            else if (endLocation.equals("1"))
            {
                temp = randomBoard[0][1];
                randomBoard[0][1] = randomBoard[1][0];
                randomBoard[1][0] = temp;
            }
        }

        if (originalLocation.equals("6"))
        {
            if (endLocation.equals("9"))
            {
                temp = randomBoard[2][1];
                randomBoard[2][1] = randomBoard[1][2];
                randomBoard[1][2] = temp;
            }
            else if (endLocation.equals("10"))
            {
                temp = randomBoard[2][3];
                randomBoard[2][3] = randomBoard[1][2];
                randomBoard[1][2] = temp;
            }
            else if (endLocation.equals("1"))
            {
                temp = randomBoard[0][1];
                randomBoard[0][1] = randomBoard[1][2];
                randomBoard[1][2] = temp;
            }
            else if (endLocation.equals("2"))
            {
                temp = randomBoard[0][3];
                randomBoard[0][3] = randomBoard[1][2];
                randomBoard[1][2] = temp;
            }
        }
        
        if (originalLocation.equals("7"))
        {
            if (endLocation.equals("10"))
            {
                temp = randomBoard[2][3];
                randomBoard[2][3] = randomBoard[1][4];
                randomBoard[1][4] = temp;
            }
            else if (endLocation.equals("11"))
            {
                temp = randomBoard[2][5];
                randomBoard[2][5] = randomBoard[1][4];
                randomBoard[1][4] = temp;
            }
            else if (endLocation.equals("2"))
            {
                temp = randomBoard[0][3];
                randomBoard[0][3] = randomBoard[1][4];
                randomBoard[1][4] = temp;
            }
            else if (endLocation.equals("3"))
            {
                temp = randomBoard[0][5];
                randomBoard[0][5] = randomBoard[1][4];
                randomBoard[1][4] = temp;
            }
        }

        if (originalLocation.equals("8"))
        {
            if (endLocation.equals("11"))
            {
                temp = randomBoard[2][5];
                randomBoard[2][5] = randomBoard[1][6];
                randomBoard[1][6] = temp;
            }
            else if (endLocation.equals("12"))
            {
                temp = randomBoard[2][7];
                randomBoard[2][7] = randomBoard[1][6];
                randomBoard[1][6] = temp;
            }
            else if (endLocation.equals("3"))
            {
                temp = randomBoard[0][5];
                randomBoard[0][5] = randomBoard[1][6];
                randomBoard[1][6] = temp;
            }
            else if (endLocation.equals("4"))
            {
                temp = randomBoard[0][7];
                randomBoard[0][7] = randomBoard[1][6];
                randomBoard[1][6] = temp;
            }
        }
        
        if (originalLocation.equals("9"))
        {
            if (endLocation.equals("13"))
            {
                temp = randomBoard[3][0];
                randomBoard[3][0] = randomBoard[2][1];
                randomBoard[2][1] = temp;
            }
            else if (endLocation.equals("14"))
            {
                temp = randomBoard[3][2];
                randomBoard[3][2] = randomBoard[2][1];
                randomBoard[2][1] = temp;
            }
            if (endLocation.equals("5"))
            {
                temp = randomBoard[1][0];
                randomBoard[1][0] = randomBoard[2][1];
                randomBoard[2][1] = temp;
            }
            else if (endLocation.equals("6"))
            {
                temp = randomBoard[1][2];
                randomBoard[1][2] = randomBoard[2][1];
                randomBoard[2][1] = temp;
            }
        }

        if (originalLocation.equals("10"))
        {
            if (endLocation.equals("14"))
            {
                temp = randomBoard[3][2];
                randomBoard[3][2] = randomBoard[2][3];
                randomBoard[2][3] = temp;
            }
            else if (endLocation.equals("15"))
            {
                temp = randomBoard[3][4];
                randomBoard[3][4] = randomBoard[2][3];
                randomBoard[2][3] = temp;
            }
            else if (endLocation.equals("6"))
            {
                temp = randomBoard[1][2];
                randomBoard[1][2] = randomBoard[2][3];
                randomBoard[2][3] = temp;
            }
            else if (endLocation.equals("7"))
            {
                temp = randomBoard[1][4];
                randomBoard[1][4] = randomBoard[2][3];
                randomBoard[2][3] = temp;
            }
        }
        
        if (originalLocation.equals("11"))
        {
            if (endLocation.equals("15"))
            {
                temp = randomBoard[3][4];
                randomBoard[3][4] = randomBoard[2][5];
                randomBoard[2][5] = temp;
            }
            else if (endLocation.equals("16"))
            {
                temp = randomBoard[3][6];
                randomBoard[3][6] = randomBoard[2][5];
                randomBoard[2][5] = temp;
            }
            else if (endLocation.equals("7"))
            {
                temp = randomBoard[1][4];
                randomBoard[1][4] = randomBoard[2][5];
                randomBoard[2][5] = temp;
            }
            else if (endLocation.equals("8"))
            {
                temp = randomBoard[1][6];
                randomBoard[1][6] = randomBoard[2][5];
                randomBoard[2][5] = temp;
            }
        }

        if (originalLocation.equals("12"))
        {
            if (endLocation.equals("16"))
            {
                temp = randomBoard[3][6];
                randomBoard[3][6] = randomBoard[2][7];
                randomBoard[2][7] = temp;
            }
            else if (endLocation.equals("8"))
            {
                temp = randomBoard[1][6];
                randomBoard[1][6] = randomBoard[2][7];
                randomBoard[2][7] = temp;
            }
        }

        if (originalLocation.equals("13"))
        {
            if (endLocation.equals("9"))
            {
                temp = randomBoard[2][1];
                randomBoard[2][1] = randomBoard[3][0];
                randomBoard[3][0] = temp;
            }
            else if (endLocation.equals("17"))
            {
                temp = randomBoard[4][1];
                randomBoard[4][1] = randomBoard[3][0];
                randomBoard[1][0] = temp;
            }
        }

        if (originalLocation.equals("14"))
        {
            if (endLocation.equals("9"))
            {
                temp = randomBoard[2][1];
                randomBoard[2][1] = randomBoard[3][2];
                randomBoard[3][2] = temp;
            }
            else if (endLocation.equals("10"))
            {
                temp = randomBoard[2][3];
                randomBoard[2][3] = randomBoard[3][2];
                randomBoard[3][2] = temp;
            }
            else if (endLocation.equals("17"))
            {
                temp = randomBoard[4][1];
                randomBoard[4][1] = randomBoard[3][2];
                randomBoard[3][2] = temp;
            }
            else if (endLocation.equals("18"))
            {
                temp = randomBoard[4][3];
                randomBoard[4][3] = randomBoard[3][2];
                randomBoard[3][2] = temp;
            }
        }
        
        if (originalLocation.equals("15"))
        {
            if (endLocation.equals("18"))
            {
                temp = randomBoard[4][3];
                randomBoard[4][3] = randomBoard[3][4];
                randomBoard[3][4] = temp;
            }
            else if (endLocation.equals("18"))
            {
                temp = randomBoard[4][5];
                randomBoard[4][5] = randomBoard[3][4];
                randomBoard[3][4] = temp;
            }
            else if (endLocation.equals("10"))
            {
                temp = randomBoard[2][3];
                randomBoard[2][3] = randomBoard[3][4];
                randomBoard[3][4] = temp;
            }
            else if (endLocation.equals("11"))
            {
                temp = randomBoard[2][5];
                randomBoard[2][5] = randomBoard[3][4];
                randomBoard[3][4] = temp;
            }
        }

        if (originalLocation.equals("16"))
        {
            if (endLocation.equals("11"))
            {
                temp = randomBoard[2][5];
                randomBoard[2][5] = randomBoard[3][6];
                randomBoard[3][6] = temp;
            }
            else if (endLocation.equals("12"))
            {
                temp = randomBoard[2][7];
                randomBoard[2][7] = randomBoard[3][6];
                randomBoard[3][6] = temp;
            }
            else if (endLocation.equals("19"))
            {
                temp = randomBoard[4][5];
                randomBoard[4][5] = randomBoard[3][6];
                randomBoard[3][6] = temp;
            }
            else if (endLocation.equals("20"))
            {
                temp = randomBoard[4][7];
                randomBoard[4][7] = randomBoard[3][6];
                randomBoard[3][6] = temp;
            }
        }

        if (originalLocation.equals("17"))
        {
            if (endLocation.equals("13"))
            {
                temp = randomBoard[3][0];
                randomBoard[3][0] = randomBoard[4][1];
                randomBoard[4][1] = temp;
            }
            else if (endLocation.equals("14"))
            {
                temp = randomBoard[3][2];
                randomBoard[3][2] = randomBoard[4][1];
                randomBoard[4][1] = temp;
            }
            if (endLocation.equals("21"))
            {
                temp = randomBoard[5][0];
                randomBoard[5][0] = randomBoard[4][1];
                randomBoard[4][1] = temp;
            }
            else if (endLocation.equals("22"))
            {
                temp = randomBoard[5][2];
                randomBoard[5][2] = randomBoard[4][1];
                randomBoard[4][1] = temp;
            }
        }

        if (originalLocation.equals("18"))
        {
            if (endLocation.equals("14"))
            {
                temp = randomBoard[3][2];
                randomBoard[3][2] = randomBoard[4][3];
                randomBoard[4][3] = temp;
            }
            else if (endLocation.equals("15"))
            {
                temp = randomBoard[3][4];
                randomBoard[3][4] = randomBoard[4][3];
                randomBoard[4][3] = temp;
            }
            else if (endLocation.equals("22"))
            {
                temp = randomBoard[5][2];
                randomBoard[5][2] = randomBoard[4][3];
                randomBoard[4][3] = temp;
            }
            else if (endLocation.equals("23"))
            {
                temp = randomBoard[5][4];
                randomBoard[5][4] = randomBoard[4][3];
                randomBoard[4][3] = temp;
            }
        }
        
        if (originalLocation.equals("19"))
        {
            if (endLocation.equals("15"))
            {
                temp = randomBoard[3][4];
                randomBoard[3][4] = randomBoard[4][5];
                randomBoard[4][5] = temp;
            }
            else if (endLocation.equals("16"))
            {
                temp = randomBoard[3][6];
                randomBoard[3][6] = randomBoard[4][5];
                randomBoard[4][5] = temp;
            }
            else if (endLocation.equals("23"))
            {
                temp = randomBoard[5][4];
                randomBoard[5][4] = randomBoard[4][5];
                randomBoard[4][5] = temp;
            }
            else if (endLocation.equals("24"))
            {
                temp = randomBoard[5][6];
                randomBoard[5][6] = randomBoard[4][5];
                randomBoard[4][5] = temp;
            }
        }

        if (originalLocation.equals("20"))
        {
            if (endLocation.equals("16"))
            {
                temp = randomBoard[3][6];
                randomBoard[3][6] = randomBoard[4][7];
                randomBoard[4][7] = temp;
            }
            else if (endLocation.equals("24"))
            {
                temp = randomBoard[5][6];
                randomBoard[5][6] = randomBoard[4][7];
                randomBoard[4][7] = temp;
            }
        }

        if (originalLocation.equals("21"))
        {
            if (endLocation.equals("17"))
            {
                temp = randomBoard[4][1];
                randomBoard[4][1] = randomBoard[5][0];
                randomBoard[5][0] = temp;
            }
            else if (endLocation.equals("25"))
            {
                temp = randomBoard[6][1];
                randomBoard[6][1] = randomBoard[5][0];
                randomBoard[5][0] = temp;
            }
        }

        if (originalLocation.equals("22"))
        {
            if (endLocation.equals("17"))
            {
                temp = randomBoard[4][1];
                randomBoard[4][1] = randomBoard[5][2];
                randomBoard[5][2] = temp;
            }
            else if (endLocation.equals("18"))
            {
                temp = randomBoard[4][3];
                randomBoard[4][3] = randomBoard[5][2];
                randomBoard[5][2] = temp;
            }
            if (endLocation.equals("25"))
            {
                temp = randomBoard[6][1];
                randomBoard[6][1] = randomBoard[5][2];
                randomBoard[5][2] = temp;
            }
            else if (endLocation.equals("26"))
            {
                temp = randomBoard[6][3];
                randomBoard[6][3] = randomBoard[5][2];
                randomBoard[5][2] = temp;
            }
        }

        if (originalLocation.equals("23"))
        {
            if (endLocation.equals("18"))
            {
                temp = randomBoard[4][3];
                randomBoard[4][3] = randomBoard[5][4];
                randomBoard[5][4] = temp;
            }
            else if (endLocation.equals("19"))
            {
                temp = randomBoard[4][5];
                randomBoard[4][5] = randomBoard[5][4];
                randomBoard[5][4] = temp;
            }
            else if (endLocation.equals("26"))
            {
                temp = randomBoard[6][3];
                randomBoard[6][3] = randomBoard[5][4];
                randomBoard[5][4] = temp;
            }
            else if (endLocation.equals("27"))
            {
                temp = randomBoard[6][5];
                randomBoard[6][5] = randomBoard[5][4];
                randomBoard[5][4] = temp;
            }
        }
        
        if (originalLocation.equals("24"))
        {
            if (endLocation.equals("19"))
            {
                temp = randomBoard[4][5];
                randomBoard[4][5] = randomBoard[5][6];
                randomBoard[5][6] = temp;
            }
            else if (endLocation.equals("20"))
            {
                temp = randomBoard[4][7];
                randomBoard[4][7] = randomBoard[5][6];
                randomBoard[5][6] = temp;
            }
            else if (endLocation.equals("27"))
            {
                temp = randomBoard[6][5];
                randomBoard[6][5] = randomBoard[5][6];
                randomBoard[5][6] = temp;
            }
            else if (endLocation.equals("28"))
            {
                temp = randomBoard[6][7];
                randomBoard[6][7] = randomBoard[5][6];
                randomBoard[5][6] = temp;
            }
        }

        if (originalLocation.equals("25"))
        {
            if (endLocation.equals("21"))
            {
                temp = randomBoard[5][0];
                randomBoard[5][0] = randomBoard[6][1];
                randomBoard[6][1] = temp;
            }
            else if (endLocation.equals("22"))
            {
                temp = randomBoard[5][2];
                randomBoard[5][2] = randomBoard[6][1];
                randomBoard[6][1] = temp;
            }
            else if (endLocation.equals("29"))
            {
                temp = randomBoard[7][0];
                randomBoard[7][0] = randomBoard[6][1];
                randomBoard[6][1] = temp;
            }
            else if (endLocation.equals("30"))
            {
                temp = randomBoard[7][2];
                randomBoard[7][2] = randomBoard[6][1];
                randomBoard[6][1] = temp;
            }
        }
        
        if (originalLocation.equals("26"))
        {
            if (endLocation.equals("22"))
            {
                temp = randomBoard[5][2];
                randomBoard[5][2] = randomBoard[6][3];
                randomBoard[6][3] = temp;
            }
            else if (endLocation.equals("23"))
            {
                temp = randomBoard[5][4];
                randomBoard[5][4] = randomBoard[6][3];
                randomBoard[6][3] = temp;
            }
            if (endLocation.equals("30"))
            {
                temp = randomBoard[7][2];
                randomBoard[7][2] = randomBoard[6][3];
                randomBoard[6][3] = temp;
            }
            else if (endLocation.equals("31"))
            {
                temp = randomBoard[7][4];
                randomBoard[7][4] = randomBoard[6][3];
                randomBoard[6][3] = temp;
            }
        }

        if (originalLocation.equals("27"))
        {
            if (endLocation.equals("23"))
            {
                temp = randomBoard[5][4];
                randomBoard[5][4] = randomBoard[6][5];
                randomBoard[6][5] = temp;
            }
            else if (endLocation.equals("24"))
            {
                temp = randomBoard[5][6];
                randomBoard[5][6] = randomBoard[6][5];
                randomBoard[6][5] = temp;
            }
            else if (endLocation.equals("31"))
            {
                temp = randomBoard[7][4];
                randomBoard[7][4] = randomBoard[6][5];
                randomBoard[6][5] = temp;
            }
            else if (endLocation.equals("32"))
            {
                temp = randomBoard[7][6];
                randomBoard[7][6] = randomBoard[6][5];
                randomBoard[6][5] = temp;
            }
        }
        
        if (originalLocation.equals("28"))
        {
            if (endLocation.equals("24"))
            {
                temp = randomBoard[5][6];
                randomBoard[5][6] = randomBoard[6][7];
                randomBoard[6][7] = temp;
            }
            else if (endLocation.equals("32"))
            {
                temp = randomBoard[7][6];
                randomBoard[7][6] = randomBoard[6][7];
                randomBoard[6][7] = temp;
            }
        }

        if (originalLocation.equals("29") && endLocation.equals("25"))
        {
                temp = randomBoard[6][1];
                randomBoard[6][1] = randomBoard[7][0];
                randomBoard[7][0] = temp;
        }

        if (originalLocation.equals("30"))
        {
            if (endLocation.equals("25"))
            {
                temp = randomBoard[6][1];
                randomBoard[6][1] = randomBoard[7][2];
                randomBoard[7][2] = temp;
            }
            else if (endLocation.equals("26"))
            {
                temp = randomBoard[6][3];
                randomBoard[6][3] = randomBoard[7][2];
                randomBoard[7][2] = temp;
            }
        }

        if (originalLocation.equals("31"))
        {
            if (endLocation.equals("26"))
            {
                temp = randomBoard[6][3];
                randomBoard[6][3] = randomBoard[7][4];
                randomBoard[7][4] = temp;
            }
            else if (endLocation.equals("27"))
            {
                temp = randomBoard[6][5];
                randomBoard[6][5] = randomBoard[7][4];
                randomBoard[7][4] = temp;
            }
        }
        
        if (originalLocation.equals("32"))
        {
            if (endLocation.equals("27"))
            {
                temp = randomBoard[6][5];
                randomBoard[6][5] = randomBoard[7][6];
                randomBoard[7][6] = temp;
            }
            else if (endLocation.equals("28"))
            {
                temp = randomBoard[6][7];
                randomBoard[6][7] = randomBoard[7][6];
                randomBoard[7][6] = temp;
            }
        }

        for (row = 0; row < 8; row++)
        {
            for (column = 0; column < 8; column++)
            {
                System.out.print(randomBoard[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void finalJumpRandomBoard(String move)
    {
        System.out.println("This the board before doing any moves");
        randomJumpBoard = randomizedBoard();


        for (row = 0; row < 8; row++)
        {
            for (column = 0; column < 8; column++)
            {
                System.out.print(randomJumpBoard[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static void finalPlainBoard()
    {

    }
    public static String[][] plainBoard()
    {
        System.out.println("");
        for (row = 1; row < 3; row++)
        {
            for (column = 0; column < 8; column++)
            {
                board[row][column] = (row + column) % 2 == 0 ? "-" : "w";
            }
        }
        for (row = 3; row <5; row++)
        {
            for (column = 0; column < 8; column++)
            {
                board[row][column] = (row + column) % 2 == 0 ? "-" : ".";
            }
        }
        for (row = 5; row <7; row++)
        {
            for (column = 0; column < 8; column++)
            {
                board[row][column] = (row + column) % 2 == 0 ? "-" : "b";
            }
        }
        for (row = 7; row <=7; row++)
        {
            for (column = 0; column < 8; column++)
            {
                board[row][column] = (row + column) % 2 == 0 ? "-" : "B";
            }
        }
        for (row = 0; row <=0; row++)
        {
            for (column = 0; column < 8; column++)
            {
                board[row][column] = (row + column) % 2 == 0 ? "-" : "W";
            }
        }
        for (row = 0; row < 8; row++) {
            for (column = 0; column < 8; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
        return board;
    }

    public static String[][] randomizedBoard()
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

        for (int i = 0; i < 8; i++) {
            randomRow = random.nextInt(1, 6);
            randomColumn = (int) (Math.random() * 8);
            if (board[randomRow][randomColumn].equals(".")) {
                board[randomRow][randomColumn] = "b";
            }
        }

        for (int i = 0; i < 4; i++) {
            randomRow = random.nextInt(0, 6);
            randomColumn = (int) (Math.random() * 8);
            if (board[randomRow][randomColumn].equals(".")) {
                board[randomRow][randomColumn] = "W";
            }
        }
        for (int i = 0; i < 4; i++) {
            randomRow = random.nextInt(1, 7);
            randomColumn = (int) (Math.random() * 8);
            if (board[randomRow][randomColumn].equals(".")) {
                board[randomRow][randomColumn] = "B";
            }
        }

        for (row = 0; row < 8; row++) {
            for (column = 0; column < 8; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
        return board;
    }

    public static void main(String[] args)
    {

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
                    System.out.println("This the board before doing any moves");
                    plainStandardBoard = plainBoard();

                    System.out.println("How many moves would you like to make in total ?");
                    int movesTotal = input.nextInt();

                    for (int i = 0; i < movesTotal; i++)
                    {
                        input = new Scanner(System.in);
                        System.out.println("Please enter your move: ");
                        String move = input.nextLine();

                        if (move.contains("-"))
                        {
                            System.out.println("You have chosen to make a standard move");
                            finalPlainBoard();
                            break;
                        }
                        else if (move.contains("x"))
                        {
                            System.out.println("You have chosen to make a jump move");
                            finalPlainBoard();
                            break;
                        }
                    }
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
                    System.out.println("This the board before doing any moves");
                    randomBoard = randomizedBoard();

                    System.out.println("How many moves would you like to make in total ?");
                    int movesTotal = input.nextInt();

                    for (int i = 0; i < movesTotal; i++)
                    {
                        input = new Scanner(System.in);
                        System.out.println("Please enter your move: ");
                        String move = input.nextLine();

                        if (move.contains("-"))
                        {
                            System.out.println("You have chosen to make a standard move");
                            finalStandardRandomBoard(move);
                            break;
                        }
                        else if (move.contains("x"))
                        {
                            System.out.println("You have chosen to make a jump move");
                            finalJumpRandomBoard(move);
                            break;
                        }
                        break;
                    }
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


