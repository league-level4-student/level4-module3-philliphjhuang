package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws Exception{
		if(b==0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	
	public String reverseString(String a) {
		if(a.isEmpty()) {
			throw new IllegalStateException();
		}
		String r = "";
		for(int i = a.length()-1; i >= 0; i++) {
			r += a.charAt(i);
		}
		return r;
	}
}
