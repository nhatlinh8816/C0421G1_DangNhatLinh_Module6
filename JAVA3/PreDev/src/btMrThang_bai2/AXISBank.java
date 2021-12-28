package btMrThang_bai2;

public class AXISBank extends Bank {
	@Override
	float getRateOfInterest(Float amount) {
		return amount*0.09f;
	}
}
