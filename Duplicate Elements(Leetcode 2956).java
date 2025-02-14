class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int ans1 = 0, ans2 = 0;

        for(int i:nums1){
            set1.add(i);
        }
        
        for(int i:nums2){
            set2.add(i);
        }

        for(int i: nums1){
            if(set2.contains(i)){
                ans1++;
            }
        }
        for(int i: nums2){
            if(set1.contains(i)){
                ans2++;
            }
        }

        return new int[]{ans1,ans2};
    }
}
