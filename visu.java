import java.util.*;
public class StringReverseExample {
 
  public static void main(String args[]){
  
    String strOriginal = "Hello World";
    System.out.println("Original String : " + strOriginal);
   
    strOriginal = new StringBuffer(strOriginal).reverse().toString();
    System.out.println("Reversed String : " + strOriginal);
  }
 
}
 
