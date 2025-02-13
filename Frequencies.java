public class Main {
        public static void main(String[] args) {
        
        int[] arr = {1,1,2,2,3,4,5,6,6,7,7,7};
        int[] frequency = new int[10];
            
            for(int i : arr){
                frequency[i]++;
            }
            
            System.out.println("Elements not in Array: ");
            for(int i=0; i<frequency.length; i++){
                if(frequency[i]==0){
                    System.out.print(i + " ");
                }    
            }
            System.out.println();
            
            
            System.out.println("Unique elements in Array: ");
            for(int i=0; i<frequency.length; i++){
                if(frequency[i]==1){
                    System.out.print(i + " ");
                }    
            }
            System.out.println();
            
            
            System.out.println("Duplicate elements in Array: ");
            for(int i=0; i<frequency.length; i++){
                if(frequency[i]!=1 && frequency[i]!=0){
                    System.out.print(i + " ");
                }    
            }
            
            
        
        
    }
}
