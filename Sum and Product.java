public class Main {
    
    public static void SumProduct(int[] arr){
        int sum = 0, product = 1;
        
        
        for(int i=0; i<arr.length; i++){
                sum += arr[i];
                product *= arr[i];
            }
            
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        SumProduct(arr);
        
    }
}
