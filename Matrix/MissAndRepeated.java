class MissAndRepeated {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;    // Take row len
        int size = n * n;
        int[] count = new int[size + 1];

        // We need to find how many elemnt appears
        for(int[] row : grid) {
            for(int val : row) {    // Each row stored in val
                count[val]++;
            }
        }

        // Then , find repeated and missing elemnt
        int repeated = -1;
        int missing = -1;

        for(int i = 0; i <= size; i++) {
            if(count[i] == 2) { // for repeated val
                repeated = i;
            }
            else if(count[i] == 0) {    // for Missing val
                missing = i;
            }
        }

        // return Repeated val followed by Missing
        return new int[]{repeated , missing};
    }
}