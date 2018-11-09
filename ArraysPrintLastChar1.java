
import java.util.*;

class ArraysPrintLastChar1 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
   

    //TODO: Write your code below
    
    	
		
		for (String word : words) {
			System.out.println(word.substring(0,1) + word.substring(word.length()-1));
			
			
		}
    
  }
}