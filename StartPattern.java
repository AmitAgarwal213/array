import java.util.Scanner;

public class StartPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);4
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){}
            System.out.println("*");
            System.out.println("hello");
        }
    }
}
