
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO Type your code below:
    boolean found = false;
    
    for(int i = 0; i < nums.length-1; i++) {
      if( nums[i] == 5 && nums[i + 1 ] == 5) {
        found = true;
        break;
        
      }
    }
    
    System.out.println(found);
    System.out.println("Hello");
    
    
  }
}