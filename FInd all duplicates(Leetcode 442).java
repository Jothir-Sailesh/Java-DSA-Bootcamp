class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> lists = new ArrayList<>();

        for(int i:nums){
            if(map.containsKey(i)){
                lists.add(i);
            }
            else{
                map.put(i,1);
            }
        }
        
        return lists;
    }

}
