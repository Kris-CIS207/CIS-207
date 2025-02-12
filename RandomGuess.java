import java.util.Random;
import javax.swing.JOptionPane;

public class RandomGuess{
  public static void main(String[] args) {  
    // Ask user to think of a number
    JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");
     
      Random random = new Random();
      int generatedNumber = random.nextInt(10) + 1;
    
            JOptionPane.showMessageDialog(null, "Your number was: " + generatedNumber);}
  }