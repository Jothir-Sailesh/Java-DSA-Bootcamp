import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //HashMap Creation
        HashMap<Integer, String> map = new HashMap<>();
        
        
        //Insertions
        map.put(1, "Tamilnadu");
        map.put(2, "Karnataka");
        
        //Overwriting a value
        map.put(1, "Kerala");
        
        //Retrive using Key
        System.out.println(map.get(1));   
        System.out.println(map.getOrDefault(4, "Not found"));
        
        //Access Keys and Values as Arrays
        System.out.println(map.keySet());
        System.out.println(map.values());
        
        
        //Adding new Pair
        map.put(3, "Andhra Pradesh");
        System.out.println(map.get(3));
        
        //Checking a value
        System.out.println(map.containsKey("AP"));
        
        //Removing a Key
        map.remove(3);
        System.out.println(map.containsKey(3));
        
        
        System.out.println();
        for(int i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }
        
        //HashMap size
        System.out.println(map.size());
        
        //HashMap is Empty?
        System.out.println(map.isEmpty());
        
        
        //End of Program :(
        
    }
}
