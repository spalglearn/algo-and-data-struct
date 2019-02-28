package gr8.d.soundar.algods;

public class Alg09Steps {
    public String[] getSteps(int height) {
        String[] ret = new String[height];
        for (int i = 0; i < height; i++) {
            char[] array = new char[height];
            for (int j = 0; j < height; j++) {
                array[j] = (j <= i) ? '#' : ' ';
            }
            ret[i] = new String(array);
        }
        return ret;
    }

    public String[] getStepsRecursion(int height) {
        char[][] steps = new char[height][height];
        step(0, 0, steps);
        String[] stepsStr = new String[height];
        for (int i = 0; i < height; i++)
            stepsStr[i] = new String(steps[i]);
        return stepsStr;
    }

    private void step(int row, int col, char[][] steps) {
        steps[row][col] = (col <= row) ? '#' : ' ';
        if (col == steps.length - 1) {
            col = 0;
            row++;
        } else {
            col++;
        }
        if (row == steps.length) {
            return;
        } else {
            step(row, col, steps);
        }
    }
}