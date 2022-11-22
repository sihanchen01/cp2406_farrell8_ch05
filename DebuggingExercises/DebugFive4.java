// DebugFive4.java
// Outputs highest of four numbers
import javax.swing.*;
public class DebugFive4
{
   public static void main (String []args)
   {
      int one;
      int two;
      int three;
      int four;
      String str;
      String output;

      str = JOptionPane.showInputDialog(null,"Enter an integer");
      one = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      two = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      three = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      four = Integer.parseInt(str);
      if(four >= two & four >= three && four >= one)
         output = "Highest is " + four;
      else
         if(two >= one && two >= three)
            output = "Highest is " + two;
         else
           if(three >= one)
              output = "Highest is " + three;
           else
              output = "Highest is " + one;
      JOptionPane.showMessageDialog(null, output);
   }
}


