/*
 * Project: NameThatCelebrity.java
 * Description: Asks contestants to guess a name without seeing first and last letters.
 * Author: Aaron Snowberger
 * Date: Sept 7, 2015
 */

public class NameThatCelebrity {
  
  public static void main( String[] args ) {
    
    String s1 = "Harrison Ford", s2 = "Megan Fox", s3 = "Adam Levine", s4 = "Michael Jackson", s5 = "Michael Jordan";
    
    
    System.out.println( s1 + " >>> " + s1.substring(2,(s1.length() - 3)) );
    System.out.println( s2 + " >>> " + s2.substring(2,(s2.length() - 3)) );
    System.out.println( s3 + " >>> " + s3.substring(2,(s3.length() - 3)) );
    System.out.println( s4 + " >>> " + s4.substring(2,(s4.length() - 3)) );
    System.out.println( s5 + " >>> " + s5.substring(2,(s5.length() - 3)) );
    
  } // end main method
  
} // end class