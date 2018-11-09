
import java.util.*;

class ArraysReverseSentence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //TODO: Type your code below
    
    String [] s1 = sentence.split(" ");
		
		for (int i = s1.length -1 ; i >= 0; i--) {
			System.out.println(s1[i]);
		}
  }
}