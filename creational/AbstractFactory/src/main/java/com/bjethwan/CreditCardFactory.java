package com.bjethwan;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFatory(int creditScore){
		
		if(creditScore>650)
			return new AmexFactory();
		else
			return new VisaFactory();
	
	}



}
