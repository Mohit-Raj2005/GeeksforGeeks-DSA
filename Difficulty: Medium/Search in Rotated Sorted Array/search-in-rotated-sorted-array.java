class Solution {
    // This solution is using linear search but we can think of binary search in this problem
    // int search(int[] arr, int key) {
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
        
    // }
    
    // This is the most appropriate solution to this problem using binary search in this problem
    int search(int[] arr, int key) {
         int start = 0;    // initialising the start
         int end = arr.length -1;  // initialising the end
         int ans = -1;
         while(start <= end){
             int mid = start + (end - start)/2;   // calculating mid
             if(arr[mid] == key){      // if the key element is the mid element
                 ans = mid;
             }
             if(arr[mid]<arr[end]){    // if the mid is smaller than the end i.e, we are in the right subarry
                 if(key <= arr[end] && key> arr[mid]){// checking if the key is in the right part of the mid
                    start = mid +1;      // moving right
                 }
                 else{
                     end = mid -1;    // else if the key is in the left part of the mid... moving left
                 }
             }
             else{    // if we are in the left part of the subarray
                 if(key >= arr[start] && key <arr[mid]){   // checking if key is in the left of the mid element
                     end = mid -1;   // moving left 
                 }
                 else{
                     start = mid +1;  // else if the key element is in the right of the mid... moving right
                 }
                 
             }
         }
         return ans;
    }
}
