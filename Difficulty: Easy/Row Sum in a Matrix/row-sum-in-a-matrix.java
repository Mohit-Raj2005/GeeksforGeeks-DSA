class Solution {
    public static int[] rowSum(int mat[][]) {
        int[] array = new int[mat.length];
        for(int i=0; i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum+= mat[i][j];
            }
            array[i]=sum;
        }
        return array;
    }
}