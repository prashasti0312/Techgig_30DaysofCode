import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
Scanner input = new Scanner(System.in);

if (input.hasNextInt())
   System.out.println("This input is of type Integer.");
   
   else if (input.hasNextFloat())
  System.out.println("This input is of type Float.");
   
  else if (input.hasNextLine())
  System.out.println("This input is of type string."); 

  else
System.out.println("This is something else."); 

   }
}
