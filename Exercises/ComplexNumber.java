public class ComplexNumber {
	private final double a;
	private final double b;
	
	public ComplexNumber(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public ComplexNumber times(ComplexNumber complexNumber) {
		double c = complexNumber.getReal();
		double d = complexNumber.getImag();
		double x = (a * c - b * d);
		double y = (b * c + a * d);
		return new ComplexNumber(x, y);
	}

	public ComplexNumber add(ComplexNumber complexNumber) {
		double c = complexNumber.getReal();
		double d = complexNumber.getImag();
		double x = (a + c);
		double y = (b + d);
		return new ComplexNumber(x, y);
	}

	public ComplexNumber minus(ComplexNumber complexNumber) {
		double c = complexNumber.getReal();
		double d = complexNumber.getImag();
		double x = (a - c);
		double y = (b - d);
		return new ComplexNumber(x, y);
	}

	public ComplexNumber div(ComplexNumber complexNumber) {
		double c = complexNumber.getReal();
		double d = complexNumber.getImag();
		double x = (a * c + b * d)/(c*c + d*d);
		double y = (b * c - a * d)/(c*c + d*d);
		return new ComplexNumber(x, y);
	}

	public double abs() {
		return Math.sqrt(a*a + b*b);
	}

	public ComplexNumber conjugate() {
		return new ComplexNumber(a, -b);
	}

	public ComplexNumber exponentialOf() {
		double x = Math.exp(a) * Math.cos(b);
		double y = Math.sin(b);
		return new ComplexNumber(x, y);
	}

	public double getReal() {
		return a;
	}

	public double getImag() {
		return b;
	}

}