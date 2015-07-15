package Skaiciai;
public class SkaiciaiLyginimas {
	public static final double EPSILON = 0.001;
	public static void main(String[] args) {
		
		System.out.println(arLygu(1.00001, 1));
		System.out.println(arLygu(1.01, 1));

	}
	
	public static boolean arLygu(double a, double b, double eps) {
		if (a == b)
			return true;
		return Math.abs(a - b) < eps;
	}
	
	public static boolean arLygu(double a, double b) {
		return arLygu(a, b, EPSILON);
	}

}