import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a uchun qiymat: ");
        int a = sc.nextInt();
        System.out.print("b uchun qiymat: ");
        int b = sc.nextInt();

        int facto = 1;
        for (int i = a; i <= b; i++){
            facto = facto * i;
            System.out.println(facto + " ");
        }
    }
}
