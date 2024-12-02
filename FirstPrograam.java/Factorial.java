public class Factorial {
	
	public static int printFacto(int n) {
		if(n==1 || n==0) {
			return 1;
		}
	int fact1=	printFacto(n-1);
	int fact= n*fact1;
	return fact;
	}
public static void main(String[] args) {
	int n =5;
	System.out.println(printFacto(n));
	
}
}
