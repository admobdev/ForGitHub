import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int k = sc.nextInt();
        System.out.print("kopayuvchi son kiriting:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(k);
        }
    }
}
