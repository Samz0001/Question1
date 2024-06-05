
//YOu are GIvien a sorted array consiting of only intergers where every element appears exaepct for  one element which appears exactly once find single element that appreas only once.

//Example 1
//INPUT ={1,1,2,3,3,4,4,8,8}
//Output 2 
//Example 2 
//Input = {3,3,7,7,10,11,11}
//Output = 10

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            boolean isEven = (right - mid) % 2 == 0;
            if (nums[mid] == nums[mid - 1]) {
                if (isEven) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] == nums[mid + 1]) {
                if (isEven) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[left];
    }
}