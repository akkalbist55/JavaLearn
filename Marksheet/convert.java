import java.io.*;
import java.util.*;
import java.io.*;
public class convert
{
 public static void main (String args[]) throws IOException
 {
 Scanner infile = new Scanner (System.in);
 DecimalFormat df = new DecimalFormat ("#,###.00");

 double x = 11134343.8585859585;

 System.out.println ("Not formatted " + x);
 System.out.println ();
 System.out.println ("Formatted " + df.format(x));

 }
}
