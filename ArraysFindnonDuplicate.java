
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: write your code below
    for (int j = 0; j < nums.length; j++) {
	        int appearOnceNum =nums[j];
	        boolean duplicate = false;

	        for (int i = 0; i< nums.length; i++) {
	            if ( nums[i] ==appearOnceNum && j != i) {
	                duplicate = true;
	                break;
	            }

	        }
	        if (duplicate ==false) {
	            System.out.print( nums[j]);
	        
	        }
	}

    
    
  }
}