class Solution {
    public boolean isSorted(int[] arr) {
        boolean ans = false;  // initialising ans with false
        if(arr.length == 1){
            return true;   // if there is only one element in the array then returning true
        }
        for(int i =0; i<arr.length -2 ; i++){   // iterating over arr
           if(arr[i] <= arr[i+1]){      // checking if the array is sorted 
               ans = true;  
           }
           else{
               ans = false;   // else ans = false
               break;
           }
        }
        return ans;     // returning false
    }
}