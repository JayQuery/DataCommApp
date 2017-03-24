//import java.math.*;
public class AttenCalc {
	private double d;
	private double L;
	private double R;
	private double delay;
	private double Util;
	private double rtt;
	private final double s;
	
	public AttenCalc() {
		// TODO Auto-generated constructor stub
		d = 0;
		L = 0;
		R = 0;
		delay = 0.0;
		Util = 0.0;
		rtt = 0.0;
		s = (3 * Math.pow(10, 8));
	}
/**
 * Access the distance
 * @return distance
 */
	public double getD() {
		return d;
	}
/**
 * Mutate the input.
 * @param d
 */
	public void setD(double d) {
		this.d = d;
	}

	public double getL() {
		return L;
	}
/**
 * 
 * @param l
 */
	public void setL(double l) {
		l = l * 8;
		L = l;
	}
/**
 * 
 * @return
 */
	public double getR() {
		return R;
	}
/**
 * This method will set the rate input by user
 * @param rate
 */
	public void setR(double r) {
		R = r;
	}
	
	
	/**
	 * This method will calculate the prop delay
	 * @return the prop delay
	 */
	public double getDelay(){
		delay = ((L/R) + (d/s));
		return delay;
	}
	
	/**
	 * This method will calculate total rount trip time.
	 * @return Round Trip Time
	 */
	public double getRTT(){
		rtt = ((d/s) * 2);
		return rtt * Math.pow(10, 3);
	}
	/**
	 * Method to calculate total Utilization
	 * @return Utilization 
	 */
	public double getUtil(){
		//double rtt = 0.0;
		Util = delay/(delay + rtt);
		return Util;
	}
	/**
	 * Will return all the information and their calculations.
	 * @return the overall print statement 
	 */
	public String toString(){
		return "Delay: " + getDelay()
		+"\nL/R: (" + getL() + "/" + getR() + ") "
		+"\nRTT: " + getRTT()
		+"\nd/s X 2: 2(" + getD() + "/" + s + ") "
		+"\nUtilization: " + getUtil()
		+"\nL/R/(RTT + L/R) (" + getDelay() + "/(" + getRTT() + " + "
		+ getDelay() + ") ";
		
	}
	
	

}
