import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int[] binary = new int[8];
    for(int i =0; i < binary.length; i++) {
      binary[i] = input.nextInt();
    }
    
    //TODO: Write your code below.
    int sum=0; 
    int powers=binary.length-1;
	   for (int a=0; a<8; a++) {
	   	if (binary[a]==1) {
	   		sum+=(int) Math.pow(2, (powers-a));
	   	}
	   	
	    }System.out.print(sum);
    
System.out.print("Risaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
     
  }
}