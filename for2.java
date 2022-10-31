import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("a uchun qiymat: ");
        int a = sc.nextInt();
        System.out.print("b uchun qiymat: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++){
            count++;
            System.out.println(i + " \t" + count + "");
        }
    }
}
