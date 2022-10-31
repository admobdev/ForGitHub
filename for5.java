import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir kg shokolad narxi: ");
        double price = sc.nextInt();

        for (float i = 0.1f; i <= 1; i+=0.1) {
                System.out.println(price * i);
            }
        }
    }

