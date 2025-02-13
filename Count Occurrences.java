public class Main {
    
    public static int CountOccurence(int[] arr, int target){
        int count = 0;
        for(int i: arr){
            if(i==target){
                count++;
            }
        }
        return count;
        
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,3};
        System.out.println("Count: " + CountOccurence(arr, 3));
        
    }
}
