import java.util.*;

class ReverseSentence2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    String reversed = "";
    //TODO: start your code here
    String[] s1 = sentence.split(" ");
		

		for (int i = s1.length - 1; i >= 0; i--) {
			reversed =  reversed + s1[i] + " ";
		}

		reversed = reversed.trim();
	
		
    
    
    //End your code here. do not modify below statement
    System.out.println(reversed);
    
  }
}