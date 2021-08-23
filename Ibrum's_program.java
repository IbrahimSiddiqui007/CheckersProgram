package CheckersProgram;
import CheckersProgram.newgame;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Feature_Test {
    
    public static int row;
    public static int column;
    public static int randomRow;
    public static int randomColumn;
    public static String temp;
    public static String [][] randomBoard;
    public static String [][] plainStandardBoard;
    public static Scanner input = new Scanner(System.in);
    public static String [][] randomJumpBoard;
    public static String [][] board = new String[8][8];

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
            else if (endLocation.equals("5"))
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
                randomBoard[3][0] = temp;
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
            else if (endLocation.equals("19"))
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
            else if (endLocation.equals("21"))
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
            else if (endLocation.equals("25"))
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
            else if (endLocation.equals("30"))
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
        randomJumpBoard = randomBoard;

        int cut = move.indexOf("x");
        String originalLocation = move.substring(0, cut);
        String endLocation = move.substring(cut+1);

        if (originalLocation.equals("1"))
        {
            if (endLocation.equals("10") && randomJumpBoard[2][3].contains("."))
            {
                temp = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = randomJumpBoard[0][1];
                randomJumpBoard[0][1] = temp;
                randomJumpBoard[1][2] = randomJumpBoard[0][1];
            }
        }

        if (originalLocation.equals("2"))
        {
            if (endLocation.equals("9") && randomJumpBoard[2][1].contains("."))
            {
                temp = randomJumpBoard[2][1];
                randomJumpBoard[2][1] = randomJumpBoard[0][3];
                randomJumpBoard[0][3] = temp;
                randomJumpBoard[1][2] = randomJumpBoard[0][3];
            }
            else if (endLocation.equals("11") && randomJumpBoard[2][5].contains("."))
            {
                temp = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = randomJumpBoard[0][3];
                randomJumpBoard[0][3] = temp;
                randomJumpBoard[1][4] = randomJumpBoard[0][3];
            }
        }

        if (originalLocation.equals("3"))
        {
            if (endLocation.equals("10") && randomJumpBoard[2][3].contains("."))
            {
                temp = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = randomJumpBoard[0][5];
                randomJumpBoard[0][5] = temp;
                randomJumpBoard[1][4] = randomJumpBoard[0][5];
            }
            else if (endLocation.equals("12") && randomJumpBoard[2][3].contains("."))
            {
                temp = randomJumpBoard[2][7];
                randomJumpBoard[2][7] = randomJumpBoard[0][5];
                randomJumpBoard[0][5] = temp;
                randomJumpBoard[1][6] = randomJumpBoard[0][5];
            }
        }

        if (originalLocation.equals("4"))
        {
            if (endLocation.equals("11") && randomJumpBoard[2][5].contains("."))
            {
                temp = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = randomJumpBoard[0][7];
                randomJumpBoard[0][7] = temp;
                randomJumpBoard[1][6] = randomJumpBoard[0][7];
            }
        }

        if (originalLocation.equals("5"))
        {
            if (endLocation.equals("14") && randomJumpBoard[3][2].contains("."))
            {
                temp = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = randomJumpBoard[1][0];
                randomJumpBoard[1][0] = temp;
                randomJumpBoard[2][1] = randomJumpBoard[1][0];
            }
        }

        if (originalLocation.equals("6"))
        {
            if (endLocation.equals("13") && randomJumpBoard[3][0].contains("."))
            {
                temp = randomJumpBoard[3][0];
                randomJumpBoard[3][0] = randomJumpBoard[1][2];
                randomJumpBoard[1][2] = temp;
                randomJumpBoard[2][1] = randomJumpBoard[1][2];
            }
            else if (endLocation.equals("15") && randomJumpBoard[3][4].contains("."))
            {
                temp = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = randomJumpBoard[1][2];
                randomJumpBoard[1][2] = temp;
                randomJumpBoard[2][3] = randomJumpBoard[1][2];
            }
        }

        if (originalLocation.equals("7"))
        {
            if (endLocation.equals("14") && randomJumpBoard[3][2].contains("."))
            {
                temp = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = randomJumpBoard[1][4];
                randomJumpBoard[1][4] = temp;
                randomJumpBoard[2][3] = randomJumpBoard[1][4];
            }
            else if (endLocation.equals("16") && randomJumpBoard[3][6].contains("."))
            {
                temp = randomJumpBoard[3][6];
                randomJumpBoard[3][6] = randomJumpBoard[1][4];
                randomJumpBoard[1][4] = temp;
                randomJumpBoard[2][5] = randomJumpBoard[1][4];
            }
        }

        if (originalLocation.equals("8"))
        {
            if (endLocation.equals("15") && randomJumpBoard[3][4].contains("."))
            {
                temp = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = randomJumpBoard[1][6];
                randomJumpBoard[1][6] = temp;
                randomJumpBoard[2][5] = randomJumpBoard[1][6];
            }
        }

        if (originalLocation.equals("9"))
        {
            if (endLocation.equals("2") && randomJumpBoard[0][3].contains("."))
            {
                temp = randomJumpBoard[0][3];
                randomJumpBoard[0][3] = randomJumpBoard[2][1];
                randomJumpBoard[2][1] = temp;
                randomJumpBoard[1][2] = randomJumpBoard[2][1];
            }
            else if (endLocation.equals("18") && randomJumpBoard[4][3].contains("."))
            {
                temp = randomJumpBoard[3][6];
                randomJumpBoard[3][6] = randomJumpBoard[2][1];
                randomJumpBoard[2][1] = temp;
                randomJumpBoard[3][2] = randomJumpBoard[2][1];
            }
        }

        if (originalLocation.equals("10"))
        {
            if (endLocation.equals("1") && randomJumpBoard[0][1].contains("."))
            {
                temp = randomJumpBoard[0][1];
                randomJumpBoard[0][1] = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = temp;
                randomJumpBoard[1][2] = randomJumpBoard[2][3];
            }
            else if (endLocation.equals("3") && randomJumpBoard[0][5].contains("."))
            {
                temp = randomJumpBoard[0][5];
                randomJumpBoard[0][5] = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = temp;
                randomJumpBoard[1][4] = randomJumpBoard[2][3];
            }
            else if (endLocation.equals("17") && randomJumpBoard[4][1].contains("."))
            {
                temp = randomJumpBoard[4][1];
                randomJumpBoard[4][1] = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = temp;
                randomJumpBoard[3][2] = randomJumpBoard[2][3];
            }
            else if (endLocation.equals("19") && randomJumpBoard[4][5].contains("."))
            {
                temp = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = temp;
                randomJumpBoard[3][4] = randomJumpBoard[2][3];
            }
        }

        if (originalLocation.equals("11"))
        {
            if (endLocation.equals("2") && randomJumpBoard[0][3].contains("."))
            {
                temp = randomJumpBoard[0][3];
                randomJumpBoard[0][3] = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = temp;
                randomJumpBoard[1][4] = randomJumpBoard[2][5];
            }
            else if (endLocation.equals("4") && randomJumpBoard[0][7].contains("."))
            {
                temp = randomJumpBoard[0][7];
                randomJumpBoard[0][7] = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = temp;
                randomJumpBoard[1][6] = randomJumpBoard[2][5];
            }
            else if (endLocation.equals("18") && randomJumpBoard[4][3].contains("."))
            {
                temp = randomJumpBoard[4][3];
                randomJumpBoard[4][3] = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = temp;
                randomJumpBoard[3][4] = randomJumpBoard[2][5];
            }
            else if (endLocation.equals("20") && randomJumpBoard[4][7].contains("."))
            {
                temp = randomJumpBoard[4][7];
                randomJumpBoard[4][7] = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = temp;
                randomJumpBoard[3][6] = randomJumpBoard[2][5];
            }
        }

        if (originalLocation.equals("12"))
        {
            if (endLocation.equals("3") && randomJumpBoard[0][5].contains("."))
            {
                temp = randomJumpBoard[0][5];
                randomJumpBoard[0][5] = randomJumpBoard[2][7];
                randomJumpBoard[2][7] = temp;
                randomJumpBoard[1][6] = randomJumpBoard[2][7];
            }
            else if (endLocation.equals("19") && randomJumpBoard[4][5].contains("."))
            {
                temp = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = randomJumpBoard[2][7];
                randomJumpBoard[2][7] = temp;
                randomJumpBoard[3][6] = randomJumpBoard[2][7];
            }
        }

        if (originalLocation.equals("13"))
        {
            if (endLocation.equals("6") && randomJumpBoard[1][2].contains("."))
            {
                temp = randomJumpBoard[1][2];
                randomJumpBoard[1][2] = randomJumpBoard[3][0];
                randomJumpBoard[3][0] = temp;
                randomJumpBoard[2][1] = randomJumpBoard[3][0];
            }
            else if (endLocation.equals("22") && randomJumpBoard[5][2].contains("."))
            {
                temp = randomJumpBoard[5][2];
                randomJumpBoard[5][2] = randomJumpBoard[3][0];
                randomJumpBoard[3][0] = temp;
                randomJumpBoard[4][1] = randomJumpBoard[3][0];
            }
        }

        if (originalLocation.equals("14"))
        {
            if (endLocation.equals("5") && randomJumpBoard[1][0].contains("."))
            {
                temp = randomJumpBoard[1][0];
                randomJumpBoard[1][0] = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = temp;
                randomJumpBoard[2][1] = randomJumpBoard[3][2];
            }
            else if (endLocation.equals("7") && randomJumpBoard[1][4].contains("."))
            {
                temp = randomJumpBoard[1][4];
                randomJumpBoard[1][4] = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = temp;
                randomJumpBoard[2][3] = randomJumpBoard[3][2];
            }
            else if (endLocation.equals("21") && randomJumpBoard[5][0].contains("."))
            {
                temp = randomJumpBoard[5][0];
                randomJumpBoard[5][0] = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = temp;
                randomJumpBoard[4][1] = randomJumpBoard[3][2];
            }
            else if (endLocation.equals("23") && randomJumpBoard[5][4].contains("."))
            {
                temp = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = temp;
                randomJumpBoard[4][3] = randomJumpBoard[3][2];
            }
        }

        if (originalLocation.equals("15"))
        {
            if (endLocation.equals("6") && randomJumpBoard[1][2].contains("."))
            {
                temp = randomJumpBoard[1][2];
                randomJumpBoard[1][2] = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = temp;
                randomJumpBoard[2][3] = randomJumpBoard[3][4];
            }
            else if (endLocation.equals("8") && randomJumpBoard[1][6].contains("."))
            {
                temp = randomJumpBoard[1][6];
                randomJumpBoard[1][6] = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = temp;
                randomJumpBoard[2][5] = randomJumpBoard[3][4];
            }
            else if (endLocation.equals("21") && randomJumpBoard[5][2].contains("."))
            {
                temp = randomJumpBoard[5][2];
                randomJumpBoard[5][2] = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = temp;
                randomJumpBoard[4][3] = randomJumpBoard[3][4];
            }
            else if (endLocation.equals("24") && randomJumpBoard[5][6].contains("."))
            {
                temp = randomJumpBoard[5][6];
                randomJumpBoard[5][6] = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = temp;
                randomJumpBoard[4][5] = randomJumpBoard[3][4];
            }
        }

        if (originalLocation.equals("16"))
        {
            if (endLocation.equals("7") && randomJumpBoard[1][4].contains("."))
            {
                temp = randomJumpBoard[1][4];
                randomJumpBoard[1][4] = randomJumpBoard[3][6];
                randomJumpBoard[3][6] = temp;
                randomJumpBoard[2][5] = randomJumpBoard[3][6];
            }
            else if (endLocation.equals("23") && randomJumpBoard[5][4].contains("."))
            {
                temp = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = randomJumpBoard[3][6];
                randomJumpBoard[3][6] = temp;
                randomJumpBoard[4][5] = randomJumpBoard[3][6];
            }
        }

        if (originalLocation.equals("17"))
        {
            if (endLocation.equals("10") && randomJumpBoard[2][3].contains("."))
            {
                temp = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = randomJumpBoard[4][1];
                randomJumpBoard[4][1] = temp;
                randomJumpBoard[3][2] = randomJumpBoard[4][1];
            }
            else if (endLocation.equals("26") && randomJumpBoard[6][3].contains("."))
            {
                temp = randomJumpBoard[6][3];
                randomJumpBoard[6][3] = randomJumpBoard[4][1];
                randomJumpBoard[4][1] = temp;
                randomJumpBoard[5][2] = randomJumpBoard[4][1];
            }
        }

        if (originalLocation.equals("18"))
        {
            if (endLocation.equals("10") && randomJumpBoard[2][3].contains("."))
            {
                temp = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = randomJumpBoard[4][3];
                randomJumpBoard[4][3] = temp;
                randomJumpBoard[3][2] = randomJumpBoard[4][3];
            }
            else if (endLocation.equals("11") && randomJumpBoard[2][5].contains("."))
            {
                temp = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = randomJumpBoard[4][3];
                randomJumpBoard[4][3] = temp;
                randomJumpBoard[3][4] = randomJumpBoard[4][3];
            }
            else if (endLocation.equals("25") && randomJumpBoard[6][1].contains("."))
            {
                temp = randomJumpBoard[6][1];
                randomJumpBoard[6][1] = randomJumpBoard[4][3];
                randomJumpBoard[4][3] = temp;
                randomJumpBoard[5][2] = randomJumpBoard[4][3];
            }
            else if (endLocation.equals("27") && randomJumpBoard[6][5].contains("."))
            {
                temp = randomJumpBoard[6][5];
                randomJumpBoard[6][5] = randomJumpBoard[4][3];
                randomJumpBoard[4][3] = temp;
                randomJumpBoard[5][4] = randomJumpBoard[4][3];
            }
        }

        if (originalLocation.equals("19"))
        {
            if (endLocation.equals("10") && randomJumpBoard[2][3].contains("."))
            {
                temp = randomJumpBoard[2][3];
                randomJumpBoard[2][3] = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = temp;
                randomJumpBoard[3][4] = randomJumpBoard[4][5];
            }
            else if (endLocation.equals("12") && randomJumpBoard[2][7].contains("."))
            {
                temp = randomJumpBoard[2][7];
                randomJumpBoard[2][7] = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = temp;
                randomJumpBoard[3][6] = randomJumpBoard[4][5];
            }
            else if (endLocation.equals("26") && randomJumpBoard[6][3].contains("."))
            {
                temp = randomJumpBoard[6][3];
                randomJumpBoard[6][3] = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = temp;
                randomJumpBoard[5][4] = randomJumpBoard[4][5];
            }
            else if (endLocation.equals("28") && randomJumpBoard[6][7].contains("."))
            {
                temp = randomJumpBoard[6][7];
                randomJumpBoard[6][5] = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = temp;
                randomJumpBoard[5][6] = randomJumpBoard[4][5];
            }
        }
            if (originalLocation.equals("20"))
        {
            if (endLocation.equals("11") && randomJumpBoard[2][5].contains("."))
            {
                temp = randomJumpBoard[2][5];
                randomJumpBoard[2][5] = randomJumpBoard[4][7];
                randomJumpBoard[4][7] = temp;
                randomJumpBoard[4][1] = randomJumpBoard[4][7];
            }
            else if (endLocation.equals("27") && randomJumpBoard[6][5].contains("."))
            {
            	temp = randomJumpBoard[6][5];
                randomJumpBoard[6][5] = randomJumpBoard[4][7];
                randomJumpBoard[4][7] = temp;
                randomJumpBoard[5][6] = randomJumpBoard[4][7];
        }
        }
        if (originalLocation.equals("21"))
        {
            if (endLocation.equals("14") && randomJumpBoard[3][2].contains("."))
            {
                temp = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = randomJumpBoard[5][0];
                randomJumpBoard[5][0] = temp;
                randomJumpBoard[4][1] = randomJumpBoard[5][0];
            }
            else if (endLocation.equals("30") && randomJumpBoard[7][2].contains("."))
            {
            	temp = randomJumpBoard[7][2];
                randomJumpBoard[7][2] = randomJumpBoard[5][0];
                randomJumpBoard[5][0] = temp;
                randomJumpBoard[6][1] = randomJumpBoard[5][0];
        }
        }
        if (originalLocation.equals("22"))
        {
            if (endLocation.equals("15") && randomJumpBoard[3][4].contains("."))
            {
                temp = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = randomJumpBoard[5][2];
                randomJumpBoard[5][2] = temp;
                randomJumpBoard[4][3] = randomJumpBoard[5][2];
            }
            else if (endLocation.equals("13") && randomJumpBoard[3][0].contains("."))
            {
            	temp = randomJumpBoard[3][0];
                randomJumpBoard[3][0] = randomJumpBoard[5][2];
                randomJumpBoard[5][2] = temp;
                randomJumpBoard[4][1] = randomJumpBoard[5][2];
        }
            else if (endLocation.equals("31") && randomJumpBoard[7][4].contains("."))
            {
            	temp = randomJumpBoard[7][4];
                randomJumpBoard[7][4] = randomJumpBoard[5][2];
                randomJumpBoard[5][2] = temp;
                randomJumpBoard[6][3] = randomJumpBoard[5][2];
        }
            else if (endLocation.equals("29") && randomJumpBoard[7][0].contains("."))
            {
            	temp = randomJumpBoard[7][0];
                randomJumpBoard[7][0] = randomJumpBoard[5][2];
                randomJumpBoard[5][2] = temp;
                randomJumpBoard[6][1] = randomJumpBoard[5][2];
        }
        }
        if (originalLocation.equals("23"))
        {
            if (endLocation.equals("16") && randomJumpBoard[3][6].contains("."))
            {
                temp = randomJumpBoard[3][6];
                randomJumpBoard[3][6] = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = temp;
                randomJumpBoard[4][5] = randomJumpBoard[5][4];
            }
            else if (endLocation.equals("14") && randomJumpBoard[3][2].contains("."))
            {
            	temp = randomJumpBoard[3][2];
                randomJumpBoard[3][2] = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = temp;
                randomJumpBoard[4][3] = randomJumpBoard[5][4];
        }
            else if (endLocation.equals("32") && randomJumpBoard[7][6].contains("."))
            {
            	temp = randomJumpBoard[7][6];
                randomJumpBoard[7][6] = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = temp;
                randomJumpBoard[6][5] = randomJumpBoard[5][4];
        }
            else if (endLocation.equals("30") && randomJumpBoard[7][2].contains("."))
            {
            	temp = randomJumpBoard[7][2];
                randomJumpBoard[7][2] = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = temp;
                randomJumpBoard[6][3] = randomJumpBoard[5][4];
        }
        }
        if (originalLocation.equals("24"))
        {
            if (endLocation.equals("15") && randomJumpBoard[3][4].contains("."))
            {
                temp = randomJumpBoard[3][4];
                randomJumpBoard[3][4] = randomJumpBoard[5][6];
                randomJumpBoard[5][6] = temp;
                randomJumpBoard[4][5] = randomJumpBoard[5][6];
            }
            else if (endLocation.equals("31") && randomJumpBoard[7][4].contains("."))
            {
            	temp = randomJumpBoard[7][4];
                randomJumpBoard[7][4] = randomJumpBoard[5][6];
                randomJumpBoard[5][6] = temp;
                randomJumpBoard[6][5] = randomJumpBoard[5][6];
        }
        }
        if (originalLocation.equals("25"))
        {
            if (endLocation.equals("18") && randomJumpBoard[4][3].contains("."))
            {
                temp = randomJumpBoard[4][3];
                randomJumpBoard[4][3] = randomJumpBoard[6][1];
                randomJumpBoard[6][1] = temp;
                randomJumpBoard[5][2] = randomJumpBoard[6][1];
            }
            
        }
        if (originalLocation.equals("26"))
        {
            if (endLocation.equals("19") && randomJumpBoard[4][5].contains("."))
            {
                temp = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = randomJumpBoard[6][3];
                randomJumpBoard[6][3] = temp;
                randomJumpBoard[5][4] = randomJumpBoard[6][3];
            }
            else if (endLocation.equals("17") && randomJumpBoard[4][1].contains("."))
            {
            	temp = randomJumpBoard[4][1];
                randomJumpBoard[4][1] = randomJumpBoard[6][3];
                randomJumpBoard[6][3] = temp;
                randomJumpBoard[5][2] = randomJumpBoard[6][3];
        }
        }
        if (originalLocation.equals("27"))
        {
            if (endLocation.equals("18") && randomJumpBoard[4][3].contains("."))
            {
                temp = randomJumpBoard[4][3];
                randomJumpBoard[4][3] = randomJumpBoard[6][5];
                randomJumpBoard[6][5] = temp;
                randomJumpBoard[5][4] = randomJumpBoard[6][5];
            }
            else if (endLocation.equals("20") && randomJumpBoard[4][7].contains("."))
            {
            	temp = randomJumpBoard[4][7];
                randomJumpBoard[4][7] = randomJumpBoard[6][5];
                randomJumpBoard[6][5] = temp;
                randomJumpBoard[5][6] = randomJumpBoard[6][5];
        }
        }

        if (originalLocation.equals("28"))
        {
            if (endLocation.equals("19") && randomJumpBoard[4][5].contains("."))
            {
                temp = randomJumpBoard[4][5];
                randomJumpBoard[4][5] = randomJumpBoard[6][7];
                randomJumpBoard[6][7] = temp;
                randomJumpBoard[5][6] = randomJumpBoard[6][7];
            }
            
        }
        if (originalLocation.equals("29"))
        {
            if (endLocation.equals("22") && randomJumpBoard[5][2].contains("."))
            {
                temp = randomJumpBoard[5][2];
                randomJumpBoard[5][2] = randomJumpBoard[7][2];
                randomJumpBoard[7][2] = temp;
                randomJumpBoard[6][1] = randomJumpBoard[7][2];
            }
            
        }
        if (originalLocation.equals("30"))
        {
            if (endLocation.equals("21") && randomJumpBoard[5][0].contains("."))
            {
                temp = randomJumpBoard[5][0];
                randomJumpBoard[5][0] = randomJumpBoard[7][2];
                randomJumpBoard[7][2] = temp;
                randomJumpBoard[6][1] = randomJumpBoard[7][2];
            }
            else if (endLocation.equals("23") && randomJumpBoard[5][4].contains("."))
            {
            	temp = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = randomJumpBoard[7][2];
                randomJumpBoard[7][2] = temp;
                randomJumpBoard[6][3] = randomJumpBoard[7][2];
        }
        }
        if (originalLocation.equals("31"))
        {
            if (endLocation.equals("24") && randomJumpBoard[5][6].contains("."))
            {
                temp = randomJumpBoard[5][6];
                randomJumpBoard[5][6] = randomJumpBoard[7][4];
                randomJumpBoard[7][4] = temp;
                randomJumpBoard[6][5] = randomJumpBoard[7][4];
            }
            else if (endLocation.equals("22") && randomJumpBoard[5][2].contains("."))
            {
            	temp = randomJumpBoard[5][4];
                randomJumpBoard[5][2] = randomJumpBoard[7][4];
                randomJumpBoard[7][4] = temp;
                randomJumpBoard[6][3] = randomJumpBoard[7][4];
        }
        }
        
        if (originalLocation.equals("32"))
        {
            if (endLocation.equals("23") && randomJumpBoard[5][4].contains("."))
            {
                temp = randomJumpBoard[5][4];
                randomJumpBoard[5][4] = randomJumpBoard[7][6];
                randomJumpBoard[7][6] = temp;
                randomJumpBoard[6][5] = randomJumpBoard[7][6];
            }
        }

        for (row = 0; row < 8; row++)
        {
            for (column = 0; column < 8; column++)
            {
                System.out.print(randomJumpBoard[row][column] + " ");
            }
            System.out.println();
        }
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
                newgame game=new newgame();
                game.PlainBoard();
                break;
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

                    System.out.println("This the board before doing any moves");
                    randomBoard = randomizedBoard();

                    System.out.println("How many moves would you like to make in total ?");
                    int movesTotal = input.nextInt();

                    input = new Scanner(System.in);
                    System.out.println("Please enter your move: ");
                    String move = input.nextLine();

                    if (move.contains("-"))
                    {
                        System.out.println("You have chosen to make a standard move");

                        for (int i = 0; i < movesTotal; i++)
                        {
                            if (i == 0)
                            {
                                finalStandardRandomBoard(move);
                            }
                            else if (i > 0)
                            {
                                input = new Scanner(System.in);
                                System.out.println("Please enter your move: ");
                                move = input.nextLine();
                                finalStandardRandomBoard(move);
                            }
                            else if (move.contains("x") && i == 0)
                            {
                                finalJumpRandomBoard(move);
                            }
                            else if (move.contains("x") && i > 0)
                            {
                                input = new Scanner(System.in);
                                System.out.println("Please enter your move: ");
                                move = input.nextLine();
                                finalJumpRandomBoard(move);
                            }
                        }
                    }
                    else if (move.contains("x"))
                    {
                        System.out.println("You have chosen to make a jump move");

                        for (int i = 0; i < movesTotal; i++)
                        {
                            if (i == 0)
                            {
                                finalJumpRandomBoard(move);
                            }
                            else if (i > 0)
                            {
                                input = new Scanner(System.in);
                                System.out.println("Please enter your move: ");
                                move = input.nextLine();
                                finalJumpRandomBoard(move);
                            }
                            else if (move.contains("-") && i == 0)
                            {
                                finalStandardRandomBoard(move);
                            }
                            else if (move.contains("-") && i > 0)
                            {
                                input = new Scanner(System.in);
                                System.out.println("Please enter your move: ");
                                move = input.nextLine();
                                finalStandardRandomBoard(move);
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("Sorry you have chosen a color that does not exist");
                    break;
                }
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
