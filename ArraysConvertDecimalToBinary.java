import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int decimal = input.nextInt();
    int[] binary = new int[8];
    
    //TODO: Write your code below.
   int count = 0;
		
		while (decimal > 0) {
			binary[binary.length-1-count] = decimal % 2;
			decimal /= 2;
			count++;
	}
		System.out.println(Arrays.toString(binary));
    
    
  }
}