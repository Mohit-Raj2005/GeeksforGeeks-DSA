class Solution {
    public static int[] colSum(int mat[][]) {
        
        int rows = mat.length;  //calculating the number of rows
        int column = mat[0].length;  //calculating the number of columns
        int[] array = new int[column];  //integer array of column size to store the sum
        for(int cols = 0;cols<column;cols++){  //Iterating column wise
            int sum = 0;
            for(int r= 0; r< rows;r++){  // iterating rows
                sum += mat[r][cols];  // calculating sum for each column
            }
            array[cols] = sum;
        }
        return array;
    }
}