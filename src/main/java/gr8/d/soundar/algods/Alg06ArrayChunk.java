package gr8.d.soundar.algods;

public class Alg06ArrayChunk {

    public int[][] chunk (int[] array, int chunkLength) {
        int[][] chunkArray = new int[(int)Math.ceil((double)array.length / chunkLength)][];
        int remaining = array.length;
        int mainIndex = 0;

        for (int j = 0; j < chunkArray.length; j++) {
            chunkArray[j] =  new int[(chunkLength < remaining) ? chunkLength : remaining];
            for (int i = 0; i < chunkArray[j].length; i++) {
                chunkArray[j][i] = array[mainIndex++];
                remaining--;
            }
        }

        return chunkArray;
    }
}