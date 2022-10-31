import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("butun son kiriting: ");
        int n = sc.nextInt();
        int sum = 0;
        double a, sign = -1;
		for (int i = 1; i <= n; i++) {
		a = 1 + 0.1 * i;
		sign *= -1;
		sum += a * sign;
	}
        System.out.println(sum);
		System.out.printf("% .1f",sum);
        }
    }


