class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        while(left < n - 1 && arr[left] <= arr[left + 1]){
            left++;
            }
        if(left == n - 1){
                return 0;
        }
        int right = n - 1;
        while(right > 0 && arr[right - 1] <= arr[right]){
            right--;
        }
        int result = Math.min(n - left - 1, right);
        int start = 0, end = right;
        while(start <= left && end < n){
            if(arr[start] <= arr[end]){
                result = Math.min(result, end - start - 1);
                start++;
            }
            else{
                end++;
            }
        }

        return result;
    }
}
