package lesson5.hometask5;

import java.util.Arrays;

public class Sudoku {

    static int N = 9;

    static boolean isinRange(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] <= 0 || board[i][j] > 9) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValidSudoku(int board[][]) {
        if (isinRange(board) == false) {
            return false;
        }

        boolean[] unique = new boolean[N + 1];

        for (int i = 0; i < N; i++) {
            Arrays.fill(unique, false);

            for (int j = 0; j < N; j++) {
                int z = board[i][j];

                if (unique[z]) {
                    return false;
                }
                unique[z] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            Arrays.fill(unique, false);

            for (int j = 0; j < N; j++) {
                int z = board[j][i];

                if (unique[z]) {
                    return false;
                }
                unique[z] = true;
            }
        }

        // проверка блоков 3 на 3
        for (int i = 0; i < N - 2; i += 3) {
            // j хранит первую столбец каждых блоков 3 на 3
            for (int j = 0; j < N - 2; j += 3) {
                Arrays.fill(unique, false);

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int x = i + k;

                        int y = j + l;

                        int z = board[x][y];

                        if (unique[z]) {
                            return false;
                        }
                        unique[z] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] board = {{8, 1, 2, 6, 4, 9, 7, 5, 3},
                {9, 7, 6, 3, 5, 8, 1, 2, 4},
                {4, 3, 5, 1, 2, 7, 6, 9, 8},
                {6, 9, 4, 5, 3, 1, 2, 8, 7},
                {1, 8, 3, 2, 7, 4, 5, 6, 9},
                {5, 2, 7, 8, 9, 6, 3, 4, 1},
                {3, 5, 1, 4, 8, 2, 9, 7, 6},
                {2, 4, 9, 7, 6, 3, 8, 1, 5},
                {7, 6, 8, 9, 1, 5, 4, 3, 2}};

        if (isValidSudoku(board)) {
            System.out.println("Валидна судоку");
        } else {
            System.out.println("Невалидна судоку");
        }
    }
}
