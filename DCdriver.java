/**
 * 
 */

package application;

import javax.swing.JOptionPane;

/**
 * @author jxman4000
 *
 */
public class DCdriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AttenCalc calc = new AttenCalc();
		
		String input = "";
		
		input = JOptionPane.showInputDialog("Please enter L:");
		calc.setL(Double.parseDouble(input));
		input = JOptionPane.showInputDialog("Please enter R:");
		calc.setR(Double.parseDouble(input));
		input = JOptionPane.showInputDialog("Please enter d:");
		calc.setD(Double.parseDouble(input));
		
		System.out.print(calc.toString());
		

	}

}
