
import java.util.*;

class ArraysPrintFirstLastChar2 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
   

    //TODO: Write your code below
   System.out.print("[");
		for(int i = 0; i<words.length; i++) {
			if(i != words.length-1) {
				System.out.print(words[i].substring(0, 1) + words[i].substring(words[i].length() - 1));
				System.out.print(", ");
			}else {
				System.out.print(words[i].substring(0, 1) + words[i].substring(words[i].length() - 1));
			}
		}
		System.out.println("]");
    
    
  }
}