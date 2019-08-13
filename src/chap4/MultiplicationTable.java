package chap4;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
       
      System.out.println("---------------------------------Multiplication-------------------------------------------");
      System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12");
      System.out.println("------------------------------------------------------------------------------------------");

      int n;
      for (int i = 1; i <= 12; i++) {
          for(int e = 1; e <=12; e++) {
              n = (i)*(e) ;
              System.out.print(n+"\t");
          }
          System.out.println("");
      }

   }
    
}
