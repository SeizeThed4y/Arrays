
import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: Write your code below
    
		int counter2 = 0;
		
		for (int i  = 0; i < nums.length; i ++) {
			
			if(nums[i] % 2 == 0 ) {
				counter2++;
			}
			
		}
		System.out.println(counter2);
    
  }
}


