package gr8.d.soundar.algods;

public class Alg10Pyramid {
    public String[] getPyramid(int height) {
        String[] pyramid = new String[height];
        int rowLength = height * 2 - 1;
        int startIndex = 0;
        int farIndex = rowLength - 1;
        for (int i = height - 1; i >= 0; i--) {
            char[] row = new char[rowLength];
            for (int j = 0; j < rowLength; j++) {
                row[j] = (j >= startIndex && j <= farIndex) ? '#' : ' ';
            }
            pyramid[i] = new String(row);
            startIndex++;
            farIndex--;
        }
        return pyramid;
    }

    public String[] getPyramidByRecursion(int height) {
        String[] pyramid = new String[height];
        char[][] pyramidChar = new char[height][height * 2 - 1];
        pyramid(height - 1, 0, pyramidChar[0].length - 1, pyramidChar);
        for (int i = 0; i < height; i++)
            pyramid[i] = new String(pyramidChar[i]);
        return pyramid;
    }

    private void pyramid(int row, int startIndex, int farIndex, char[][] pyramid) {
        if (row < 0)
            return;
        for (int i = 0; i < pyramid[row].length; i++) {
            pyramid[row][i] = (i >= startIndex && i <= farIndex) ? '#' : ' ';
        }
        pyramid(--row, ++startIndex, --farIndex, pyramid);
    }

    public String[] getPyramidByRecursion2(int height) {
        String[] pyramid = new String[height];
        int columns = height * 2 - 1;
        char[][] pyramidChar = new char[height][columns];
        int midColumnIndex = Math.floorDiv(columns, 2);
        pyramid2(0, midColumnIndex, pyramidChar);
        for (int i = 0; i < height; i++)
            pyramid[i] = new String(pyramidChar[i]);
        return pyramid;
    }

    private void pyramid2(int rowIndex, int midColumnIndex, char[][] pyramidChar) {
        if (rowIndex >= pyramidChar.length)
            return;
        int startIndex = midColumnIndex - rowIndex;
        int farIndex = midColumnIndex + rowIndex;
        for (int i = 0; i < pyramidChar[rowIndex].length; i++) {
            pyramidChar[rowIndex][i] = (i >= startIndex && i <= farIndex) ? '#' : ' ';
        }
        pyramid2(++rowIndex, midColumnIndex, pyramidChar);
    }
}