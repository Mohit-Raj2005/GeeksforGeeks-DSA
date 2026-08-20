class Solution {
    public int findTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start ) / 2;
            if(mid - 1 >=0 && arr[mid - 1] == target ){
                return mid-1;
            }
            if( mid >=0   && arr[mid] == target){
                return mid;
            }
            if(mid + 1 <arr.length && arr[mid + 1] == target  ){
                return mid+1;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}