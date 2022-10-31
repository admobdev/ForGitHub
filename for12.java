import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("butun son kiriting: ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <=n; i++) {
           sum = (int) (sum * (i *(1 + 0.1 * i)));
            System.out.println( i + sum);
        }
    }
}

