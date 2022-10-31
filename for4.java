import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir kg shokolad narxi: ");
        double price = sc.nextInt();

        for (int i = 1; i <= 10 * price; i ++) {
            if (i <= 10) {
                System.out.println(i +  " " + "Kg " + i % 100 * price + " so'm");
            }
        }
    }
}
