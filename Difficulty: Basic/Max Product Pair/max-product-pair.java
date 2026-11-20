class Solution {
    public static int maxProduct(int[] arr) {
       Arrays.sort(arr);
       return arr[arr.length - 1] * arr[arr.length - 2];
    }
}
