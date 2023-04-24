/**
 * 1 2 3
 *
 * 4 5 6
 *
 * 7 8 9
 */

public class Interview {



    public static void main(String[] args) {
        Integer[][] givenarray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer transpose[][] = new Integer[3][3];
        for (int i = 0; i < givenarray[0].length; i++) {
            for (int j = 0; j < givenarray[0].length; j++) {
                transpose[2-i][j] = givenarray[2-i][2-j];
            }
        }
        //-----------//----------------------------------------------------
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(givenarray[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------> after----------------->");



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

