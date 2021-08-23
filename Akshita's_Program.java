int size = 8;
        int [] arr = new int[size];
        int [][] arr2 = new int [8][8]; //8 x 8             
        Scanner sc = new Scanner (System.in);
        System.out.println("KEY: '0' is the white squares, and the 'numbers' are the black squares");
        for(int r = 0; r<8; r++) //row
        {                                            
            //System.out.println("enter : "+size);
            //use setewitd; or setW
            System.out.println(" ");
            int count = 1;
            for(int c = 0; c<size; c++) //column
            {
                for(int n=0; n<=size; n++)
                {
                    if(r==n && c==0)
                    {
                        if(r%2==0)
                        {
                            for(int co = 1; co<size; co+=2) 
                            {
                                arr2[r][co] = count+(4*n);
                                count++;
                            }
                        }
                        else
                        {
                            if(r%2!=0)
                            {
                                for(int co = 0; co<size; co+=2) 
                                {
                                    arr2[r][co] = count+(4*n);
                                    count++;
                                }
                            }
                        }
                    }
                }
              
                System.out.print(arr2[r][c]+" ");
            }
          //System.out.println();
        }
        System.out.println();
