class Solution {
    static int firstOccurence(int[][]arr, int row){
        int start = 0;
        int end = arr[0].length - 1;
        int indx = -1;
        
        while(start <= end){
            if(arr[row][arr[0].length - 1] == 0){
                return arr[0].length;
            }
            int mid = start + (end - start) / 2;
            if(arr[row][mid] == 1){
                indx = mid;
                end = mid - 1; 
            }
            else{
                start = mid + 1;
            }
        }
        return indx;
    }
    public int rowWithMax1s(int[][] arr) {
        int max = 0;
        int rowIndx = -1;
        for(int i = 0; i < arr.length ; i++){
            int firstOccur = firstOccurence(arr , i);
            int maxOne = arr[0].length - firstOccur;
            if(maxOne > max){
                max = maxOne;
                rowIndx = i; 
            }
            else{
                continue;
            }
        }
        return rowIndx;
    }
};