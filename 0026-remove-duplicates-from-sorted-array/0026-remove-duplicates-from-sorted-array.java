import java.util.ArrayList;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        ArrayList<Integer> uniqueList = new ArrayList<>();
        
        for (int x : nums) {
            if (!uniqueList.contains(x)) {
                uniqueList.add(x);
            }
        }
        
        // Modify the input array in place to reflect unique elements
        for (int i = 0; i < uniqueList.size(); i++) {
            nums[i] = uniqueList.get(i);
        }
        
        return uniqueList.size();
    }
}
