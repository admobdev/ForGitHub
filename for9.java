import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a uchun qiymat: ");
        int a = sc.nextInt();
        System.out.print("b uchun qiymat: ");
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += Math.pow(i,2);
            System.out.println(sum + " ");
        }
    }
}
