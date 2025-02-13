public class Main {
    
    public static int[][] OddEvenArrays(int[] arr){
        int odd = 0;
        int even = 0;
        
        for(int i: arr){
            if(i%2==0){
                even++;
            }         
            else{
                odd++;
            }
        }    
        
        int[] oddArray = new int[odd];
        int[] evenArray = new int[even];
        
        odd = 0;
        even = 0;
        
        for(int i: arr){
            if(i%2==0){
                evenArray[even] = i;
                even++;
            }
            else{
                oddArray[odd] = i;
                odd++;
            }
        }
        
        return new int[][]{oddArray, evenArray};

    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[][] result = OddEvenArrays(arr);
        
        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
    }
}
