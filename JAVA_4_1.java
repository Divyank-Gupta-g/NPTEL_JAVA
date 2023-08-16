//Complete the code segment to execute the following program successfully. You should import the correct package(s) and/or class(s) to complete the code.

import java.util.*;
import java.io.*;
import static java.lang.System.*;

// main class Question is created
public class JAVA_4_1{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);	// Scanner object is created
     
    String courseName = scanner.nextLine(); 	// Read String input using scanner class
     
    out.println("Course: " + courseName); 	// Print the scanned String
  }
}