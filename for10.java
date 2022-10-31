import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("butun son kiriting: ");
        int n = sc.nextInt();
        double sum = 0;
        for (double i = 1;i <= n; i++){
            sum +=1 / i;
            if (i % 10 == 0) {
                System.out.println(i + "\t" + sum);
            }
        }
    }
}
