package gr8.d.soundar.algods;


public class Alg12SpiralMatrix {
    public int[][] getMatrix(int n) {
        int[][] matrix = new int[n][n];
        buildMatrix(1, 0, 0, 0, matrix);
        return matrix;
    }

    private void buildMatrix(int number, int row, int col, int direction, int[][] matrix) {
        if (number > matrix.length * matrix.length)
            return;
        
        if (col < 0 || row < 0 || col >= matrix.length || row >= matrix.length || matrix[row][col] != 0) {
            direction = (direction + 1) % 4;
            switch (direction) {
                case 0:
                    row++;
                    break;
                case 1:
                    col--;
                    break;
                case 2:
                    row--;
                    break;
                case 3:
                    col++;
                    break;
            }
        } else {
            matrix[row][col] = number++;
        }

        switch (direction) {
            case 0:
                buildMatrix(number, row, ++col, direction, matrix);
                break;
            case 1:
                buildMatrix(number, ++row, col, direction, matrix);
                break;
            case 2:
                buildMatrix(number, row, --col, direction, matrix);
                break;
            case 3:
                buildMatrix(number, --row, col, direction, matrix);
                break;
        }
    }

    public int[][] getMatrix2(int n) {
        int[][] matrix = new int[n][n];
        int startRow = 0;
        int endRow = n - 1;
        int startColumn = 0;
        int endColumn = n - 1;
        int value = 0;
        while (startRow <= endRow && startColumn <= endColumn) {
            // Top Row
            for (int i = startColumn; i <= endColumn; i++) {
                matrix[startRow][i] = ++value;
            }
            startRow++;

            // Right Column
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endColumn] = ++value;
            }
            endColumn--;

            // Bottom Row
            for (int i = endColumn; i >= startColumn; i--) {
                matrix[endRow][i] = ++value;
            }
            endRow--;

            // Left Column
            for (int i = endRow; i >= startRow; i--) {
                matrix[i][startColumn] = ++value;
            }
            startColumn++;
        }
        return matrix;
    }
}