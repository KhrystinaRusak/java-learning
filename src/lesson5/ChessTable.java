package lesson5;

import java.util.Arrays;

public class ChessTable {
    public static void main(String[] args) {
        char[][] chess = new char[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                chess[i][j] = 'W';
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    chess[i][j] = 'W';
                } else {
                    chess[i][j] = 'B';
                }
            }
        }

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(chess));
    }
}
