class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1L = nums1.length;
        int n2L = nums2.length;
        int[] merge = new int[n1L + n2L];

        // Copy elements from nums1 and nums2 into merge
        System.arraycopy(nums1, 0, merge, 0, n1L);
        System.arraycopy(nums2, 0, merge, n1L, n2L);

        // Sort theerged array
        Arrays.sort(merge);

        int mL = n1L + n2L;
        if (mL % 2 == 0) {
            int mid1 = merge[mL / 2 - 1];
            int mid2 = merge[mL / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return merge[mL / 2];
        }
    }}