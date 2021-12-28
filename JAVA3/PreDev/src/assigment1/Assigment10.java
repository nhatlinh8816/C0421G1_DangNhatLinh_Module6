package assigment1;

public class Assigment10 {
	private int var1;
	
	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public Assigment10(int var1) {
		this.var1 = var1;
	}


	public static void byPassValue(int i) {
		i = i + 2;
	}
	
	public void setVarAdd1(Assigment10 assigment10) {
		assigment10.setVar1(assigment10.getVar1()+1);
	}

	public static void main(String[] args) {
		int a = 5;
		System.out.println("before by pass value: "+a);
		byPassValue(a);
		System.out.println("after by pass value: "+a);
		Assigment10 assigment10 = new Assigment10(5);
		System.out.println("before by pass reference: "+assigment10.getVar1());
		assigment10.setVarAdd1(assigment10);
		System.out.println("after by pass reference: "+assigment10.getVar1());
	}

}
