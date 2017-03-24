/**
 * 
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author jxman4000
 *
 */
public class DCdriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		AttenCalc calc = new AttenCalc();
		
		String input = "";
		
		input = JOptionPane.showInputDialog("Please enter L:");
		calc.setL(Double.parseDouble(input));
		input = JOptionPane.showInputDialog("Please enter r:");
		calc.setR(Double.parseDouble(input));
		input = JOptionPane.showInputDialog("Please enter d:");
		calc.setD(Double.parseDouble(input));
		
		System.out.print(calc.toString());
		

	}

}
