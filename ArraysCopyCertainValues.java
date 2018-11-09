
import java.util.*;

public class ArraysCopyCertainValues {
  public static void main(String[] args) {
    System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));
    
    
    
  }
  
  
  
  public static String[] getWithE(String[] arr) {
    
    //TODO : YOUR CODE GOES HERE ----------------------
     int count = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i].contains("e")){
        count++;
      }
    }
    String fewValues[] = new String[count];
    for(int i = arr.length-1; i >=0; i--){
      if(arr[i].contains("e")){
            fewValues[count-1] = arr[i];
            count--;
      }
    }
     
       
       

    
    
    
    //YOUR CODE ENDS HERE -----------------------
    
    return fewValues;
  }
  
  }
  
