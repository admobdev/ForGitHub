import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("a uchun kichik qiymat: ");
        int a = sc.nextInt();
        System.out.print("b uchun katta qiymat: ");
        int b = sc.nextInt();

         for (int i = b - 1; i > a; i--){
             count++;
            System.out.println(i + " \t" + count + "");
        }
    }
}
