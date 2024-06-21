class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // Pointer to place the next unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                
                nums[++i] = nums[j]; // Place the next unique element
            }
        }
        return i + 1; // The length of the array with unique elements
    }
}
