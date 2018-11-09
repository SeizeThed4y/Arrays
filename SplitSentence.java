import java.util.*;

class SplitSentence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //type your code below
    

		for (String splitted : sentence.split(" ")) {
			System.out.println(splitted);
		}
    
  }
}