package btMrThang_bai2;

public class SBIBank extends Bank {

	@Override
	float getRateOfInterest(Float amount) {
		return amount*0.08f;
		
	}

}
