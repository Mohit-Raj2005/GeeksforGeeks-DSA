class Solution {
    
    static boolean isValid(int[] arr,int k,int maxPages){
        //checks whether mid or maxPages is a valid solution or not
        int studentCount = 1;  // studentCount variable to count the students which will be less than k
        int pages = 0;
        for(int i =0; i<arr.length; i++){
            if(pages + arr[i] <= maxPages){   // checking if the current pages is less than the maxPages or is valid
                pages += arr[i];   // if it is valid, then increasing the pages
            }
            else{
                studentCount++;    // increasing the studentCount and allocating to the another student
                if(studentCount > k || arr[i] > maxPages){   // if the studentCount is greater than k or current iteration is greater than maxPages
                    return false;   //return false
                }
                else {
                    pages = 0;   // making the page count 0
                    pages += arr[i];    // allocating the pages to the another student
                }
            }
        }
        return true;    // if it is a valid answer then return true
    }
    
    public int findPages(int[] arr, int k) {
        // solving using binary search
        if(k > arr.length){
            return -1;
        }
        
        int n = arr.length;
        int sum = 0;
        
        for(int i =0;i <n ; i++){
            sum += arr[i];
        }
        
        int start = 1;
        int end = sum;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isValid(arr , k , mid)){
                //true wala case
                ans = mid;   //store the potential answer
                end = mid - 1; // move to left
                
            }
            else{
                //false wala case
                start = mid + 1;  // move to right
            }
        }
      return ans;  
    }
}