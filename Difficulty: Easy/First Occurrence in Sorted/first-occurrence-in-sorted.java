class Solution {
    public int firstSearch(int[] arr, int k) {
        // in this sorted array we will use binary search for efficiency
        int start = 0;  // start index
        int end = arr.length - 1;  // end index
        int ans = -1;   // ans variable
        while(start <= end){
            int mid = start + (end - start) /2;  // calculating mid
            if(arr[mid] == k){  // if mid element is the target element
                ans = mid;  // storing the possible ans index 
                end = mid-1;  // moving left to find if the target is present at any other index
            }
            else if(arr[mid] < k){   // if mid element is lesser than the target element
                start = mid + 1;  // moving right
            }
            else{
                end = mid - 1;   // else moving left
            }
        }
        return ans;
        
    }
}