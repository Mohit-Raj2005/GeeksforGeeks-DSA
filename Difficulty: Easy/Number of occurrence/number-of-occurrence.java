class Solution {
     static int getLowerBound(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;     //intialising the upperbound ans with length of array
        while(start <= end){
            int mid = start + (end - start)/2;  // calculating mid
            if(arr[mid] >= target){        // satisfying condition for lower bound
                ans = mid;                 // storing the index
                end = mid-1;            // moving towards left to find if other target values are also there in the left subarray
            }
            else{
                start = mid+1;    // otherwise moving towards right to check lower bound in the right subarray
            }
        }
        return ans;
        }

        static int getUpperBound(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;   //intialising the upperbound ans with length of array
        while(start <= end){
            int mid = start + (end - start )/2;
            if(arr[mid] <= target){
                start = mid+1;   //move towards right
                      
            }
            else{
                ans = mid;    //storing the answer
                end =  mid-1;  //moving towards left to look if other lower bounds are also present in the left subarray 
                 
                }
        }
        return ans;
        }
    int countFreq(int[] arr, int target) {
      
        int ub = getUpperBound( arr,  target);
        int lb = getLowerBound( arr,  target);
        int ans =ub - lb;
        
    return ans;

    }

}
