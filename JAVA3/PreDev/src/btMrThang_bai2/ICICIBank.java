package btMrThang_bai2;

public class ICICIBank extends Bank {

	@Override
	float getRateOfInterest(Float amount) {
		return amount*0.07f;
	}

}
