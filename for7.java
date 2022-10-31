import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a uchun qiymat: ");
        int a = sc.nextInt();
        System.out.print("b uchun qiymat: ");
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            System.out.println(sum + " ");
        }
    }
}
