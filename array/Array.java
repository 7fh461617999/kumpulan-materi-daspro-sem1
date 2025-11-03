package array;
import java.util.Scanner;
public class Array {
Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String [] arr = new String[3];
    for(int i=0;i<3;i++){
      System.out.println(i+1+". "+arr[i]+" ");
    }
System.out.println("   "+arr.length);
  }
}
