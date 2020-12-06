/**
 * The In class was setup to provide an easy interface for students to get
 * input from the user. In Turing, this was particularly easy using the get command.
 * In java, input is a litte more complicated. The purpose of this class
 * is to make it easier to get input without knowing all of the details.
 * Read the code below if you are interested in learning how input is really handled in 
 * Java. We will study this code in grade 12.
 * @author Chris Cardoso
 */

import java.io.*;
import java.text.*;


public class In
{
  static InputStreamReader r = new InputStreamReader(System.in);
  static BufferedReader br = new BufferedReader(r);

  /**
   * Read a String from standard system input
   * @return String
   */
  public static String getString()
  {
    try
    {
      return br.readLine();
    }
    catch (Exception e)
    {
      return "";
    }
  }

  /**
   * Read a Number as a String from standard system input
   * Can be cast at point of calling
   * @return the Number
   */
  public static Number getNumber()
  {
    boolean invalidInput = false;
    Number inputNumber = null;

    do
    {
     try
     {
        String numberString = br.readLine();
        numberString = numberString.trim().toUpperCase();
        inputNumber =  NumberFormat.getInstance().parse(numberString );
        invalidInput = false;
     }
     catch (Exception e)
     {
        // If any exception occurs, just return zero
        System.out.println("Please re-enter - previous input was invalid");
        invalidInput = true;
     }
   }while(invalidInput);

   return inputNumber;

  }

  /**
   * Read an int from standard system input
   * @return integer value
   */
  public static int getInt ()
  {
    return getNumber().intValue();
  }

  /**
   * Read a long from standard system input
   * @return long value
   */
  public static long getLong ()
  {
    return getNumber().longValue();
  }

  /**
   * Read a float from standard system input
   * @return float value
   */
  public static float getFloat ()
  {
    return getNumber().floatValue();
  }

  /**
   * Read a double from standard system input
   * @return double
   */
  public static double getDouble ()
  {
    return getNumber().doubleValue();
  }

  /**
   * Read a char from standard system input
   * @return char
   */
  public static char getChar ()
  {
    String s = getString();
    if (s.length() >= 1)
      return s.charAt(0);
    else
      return '\n';
  }
  
  public static void pln(Object o)
  {
    System.out.println(o);
  }

}
