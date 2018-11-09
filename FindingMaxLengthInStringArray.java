import java.util.*;

class FindingMaxLengthInStringArray
{
	public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		
		
		
		
		String large = words[0];
        for(int i = 0; i <words.length; i++) {
            if(large.length() < words[i].length()) {
                large = words[i];
            }
        }
        System.out.println(large);

	}

}