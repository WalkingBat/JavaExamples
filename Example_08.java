// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

public class Example_08 {
    static int[][] board;
    static int[][] Step = new int[][]{{1, 2}, {2, 1}, {1, -2}, 
        {2, -1}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}};
    static int maxSteps;
    static int size;

    public static void main(String[] args) {
        size = 5;
        board = new int[size][size];
        maxSteps = size * size;

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size;) {
                find(i, j, 1);
                Steps();
                return;
            }
        }
        System.out.println("Решения нет");
    }

    public static boolean find(int curX, int curY, int countSteps) {
        board[curX][curY] = countSteps;
        if (countSteps >= maxSteps) {
            return true;
        }

        for (int i = 0; i < Step.length; i++) {
            int nextX = curX + Step[i][0];
            int nextY = curY + Step[i][1];
            if (checkStep(nextX, nextY) && find(nextX, nextY, countSteps + 1)) {
                return true;
            }
        }

        board[curX][curY] = 0;
        return false;
    }

    public static boolean checkStep(int x, int y) {
        return (x >= 0 && x < size && y >= 0 && y < size && board[x][y] == 0);
    }

    static void Steps() {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}