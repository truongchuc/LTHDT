package mainkethua;

import ghidevanapchong.AXIS;
import ghidevanapchong.Bikes;
import ghidevanapchong.ICICI;
import ghidevanapchong.SBI;

public class MainGhiDe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Bikes b = new Bikes(); b.run();
		 */

		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();

		System.out.println("SBI: " + s.getRate() + "%");
		System.out.println("ICICI: " + i.getRate() + "%");
		System.out.println("AXIS: " + a.getRate() + "%");

	}

}
