package by.jb24.less05hw;

public class Fraction {

	private int m;
	private int n;

	public String mathFract() {
		double res = 0;
		if (this.n == 0) {
			return this.m + "/" + this.n + " = " + "Error";
		} else {
			res = this.m / this.n;
			if (this.m > this.n) {
				return this.m + " / " + this.n + " = " + res;
			}else {
				return this.m + " / " + this.n + " ≈ " + res;
			}
		}
	}

	public int getM() {
		return this.m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return this.n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
