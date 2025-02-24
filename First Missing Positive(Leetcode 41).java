class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        int i = 1;
        while(set.contains(i)){
            i++;
        }

        return i;
    }
}
