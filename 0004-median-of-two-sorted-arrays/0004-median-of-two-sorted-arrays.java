class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1L = nums1.length;
        int n2L = nums2.length;
        int[] merged = new int[n1L + n2L];

        int i = 0, j = 0, k = 0;
        while (i < n1L && j < n2L) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Add remaining elements from nums1 (if any)
        while (i < n1L) {
            merged[k++] = nums1[i++];
        }

        // Add remaining elements from nums2 (if any)
        while (j < n2L) {
            merged[k++] = nums2[j++];
        }

        int totalLength = n1L + n2L;
        if (totalLength % 2 == 0) {
            int mid1 = merged[totalLength / 2 - 1];
            int mid2 = merged[totalLength / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return merged[totalLength / 2];
        }
    }
}
