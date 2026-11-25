
class NumMatrix {
    static int[][] mar;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        mar = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                mar[i][j] = matrix[i][j];

                if (i - 1 >= 0)
                    mar[i][j] += mar[i - 1][j];

                if (j - 1 >= 0)
                    mar[i][j] += mar[i][j - 1];

                if (i - 1 >= 0 && j - 1 >= 0)
                    mar[i][j] -= mar[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int res = mar[row2][col2];

        if (row1 - 1 >= 0)
            res -= mar[row1 - 1][col2];

        if (col1 - 1 >= 0)
            res -= mar[row2][col1 - 1];

        if (row1 - 1 >= 0 && col1 - 1 >= 0)
            res += mar[row1 - 1][col1 - 1];

        return res;
    }
}
