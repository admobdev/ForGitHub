import java.util.Scanner;

public class for16{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("butun son kiriting: ");
        int n = sc.nextInt();
        System.out.print("haqiqiy son kiriting: ");
        int a = sc.nextInt();
        int sum = 1;
        int count = 0;
        for (int i = 1; i <=n; i++) {
            sum *=a;

        }
        System.out.println(sum + count);
    }
}
