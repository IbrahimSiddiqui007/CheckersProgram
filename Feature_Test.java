// Reference Board        
// This is used by the user as a reference so that they can make their moves
String [] test = {"-1-2-3-4\n5-6-7-8-\n-9-10-11-12\n13-14-15-16-\n-17-18-19-20\n21-22-23-24-\n-25-26-27-28\n29-30-31-32-"};
        System.out.println(Arrays.deepToString(test).replaceAll("(^\\[|\\]$)", ""));

// Plain Board
// This is a plain board, It is used so that we can create a randomized and a new game board on top of it.
