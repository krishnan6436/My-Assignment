package Week3.Day1;

import org.checkerframework.checker.units.qual.h;

public class AxixsBank extends BankInfo {

	
	
		public void deposit() {
			System.out.println("10 years deposit 15%");
		}
	
	
		public void thissuper()
		{
			super.deposit();
			
			
		}

		public static void main(String[] args) {
			
			AxixsBank h=new AxixsBank();
			
			System.out.println("Call methods present in AxisBank");
			h.deposit();
		h.deposit();
		//System.out.println("Axix deposit amt"+ h);
			
		}
		}

		
		


