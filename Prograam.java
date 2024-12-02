import java.util.Scanner;
public class Prograam {
   
        public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n= sc.nextInt();
	        int facto=1;
	        for(int i=n;i>0;i--){
	facto=i*facto;

	System.out.println(facto);
	        }
	    }
	
}