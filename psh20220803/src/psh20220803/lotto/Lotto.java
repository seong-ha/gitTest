package psh20220803.lotto;

public class Lotto {
	private int[] numArr1;
	private int[] numArr2;
	private int[] numArr3;
	private int[] numArr4;
	private int[] numArr5;
	
	public Lotto(int[] numArr1) {
		this.numArr1 = numArr1;
	}
	
	public Lotto(int[] numArr1, int[] numArr2) {
		this.numArr1 = numArr1;
		this.numArr2 = numArr2;
	}
	
	public Lotto(int[] numArr1, int[] numArr2, int[] numArr3) {
		this.numArr1 = numArr1;
		this.numArr2 = numArr2;
		this.numArr3 = numArr3;
	}
	
	public Lotto(int[] numArr1, int[] numArr2, int[] numArr3, int[] numArr4) {
		this.numArr1 = numArr1;
		this.numArr2 = numArr2;
		this.numArr3 = numArr3;
		this.numArr4 = numArr4;
	}
	
	public Lotto(int[] numArr1, int[] numArr2, int[] numArr3, int[] numArr4, int[] numArr5) {
		this.numArr1 = numArr1;
		this.numArr2 = numArr2;
		this.numArr3 = numArr3;
		this.numArr4 = numArr4;
		this.numArr5 = numArr5;
	}

	public int[] getNumArr1() {
		return numArr1;
	}

	public int[] getNumArr2() {
		return numArr2;
	}

	public int[] getNumArr3() {
		return numArr3;
	}

	public int[] getNumArr4() {
		return numArr4;
	}

	public int[] getNumArr5() {
		return numArr5;
	}
	
}
